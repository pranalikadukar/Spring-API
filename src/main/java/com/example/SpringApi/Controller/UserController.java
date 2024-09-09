package com.example.SpringApi.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringApi.User;
import com.example.SpringApi.Service.UserService;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
public class UserController {
@Autowired
	 private UserService UserService;

@GetMapping("/Users")
	public List<User> getAllUser(){
		 return UserService.getAllUser();
	}


@GetMapping("/Users/{Id}")
public User findUser(@PathVariable Long Id ) {
	  return UserService.findUser(Id);
}

@PostMapping("/Users")
public User CreateUser(@RequestBody User user) {
	return UserService.Create(user);
}
 @PutMapping("Users/{Id}")
 public User Update(@PathVariable Long Id , @RequestBody User user){
     
     return UserService.Update(Id, user);
 }
  @DeleteMapping("/Users/{Id}")
  public void delete(@PathVariable Long Id , @RequestBody User user){
	  UserService.delete(Id);
  }

}
