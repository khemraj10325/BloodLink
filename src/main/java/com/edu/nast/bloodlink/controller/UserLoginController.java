package com.edu.nast.bloodlink.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edu.nast.bloodlink.entity.UserLogin;
import com.edu.nast.bloodlink.repository.UserLoginRepository;
@RestController
@RequestMapping("/userlogin")
public class UserLoginController {
  @Autowired
  private UserLoginRepository userLoginRepo;
  
  @GetMapping
  public List<UserLogin> displayUsers()
  {
	  return(userLoginRepo.findAll());
  }
  
  @PostMapping 
  public UserLogin createUsers(@RequestBody UserLogin userLogin){
	  System.out.println("The phone number is");
	  System.out.println(userLogin.getPhoneNo());
	  return(userLoginRepo.save(userLogin));
  }
}
