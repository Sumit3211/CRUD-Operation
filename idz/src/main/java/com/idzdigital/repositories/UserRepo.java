package com.idzdigital.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.idzdigital.model.User;

public interface UserRepo extends JpaRepository<User,Integer>{

}
