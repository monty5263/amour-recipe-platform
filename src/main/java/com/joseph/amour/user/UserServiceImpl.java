package com.joseph.amour.user;

import java.util.List;

import com.joseph.amour.persistence.UserRepository;

public class UserServiceImpl implements UserService {

	private final UserRepository userRepository;

	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public User getUserById(Long id) {
		return userRepository.getReferenceById(id);
	}

	@Override
	public List<User> getSearchResults(String name) {
		return userRepository.findByNameContainingIgnoreCase(name);
	}

	@Override
	public void createUser() {
		
	}

	@Override
	public void deleteUser(Long id) {
		User user = userRepository.getReferenceById(id);
		userRepository.delete(user);
	}

}
