package com.joseph.amour.viewcontroller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.joseph.amour.recipe.Recipe;
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
		List<Recipe> recipes = recipeService.getAllRecipes();
		model.addAttribute("recipes", recipes);
		return "recipes";
	}

	@GetMapping("/login")
	public String login() {
		return "login";
	}

}
