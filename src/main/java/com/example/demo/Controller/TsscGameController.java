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

import com.example.demo.Modelo.TsscGame;
import com.example.demo.Service.TsscGameServiceImp;
import com.example.demo.Service.TsscTopicServiceImp;
import com.example.demo.Validated.GameValidated;





@Controller
public class TsscGameController {
	
	/*
	 * Dependency injections_______________________________________________
	 */
	
	TsscGameServiceImp tsscGameServiceImp ;
	
	TsscTopicServiceImp tsscTopicServiceImp;
	@Autowired
	public TsscGameController(TsscGameServiceImp tsscGameServiceImp,TsscTopicServiceImp tsscTopicServiceImp) {
		// TODO Auto-generated constructor stub
		this.tsscGameServiceImp = tsscGameServiceImp;
		this.tsscTopicServiceImp = tsscTopicServiceImp;
	}
	
	/*
	 * ____________________________________________________________________
	 */
	
	
	
	@GetMapping("/games/list/{id}")
	public String showListStories(@PathVariable("id") long id, Model model) {
		TsscGame tsscGame = tsscGameServiceImp.findByIdTsscGame(id);
		model.addAttribute("tsscGame", tsscGame);
		model.addAttribute("stories", tsscGame.getTsscStories());
		return "games/stories";
	}
	@GetMapping("/games/")
	public String indexGame(Model model) {
		model.addAttribute("tsscGames", tsscGameServiceImp.findAll());
		return "games/index";
	}

	@GetMapping("/games/add")
	public String addGame(Model model) {
		
		model.addAttribute("tsscGame", new TsscGame());
		model.addAttribute("tsscTopics", tsscTopicServiceImp.findAll());
		
		return "games/add-game";
	}

	@PostMapping("/games/add")
	public String saveGame(@Validated(GameValidated.class)  TsscGame tsscGame, BindingResult bindingResult, @RequestParam(value = "action", required = true) String action, Model model) {

		if (!action.equals("Cancel")) {
			if (bindingResult.hasErrors()) {

				model.addAttribute("nameTsscGame", tsscGame.getName());
				model.addAttribute("nGroupsTsscGame", tsscGame.getNGroups());
				model.addAttribute("nSprintsTsscGame", tsscGame.getNSprints());
				model.addAttribute("scheduledDateTsscGame", tsscGame.getScheduledDate());
				model.addAttribute("scheduledTimeTsscGame", tsscGame.getScheduledTime());
				model.addAttribute("adminPasswordTsscGame", tsscGame.getAdminPassword());
				model.addAttribute("userPasswordTsscGame", tsscGame.getUserPassword());
				model.addAttribute("guestPasswordTsscGame", tsscGame.getGuestPassword());
				model.addAttribute("tsscTopics", tsscTopicServiceImp.findAll());

				return "games/add-game";
			} else {

			

					if (tsscGame.getTsscTopic() == null) {

						tsscGameServiceImp.saveGame(tsscGame, false, 0L);

					} else {

						tsscGameServiceImp.saveGame(tsscGame, true,tsscGame.getTsscTopic().getId());
					}

				

				return "redirect:/games/";
			}
		} else {

			model.addAttribute("games", tsscGameServiceImp.findAll());
			return "games/index";
		}

	}
	@GetMapping("/games/edit/{id}")
	public String showUpdateForm(@PathVariable("id") Long id, Model model) {
		TsscGame tsscGame = tsscGameServiceImp.findByIdTsscGame(id);
		
		model.addAttribute("tsscGame", tsscGame);
		model.addAttribute("nameTsscGame", tsscGame.getName());
		model.addAttribute("nGroupsTsscGame", tsscGame.getNGroups());
		model.addAttribute("nSprintsTsscGame", tsscGame.getNSprints());
		model.addAttribute("scheduledDateTsscGame", tsscGame.getScheduledDate());
		model.addAttribute("scheduledTimeTsscGame", tsscGame.getScheduledTime());
		model.addAttribute("adminPasswordTsscGame", tsscGame.getAdminPassword());
		model.addAttribute("userPasswordTsscGame", tsscGame.getUserPassword());
		model.addAttribute("guestPasswordTsscGame", tsscGame.getGuestPassword());
		model.addAttribute("tsscTopics", tsscTopicServiceImp.findAll());
		
		return "games/update-game";
		
		
	}
	
	@PostMapping("/games/edit/{id}")
	public String updateGame(Model model, @PathVariable("id") Long id, @RequestParam(value = "action", required = true) String action , @Validated(GameValidated.class)TsscGame tsscGame ,BindingResult bindingResult) {
		if(action != null && !action.equals(" ")) {
			
			if (tsscGame.getTsscTopic() == null) {
				tsscGameServiceImp.saveGame(tsscGame,false, 0L);
			}else {
				tsscGameServiceImp.saveGame(tsscGame, true, tsscGame.getTsscTopic().getId());
				
			}
			
		}
		
		if(bindingResult.hasErrors()) {
			
			model.addAttribute("nameTsscGame", tsscGame.getName());
			model.addAttribute("nGroupsTsscGame", tsscGame.getNGroups());
			model.addAttribute("nSprintsTsscGame", tsscGame.getNSprints());
			model.addAttribute("scheduledDateTsscGame", tsscGame.getScheduledDate());
			model.addAttribute("scheduledTimeTsscGame", tsscGame.getScheduledTime());
			model.addAttribute("adminPasswordTsscGame", tsscGame.getAdminPassword());
			model.addAttribute("userPasswordTsscGame", tsscGame.getUserPassword());
			model.addAttribute("guestPasswordTsscGame", tsscGame.getGuestPassword());
			model.addAttribute("tsscTopics", tsscTopicServiceImp.findAll());
			
			return "games/update-game";
		}
		
		
		if (action.equals("Cancel")) {

			return "redirect:/games/";
		}
		
		return "redirect:/games/";
	}
	
	@GetMapping("/games/del/{id}")
	public String deleteGame(@PathVariable("id") Long id) {
		TsscGame tsscGame = tsscGameServiceImp.findByIdTsscGame(id);
		tsscGameServiceImp.deleteTsscGame(tsscGame);
		
		return "redirect:/games/";
	}

	
	
			

}
