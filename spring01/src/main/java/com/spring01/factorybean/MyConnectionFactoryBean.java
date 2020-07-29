package com.spring01.factorybean;

import java.sql.Connection;
import java.sql.DriverManager;

import org.springframework.beans.factory.FactoryBean;

public class MyConnectionFactoryBean implements FactoryBean<Connection> {

	@Override
	public Connection getObject() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/movies", "root", "a");
		return conn;
	}

	@Override
	public Class<?> getObjectType() {
		return Connection.class;
	}
	
	@Override
	public boolean isSingleton() {
		return FactoryBean.super.isSingleton();
	}
	
}
