package com.spring01.service.impl;

import com.spring01.dao.UserDao;
import com.spring01.dao.impl.MyUserDao;
import com.spring01.service.UserService;

public class UserServiceImpl implements UserService {
	
	// 满足依赖关系  强耦合
	// private UserDao userDao = new MyUserDao();
	private UserDao userDao;

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void deleteUser(Integer id) {
		System.out.println("delete User in SERVICE");
		userDao.deleteUser(id);
	}

}
