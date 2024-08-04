package com.idzdigital.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.idzdigital.model.User;
import com.idzdigital.service.UserService;


@Controller
public class MainController {

  @Autowired
  private UserService userService;

  @GetMapping("/home")
  public String homePage(){
    System.out.println("this is home");
    return "home";
  }

  @PostMapping("/login")
  public String login( Model model ,@ModelAttribute User user){
    System.out.println("showing details of user");

    model.addAttribute("user",user);

    User result = userService.saveUser(user);
    System.out.println(result);
    System.out.println(user);
    return "details";
  }

  @GetMapping("/edit/{id}")
  public String editPage(@PathVariable("id") int id,Model model){

   Optional<User> user = userService.getUserById(id);

   model.addAttribute("user", user);

    return "edit";
  }

  @PostMapping("/update")
  public String updatePage(@ModelAttribute User user){

    User result = userService.updateUser(user,user.getId());

    System.out.println("updated result : "+ result);

    return "details";
  }


}
