package com.joseph.amour.viewcontroller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.joseph.amour.user.User;
import com.joseph.amour.user.UserServiceImpl;

@Controller
@RequestMapping("/user")
public class UserController {

	// This controller is meant to handle user operations such as searching,
	// creating, updating and deleting recipes.

	/*
	 * ENDPOINTS NEEDED - User home page (cusomizable?) - User saved recipes - User
	 * profile page - User search - Recipe search (maybe combinable with user?) -
	 * Viewing another persons profile? - -
	 *
	 */

	private final UserServiceImpl userService;

	public UserController(UserServiceImpl userServiceImpl) {
		this.userService = userServiceImpl;
	}
	// View still needed.
	@GetMapping("/profile/{id}")
	public String viewUserProfile(Model model, @PathVariable Long id) {
		User user = userService.getUserById(id);
		model.addAttribute(user);
		return "user-profile";
	}
	// View still needed (? maybe)
	@GetMapping("/logout")
	public String logout() {
		return "index";
	}

	// View still needed.
	@GetMapping("/search")
	public String userSearch(@RequestParam("name") String name, Model model) {
		List<User> results = userService.getSearchResults(name);
		model.addAttribute(results);
		return "user-search";
	}
}
