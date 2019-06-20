package com.gfg.mridul.SpringBootBackendService.controller;

import com.gfg.mridul.SpringBootBackendService.model.User;
import com.gfg.mridul.SpringBootBackendService.service.UserDaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController

public class UserController {
    @Autowired
    UserDaoService userDaoService;

    @GetMapping("/users")

    public List<User> getAllUsers(){



        ArrayList<User> userList = new ArrayList<User>();

        userList= (ArrayList<User>) userDaoService.findAllUsers();
        return userList;
    }

    @GetMapping("/user/{id}")

    public Optional<User> getUserById(@PathVariable("id") Long id){


        Optional<User> user =userDaoService.findUserById(id);



        return user;

    }

    @PostMapping("/user")

    public User createUser(@RequestBody User user){
        userDaoService.createUser(user);
        return user;
    }

    @PutMapping("/user")

    public User updateUserById(@RequestBody User user){

        userDaoService.updateUser(user);
        return user;
    }

    @DeleteMapping("/user/{id}")

    public void deleteUserById(@PathVariable("id") Long id){

        userDaoService.deleteUser(id);

    }

}
