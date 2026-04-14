package com.joseph.amour.viewcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.joseph.amour.recipe.RecipeService;

@Controller
@RequestMapping("/recipes")
public class RecipeController {

	RecipeService recipeService;

	public RecipeController(RecipeService recipeService) {
		this.recipeService = recipeService;
	}

	public String recipes(Model model) {
		model.addAttribute("recipes", recipeService.getAllRecipes());
		return "recipes";
	}

	@GetMapping("/recipes/search")
	public String search(@RequestParam("name") String name, Model model) {
		model.addAttribute("recipes", recipeService.searchForRecipe(name));
		return "recipes";
	}
}
