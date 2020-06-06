package com.example.demo.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.Modelo.TsscTopic;
import com.example.demo.Service.TsscTopicServiceImp;
import com.example.demo.Validated.StoryValidated;
import com.example.demo.Validated.TopicValidated;


@Controller
public class TsscTopicController {
	
	
	/*
	 * Depency injections ________________________________________
	 */
	
	TsscTopicServiceImp  tsscTopicServiceImp;
	@Autowired
	public TsscTopicController(TsscTopicServiceImp  tsscTopicServiceImp) {
		// TODO Auto-generated constructor stub
		this.tsscTopicServiceImp = tsscTopicServiceImp;
	}
	/*
	 * ___________________________________________________________
	 */

	@GetMapping("/topics/")
	public String indexUser(Model model) {
		model.addAttribute("tsscTopics",tsscTopicServiceImp.findAll());
		return "topics/index";
	}

	@GetMapping("/topics/add")
	public String addTopic(Model model) {
		model.addAttribute("tsscTopic", new TsscTopic());
		return "/topics/add-topic";
	}

	@PostMapping("/topics/add")
	public String saveTopic( Model model, @Validated(TopicValidated.class)TsscTopic tsscTopic, BindingResult bindingResult,@RequestParam(value = "action", required = true) String action) {
		if (!action.equals("Cancel")) {
			if (bindingResult.hasErrors()) {
				
				model.addAttribute("nameTsscTopic", tsscTopic.getName());
				model.addAttribute("prefixTsscTopic", tsscTopic.getGroupPrefix());
				model.addAttribute("descriptionTsscTopic", tsscTopic.getDescription());
				model.addAttribute("DefaultGroupsTsscTopic", tsscTopic.getDefaultGroups());
				model.addAttribute("DefaultSprintsTsscTopic", tsscTopic.getDefaultSprints());

				return "topics/add-topic";
				
			} else {
				
				tsscTopicServiceImp.saveTopic(tsscTopic);
				return "redirect:/topics/";
			}
		} else {
				model.addAttribute("topics", tsscTopicServiceImp.findAll());
				return "topics/index";
		}

	}
	@GetMapping("/topics/edit/{id}")
	public String showUpdateForm(@PathVariable("id") long id, Model model) {
		
		TsscTopic tsscTopic = tsscTopicServiceImp.findByIdTsscTopic(id);
			if(tsscTopic == null) {
				throw new IllegalArgumentException("Invalid Topic Id:" + id);
			}
			
			model.addAttribute("tsscTopic", tsscTopic);
			model.addAttribute("nameTsscTopic", tsscTopic.getName());
			model.addAttribute("prefixTsscTopic", tsscTopic.getGroupPrefix());
			model.addAttribute("descriptionTsscTopic", tsscTopic.getDescription());
			model.addAttribute("DefaultGroupsTsscTopic", tsscTopic.getDefaultGroups());
			model.addAttribute("DefaultSprintsTsscTopic", tsscTopic.getDefaultSprints());
			
			return "topics/update-topic";
			
	}
	
	@PostMapping("/topics/edit/{id}")
	public String updateTopic(Model model,@PathVariable("id") long id, @RequestParam(value="action", required = true) String action,@Validated(TopicValidated.class) TsscTopic tsscTopic, BindingResult bindingResult) {
		if(action != null && !action.equals("Cancel")) {
			tsscTopicServiceImp.saveTopic(tsscTopic);
		}
		
		if(bindingResult.hasErrors()) {
			model.addAttribute("nameTsscTopic", tsscTopic.getName());
			model.addAttribute("prefixTsscTopic", tsscTopic.getGroupPrefix());
			model.addAttribute("descriptionTsscTopic", tsscTopic.getDescription());
			model.addAttribute("DefaultGroupsTsscTopic", tsscTopic.getDefaultGroups());
			model.addAttribute("DefaultSprintsTsscTopic", tsscTopic.getDefaultSprints());
			return "topic/update-topic";
		}
		
		if (action.equals("Cancel")) {
			return "redirect:/topics/";
		}
		return "redirect:/topics/";
	}
	
	@GetMapping("/topics/del/{id}")
	
	public String deleteTopic(@PathVariable("id") long id) {
		TsscTopic tsscTopic = tsscTopicServiceImp.findByIdTsscTopic(id);
		tsscTopicServiceImp.deleteTsscTopic(tsscTopic);
		
		return "redirect:/topics/";
	}
	
	
	
	
}
