package com.tsinghuabigdata.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.tsinghuabigdata.dao.UserRepository;
import com.tsinghuabigdata.service.UserService;

public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;
	
	
}
