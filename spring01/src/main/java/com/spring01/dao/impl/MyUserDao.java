package com.spring01.dao.impl;

import com.spring01.dao.UserDao;

public class MyUserDao implements UserDao {

	@Override
	public void deleteUser(Integer id) {
		System.out.println("hello world");
	}
	
}
