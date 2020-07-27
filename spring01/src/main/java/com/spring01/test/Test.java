package com.spring01.test;

import java.io.IOException;

import com.spring01.dao.UserDao;
import com.spring01.factory.MyFactory;
import com.spring01.service.UserService;

public class Test {
	public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
		// 创建工厂对象
		MyFactory myFactory = new MyFactory("/bean.properties");
		// 从工厂中获取对象
		UserDao ud = (UserDao) myFactory.getBean("userDao");
		UserService us = (UserService) myFactory.getBean("userService");
		
		ud.deleteUser(1);
		us.deleteUser(1);
	}
}
