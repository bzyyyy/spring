package com.spring01.test;

import java.io.IOException;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring01.dao.UserDao;
import com.spring01.service.UserService;
import com.spring02.entity.User;

public class SpringFactory {
	
	@Test
	public void testSpringFactory() throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
		// 启动工厂
		ApplicationContext context = new ClassPathXmlApplicationContext("/spring-context.xml");
		
		// 获取对象
		// UserDao userDao = (UserDao) context.getBean("userDao");
		UserService userService = (UserService) context.getBean("userService");
		// userDao.deleteUser(1);
		userService.deleteUser(2);
	}
	
	@Test
	public void testSet() {
		
		// 启动工厂
		ApplicationContext context = new ClassPathXmlApplicationContext("/spring-context.xml");
		User user = (User) context.getBean("user");
		System.out.println("==================");
		System.out.println(user.getId());
		System.out.println(user.getPassword());
		System.out.println(user.getSex());
		System.out.println(user.getAge());
		System.out.println(user.getBornDate());
		System.out.println(user.getHobbys());
		System.out.println(user.getNames());
		System.out.println(user.getPhones());
		System.out.println(user.getCountries());
		System.out.println(user.getFiles());
		System.out.println(user.getAddress().getId() + ":" + user.getAddress().getCity());
	}
}
