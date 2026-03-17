package com.joseph.amour.recipe;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public class RecipeService {

	private RecipeRepository recipeRepository;

	public RecipeService(RecipeRepository recipeRepository) {
		this.recipeRepository = recipeRepository;
	}

	public List<Recipe> getAllRecipes() {
		return recipeRepository.findAll();
	}

	public Recipe createRecipe(Recipe recipe) {
		return recipeRepository.save(recipe);
	}

	public void deleteRecipe(Recipe recipe) {
		recipeRepository.delete(recipe);
	}

	public List<Recipe> searchForRecipe(String search) {
		return recipeRepository.findByNameContainingIgnoreCase(search);
	}

}
