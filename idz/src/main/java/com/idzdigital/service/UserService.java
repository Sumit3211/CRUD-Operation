package com.idzdigital.service;

import java.util.Optional;

import com.idzdigital.model.User;

public interface UserService {

  User saveUser(User user);
  Optional<User> getUserById(int id);
  User updateUser(User user,int id);
  
}
