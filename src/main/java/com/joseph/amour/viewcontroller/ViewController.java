package com.joseph.amour.viewcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.joseph.amour.recipe.RecipeService;

@Controller
@RequestMapping("/")
public class ViewController {

	private final RecipeService recipeService;

	public ViewController(RecipeService recipeService) {
		this.recipeService = recipeService;
	}

	public String navbar() {
		return "navbar";
	}

	@GetMapping("/home")
	public String home() {
		
		return "index";
	}

	@GetMapping("/recipes")
	public String recipes(Model model) {
		model.addAttribute("recipes", recipeService.getAllRecipes());
		return "recipes";
	}

	@GetMapping("/login")
	public String login() {
		return "login";
	}

	@GetMapping("/recipes/search")
	public String search(@RequestParam("name") String name, Model model) {
		model.addAttribute("recipes", recipeService.searchForRecipe(name));
		return "recipes";
	}

}
