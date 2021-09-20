package com.techment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techment.dto.UserDto;
import com.techment.entity.User;
import com.techment.repository.UserRepository;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	UserRepository repository;
	
	public UserDto login(String username, String password) {
		User user = repository.findByUsernameAndPassword(username, password).get() ;
		
		UserDto userDto = new UserDto(user.getName(), user.getPassword(), "token1");
		
		return userDto;
	}

}
