package com.example.SpringApi.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.SpringApi.User;
import com.example.SpringApi.Repository.UserDao;
@Service
@Transactional
public class UserServiceImpl implements UserService {
@Autowired
	private UserDao UserRepo;
	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return UserRepo.findAll();
	}

	@Override
	public User findUser(Long Id) {
		// TODO Auto-generated method stub
		return UserRepo.findById(Id).get();
	}

	@Override
	public User Create(User user) {
		// TODO Auto-generated method stub
		return UserRepo.save(user);
	}

	@Override
	public User Update(Long Id, User user) {
		// TODO Auto-generated method stub
		  Optional<User> existingUserOptional = UserRepo.findById(Id);
		    
		    
		    if(existingUserOptional.isPresent()) {
		        User existingUser = existingUserOptional.get();
		        
		        existingUser.setName(user.getName());
		        existingUser.setCity(user.getCity());
		        
		        return UserRepo.save(existingUser);
		    }
		return null;
	}

	@Override
	public void delete(Long Id) {
		// TODO Auto-generated method stub
		 UserRepo.deleteById(Id);
	}

	


	
	
	
	
}
