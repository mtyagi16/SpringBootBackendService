package com.gfg.mridul.SpringBootBackendService.repository;



import com.gfg.mridul.SpringBootBackendService.model.User;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;



@Repository

public interface UserRepository extends JpaRepository<User,Long> {





}