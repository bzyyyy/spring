package com.spring01.dao.impl;

import com.spring01.dao.UserDao;

public class UserDaoImpl implements UserDao {

	@Override
	public void deleteUser(Integer id) {
		System.out.println("delete User in DAO");
	}

}
