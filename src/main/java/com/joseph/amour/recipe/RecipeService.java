package com.joseph.amour.recipe;

import java.util.List;

import org.springframework.stereotype.Service;

import com.joseph.amour.recipe.Recipe;

public interface RecipeService {

	public List<Recipe> getAllRecipes();

	public Recipe createRecipe(Recipe recipe);

	public void deleteRecipe(Recipe recipe);

	public List<Recipe> searchForRecipe(String search);

}
