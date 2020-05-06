package com.gl.userManagementApp.controller;

import java.net.URI;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.gl.userManagementApp.dto.User;
import com.gl.userManagementApp.service.UserService;

@RestController
public class UserController {
	Logger log=LoggerFactory.getLogger("UserManagementApp");//getLogger(name:"UserManagementApp");
	@Autowired
	private UserService userService;

	@GetMapping("/user")
	public List<User> getAllUsers() {
		log.info("getting all users.....");
		return userService.getAllUsers();
	}

	@GetMapping("/user/{id}")
	public User getUser(@PathVariable String id) {
		return userService.getUser(id);
	}
    
	@PostMapping("/user")
	public ResponseEntity<Object> addUser(@RequestBody User user) {
		userService.addUser(user);
		URI Path = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(user.getId()).toUri();
		return ResponseEntity.created(Path).build();

	}
	
	@PutMapping("/user")
	public User updateUser(@RequestBody User user) {
		return userService.updateUser(user);
	}
	
	@DeleteMapping("/user/{id}")
	public User deleteUser(@PathVariable String id) {
		return userService.deleteUser(id);
	}

}
