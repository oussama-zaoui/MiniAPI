package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/users")
public class UserController {


    /*@GetMapping("")
    @ResponseBody
    public String affiche(){
        return
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
    public User getById(@PathVariable("id") String id){
        Optional<User> users=this.userRepository.findById(id);
        return users.get();
    }

    @GetMapping("/all")
    public List<User> getAll(){
    List<User> users=this.userRepository.findAll();
      return users;
    }






}
