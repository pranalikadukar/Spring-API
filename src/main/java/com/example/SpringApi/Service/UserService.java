package com.example.SpringApi.Service;

import java.util.List;



import com.example.SpringApi.User;

public interface UserService {

	List<User> getAllUser();
	User findUser(Long Id);
	User Create(User user);
	User Update(Long Id,User user);
	void delete(Long Id);
}
