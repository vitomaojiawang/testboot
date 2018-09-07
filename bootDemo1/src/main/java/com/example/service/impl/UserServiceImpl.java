package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.mapper.UserMapper;
import com.example.pojo.User;
import com.example.service.IUserService;
@Service
public class UserServiceImpl implements IUserService{
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public List<User> selectUsers() {
		// TODO Auto-generated method stub
		return userMapper.selectAllUsers();
	}
	@Transactional
	@Override
	public int insertUsers(User user) {
		int i = 0;
		i =i + userMapper.insertUser(user);
		int num = 1/0;
		i =i + userMapper.insertUser(user);
		return i;
	}

}
