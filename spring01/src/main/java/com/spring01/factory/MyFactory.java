 package com.spring01.factory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

// 工厂
// 1.加载配置文件
// 2.生产配置中记录的对应对象
public class MyFactory {
	private Properties properties = new Properties();
	public MyFactory(String config) throws IOException {
		InputStream resourceAsStream = MyFactory.class.getResourceAsStream(config);
		// 读取配置文件
		properties.load(resourceAsStream);
	}
	
	public Object getBean(String name) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		// 1.通过name，获取对应路径
		String classPath = properties.getProperty(name);
		// 2.反射 构建对象
		@SuppressWarnings("rawtypes")
		Class claz = Class.forName(classPath);
		return claz.newInstance();
	}
}
