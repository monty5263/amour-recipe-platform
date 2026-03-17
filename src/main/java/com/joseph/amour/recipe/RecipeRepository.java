package com.joseph.amour.recipe;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeRepository extends JpaRepository<Recipe, Long> {
	
	List<Recipe> findByNameContainingIgnoreCase(String name);
	
	List<Recipe> findByCategory(String category);
	
	List<Recipe> findByCategory(String category, String tag);
	
	List<Recipe> findByUser(String user);

}
