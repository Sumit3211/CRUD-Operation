package com.idzdigital.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.ResourceAccessException;

import com.idzdigital.model.User;
import com.idzdigital.repositories.UserRepo;
import com.idzdigital.service.UserService;

@Service
public class UserServiceImpl implements UserService{

  @Autowired
  private UserRepo repo; 

  @Override
  public User saveUser(User user) {
    
    return repo.save(user);
  }

  @Override
  public Optional<User> getUserById(int id) {

    Optional<User> result = repo.findById(id);
    
    return result;
  }
  
  @Override
  public User updateUser(User user, int id) {
    User result = repo.findById(id).orElseThrow(() -> new ResourceAccessException("User info is not available or id is invalid"));

    result.setName(user.getName());
    result.setBirthDate(user.getBirthDate());

    result.setEmail(user.getEmail());

    return repo.save(result);
  }





}
