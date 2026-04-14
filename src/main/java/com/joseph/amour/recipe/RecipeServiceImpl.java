package com.joseph.amour.recipe;

import java.util.List;

import org.springframework.stereotype.Service;

import com.joseph.amour.persistence.RecipeRepository;

@Service
public class RecipeServiceImpl implements RecipeService {

	private final RecipeRepository recipeRepository;

	public RecipeServiceImpl(RecipeRepository recipeRepository) {
		this.recipeRepository = recipeRepository;
	}

	@Override
	public List<Recipe> getAllRecipes() {
		List<Recipe> allRecipes = recipeRepository.findAll();
		return allRecipes;
	}

	@Override
	public Recipe createRecipe(Recipe recipe) {
		return recipeRepository.save(recipe);
	}

	@Override
	public void deleteRecipe(Recipe recipe) {
		recipeRepository.delete(recipe);
	}

	//
	@Override
	public List<Recipe> searchForRecipe(String search) {
		List<Recipe> foundRecipes = recipeRepository.findByNameContainingIgnoreCase(search);
		return foundRecipes;
	}

}
