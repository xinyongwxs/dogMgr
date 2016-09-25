package com.wxs.management.services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import com.wxs.management.models.User;
import com.wxs.management.services.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	private static final AtomicLong counter = new AtomicLong();
	
	private static List<User> users;
	
	@Override
	public User findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveUser(User user) {
		// TODO Auto-generated method stub
       user.setId(counter.incrementAndGet());
       users.add(user);
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUserById(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<User> findAllUsers() {
		// TODO Auto-generated method stub
		User test1 = new User(123L, "wxs", 21, "high");
		List<User> result = new ArrayList<User>();
		result.add(test1);
		return result;
	}

	@Override
	public void deleteAllUsers() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isUserExist(User user) {
		// TODO Auto-generated method stub
		return false;
	}

}
