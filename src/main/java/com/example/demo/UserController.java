package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@RequestMapping("/users")
public class UserController {

/*
    @GetMapping("/")
    @ResponseBody
    public String affiche(){
        return "hahahah";
    }*/
private UserRepository userRepository;

public UserController(UserRepository userRepository){
    this.userRepository=userRepository;
}

    @PostMapping
    public void update(@RequestBody User user){
        this.userRepository.save(user);
    }

    @GetMapping("/{id}")
    @ResponseBody
    public String getById(@PathVariable("id") String id){
        Optional<User> users=this.userRepository.findById(id);
        return users.get().getMessage();
    }






}
