package com.joseph.amour.user;

import java.util.List;

public interface UserService {

	public List<User> getSearchResults(String name);

	// Parameters needed.
	public void createUser();

	public void deleteUser(Long id);

}
