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

import com.example.demo.Modelo.TsscStory;
import com.example.demo.Service.TsscGameServiceImp;
import com.example.demo.Service.TsscStoryServiceImp;
import com.example.demo.Validated.GameValidated;
import com.example.demo.Validated.StoryValidated;

@Controller
public class TsscStoryController {
	
	
	/*
	 * Dependency injections_____________________________________________
	 */
	
	
	private TsscGameServiceImp tsscGameServiceImp ;
	
	private TsscStoryServiceImp tsscStoryServiceImp; 
	
	@Autowired
	public TsscStoryController(TsscGameServiceImp tsscGameServiceImp,TsscStoryServiceImp tsscStoryServiceImp) {
		// TODO Auto-generated constructor stub
			this.tsscGameServiceImp = tsscGameServiceImp;
			this.tsscStoryServiceImp= tsscStoryServiceImp;
			
	}
	
	/*
	 * __________________________________________________________________
	 */
	
	@GetMapping("/stories/")
	public String indexStory(Model model) {
		model.addAttribute("tsscStories", tsscStoryServiceImp.findAll());
		return "stories/index";
	}
	@GetMapping("/stories/add")
	public String addStory(Model model) {
		model.addAttribute("tsscStory", new TsscStory());
		model.addAttribute("games", tsscGameServiceImp.findAll());
		return "stories/add-story";
	}

	@PostMapping("/stories/add")
	public String saveStory(  Model model,@Validated(StoryValidated.class)TsscStory tsscStory, BindingResult bindingResult,
			@RequestParam(value = "action", required = true) String action) {

		if (!action.equals("Cancel")) {
			if (bindingResult.hasErrors()) {

				model.addAttribute("descriptionTsscStory", tsscStory.getDescription());
				model.addAttribute("businessValueTsscStory", tsscStory.getBusinessValue());
				model.addAttribute("initialSprintTsscStory", tsscStory.getInitialSprint());
				model.addAttribute("priorityTsscStory", tsscStory.getPriority());
				model.addAttribute("tsscGames",tsscGameServiceImp.findAll());

				return "stories/add-stories";
			} else {

					tsscGameServiceImp.findByIdTsscGame(tsscStory.getTsscGame().getId()).getTsscStories().add(tsscStory);		
					tsscStoryServiceImp.saveStory(tsscStory, tsscStory.getTsscGame().getId());

				return "redirect:/stories/";
			}
		} else {

			model.addAttribute("stories", tsscStoryServiceImp.findAll());
			return "stories/index";
		}

	}

	
	@GetMapping("/stories/edit/{id}")
	public String showUpdateForm(Model model,@PathVariable("id") long id) {
		TsscStory tsscStory = tsscStoryServiceImp.findByIdTsscStory(id);

		if (tsscStory == null)
			throw new IllegalArgumentException("Invalid story Id:" + id);
		model.addAttribute("tsscStory", tsscStory);
		model.addAttribute("descriptionTsscStory", tsscStory.getDescription());
		model.addAttribute("businessValueTsscStory", tsscStory.getBusinessValue());
		model.addAttribute("initialSprintTsscStory", tsscStory.getInitialSprint());
		model.addAttribute("priorityTsscStory", tsscStory.getPriority());
		model.addAttribute("tsscGames",tsscGameServiceImp.findAll());
		return "stories/update-story";
	}
	
	
	@PostMapping("stories/edit/{id}")
	public String updateStory(@PathVariable("id") long id,
			@RequestParam(value = "action", required = true) String action,
			@Validated(StoryValidated.class) TsscStory tsscStory, BindingResult bindingResult, Model model) {

		if (action.equals("Cancel")) {

			return "redirect:/stories/";
		}

		if (bindingResult.hasErrors()) {

			model.addAttribute("descriptionTsscStory", tsscStory.getDescription());
			model.addAttribute("businessValueTsscStory", tsscStory.getBusinessValue());
			model.addAttribute("initialSprintTsscStory", tsscStory.getInitialSprint());
			model.addAttribute("priorityTsscStory", tsscStory.getPriority());
			model.addAttribute("tsscGames",tsscGameServiceImp.findAll());
			
			return "stories/update-story";
		}

		if (action != null && !action.equals("Cancel")) {

			try {
				tsscStoryServiceImp.saveStory(tsscStory, tsscStory.getTsscGame().getId());
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

		return "redirect:/stories/";
	}
	@GetMapping("/stories/del/{id}")
	public String deleteGame(@PathVariable("id") long id) {
		TsscStory tsscStory = tsscStoryServiceImp.findByIdTsscStory(id);
		tsscStoryServiceImp.deleteTsscStory(tsscStory);
		return "redirect:/stories/";
	}

	
	

}
