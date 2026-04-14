package com.joseph.amour.viewcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.joseph.amour.recipe.RecipeServiceImpl;

@Controller
@RequestMapping("/")
public class NavController {

	// This controller is specifically meant to handle basic user navigation to the
	// main front pages
	// of the website. (Login, Logout, Front Page, About, Contact, Email)

	public String navbar() {
		return "navbar";
	}

	@GetMapping("/home")
	public String home() {
		return "index";
	}

	@GetMapping("/login")
	public String login() {
		return "login";
	}

}
