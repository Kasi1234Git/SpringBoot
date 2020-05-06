package com.gl.userManagementApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.userManagementApp.dto.User;
import com.gl.userManagementApp.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return userRepository.getAllUsers();
	}

	@Override
	public User getUser(String id) {
		// TODO Auto-generated method stub
		return userRepository.getUser(id);
	}

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		userRepository.addUser(user);
		
	}

	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.updateUser(user);
	}

	@Override
	public User deleteUser(String id) {
		// TODO Auto-generated method stub
		return userRepository.deleteUser(id);
	}

}
