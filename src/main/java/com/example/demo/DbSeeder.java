package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


import java.util.Arrays;
import java.util.List;

@Component
public class DbSeeder implements CommandLineRunner {

private UserRepository userRepository;



public DbSeeder(UserRepository userRepository){
    this.userRepository=userRepository;
}
    @Override
    public void run(String... args) throws Exception {
     //User oussama =new User("oussama","je suis ouss");
     //User adel=new User("adel","huumm");

       // this.userRepository.deleteAll();

       // List<User> users=Arrays.asList(oussama,adel);

       // this.userRepository.saveAll(users);



    }


}
