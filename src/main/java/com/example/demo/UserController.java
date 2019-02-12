package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/")
public class UserController
{
	private UserRepository userRepository;

	public UserController(UserRepository userRepository)
	{
		this.userRepository=userRepository;
	}

	@PostMapping
	public void update(@RequestBody User user)
	{
		this.userRepository.save(user);
	}

	@GetMapping("/users/{id}")
	public User getById(@PathVariable("id") String id)
	{
		Optional<User> users=this.userRepository.findById(id);
		return users.get();
	}

	@GetMapping("/users/all")
	public List<User> getAll()
	{
		List<User> users=this.userRepository.findAll();
		return users;
	}


}
