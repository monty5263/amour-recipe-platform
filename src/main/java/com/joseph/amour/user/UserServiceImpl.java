package com.joseph.amour.user;

import com.joseph.amour.persistence.UserRepository;

public class UserServiceImpl implements UserService {

	private final UserRepository userRepository;

	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public User getUserById(Long id) {
		return userRepository.getReferenceById(id);
	}

}
