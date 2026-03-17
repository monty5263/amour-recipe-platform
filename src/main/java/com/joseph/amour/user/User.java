package com.joseph.amour.user;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "users")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(nullable = false, unique = true, length = 30)
	private String userName;
	
	@Column(nullable = false)
	private String passwordHash;
	
	@Column(nullable = false, unique = true, length = 50)
	private String email;
	
	@Column(nullable = false)
	private LocalDateTime dateCreated;
	

}
