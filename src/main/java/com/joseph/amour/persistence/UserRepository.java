package com.joseph.amour.persistence;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joseph.amour.recipe.Recipe;
import com.joseph.amour.user.User;

public interface UserRepository extends JpaRepository<User, Long> {

	List<Recipe> findByNameContainingIgnoreCase(String name);

}
