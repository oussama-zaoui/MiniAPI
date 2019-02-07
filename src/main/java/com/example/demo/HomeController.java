package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@Controller
@RequestMapping("/index")
public class HomeController
{
	@RequestMapping(method=RequestMethod.GET)
	public String welcome()
	{
		return "home.html";
	}
}
