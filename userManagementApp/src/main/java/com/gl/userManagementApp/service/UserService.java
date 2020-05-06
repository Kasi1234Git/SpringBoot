package com.gl.userManagementApp.service;

import java.util.List;

import com.gl.userManagementApp.dto.User;

public interface UserService {
	public List<User> getAllUsers();
	public User getUser(String id);
	void addUser(User user);
	User updateUser(User user);
	User deleteUser(String id);

}
