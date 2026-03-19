package com.joseph.amour.recipe;

import jakarta.persistence.ManyToOne;

public class RecipeIngredients {

	@ManyToOne
	Recipe recipe;

	@ManyToOne
	Ingredient ingredients;
	
	

}
