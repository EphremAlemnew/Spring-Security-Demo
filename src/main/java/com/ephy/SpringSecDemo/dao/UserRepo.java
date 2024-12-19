package com.ephy.SpringSecDemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ephy.SpringSecDemo.model.User;

public interface UserRepo extends JpaRepository<User, Integer> {

    User findByUsername(String username);
    

}
