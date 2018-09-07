package com.example.service;

import java.util.List;

import com.example.pojo.User;

public interface IUserService {
	
	List<User> selectUsers();
	
	int insertUsers(User user);
}
