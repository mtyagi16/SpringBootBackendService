package com.gfg.mridul.SpringBootBackendService.service;





import com.gfg.mridul.SpringBootBackendService.model.User;

import com.gfg.mridul.SpringBootBackendService.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;



import java.util.List;

import java.util.Optional;

@ComponentScan(basePackages = "com.gfg.mridul.SpringBootBackendService.repository")
@Component
@Service

public class UserDaoService {


    @Autowired

    UserRepository userRepository;











    public List<User> findAllUsers(){



        List users=userRepository.findAll();

        return (users);





    }



    public Optional<User> findUserById(Long id){



        Optional<User> user=userRepository.findById(id);

        return user;



    }



    public User createUser(User user){



        userRepository.save(user);

        return (user);

    }



    public User updateUser(User user){



        user.setFirstName(user.getFirstName());

        user.setLastName(user.getLastName());

        userRepository.save(user);

        return user;

    }



    public void deleteUser(Long id){







        userRepository.deleteById(id);

    }



}