package com.jpa.springsecurity.service;

import org.springframework.stereotype.Service;

import com.jpa.springsecurity.entity.UserDtls;

@Service
public interface UserService {
	public UserDtls createUser(UserDtls user);
	public boolean checkEmail(String email);
}
