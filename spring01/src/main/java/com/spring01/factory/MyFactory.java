 package com.spring01.factory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

// ����
// 1.���������ļ�
// 2.���������м�¼�Ķ�Ӧ����
public class MyFactory {
	private Properties properties = new Properties();
	public MyFactory(String config) throws IOException {
		InputStream resourceAsStream = MyFactory.class.getResourceAsStream(config);
		// ��ȡ�����ļ�
		properties.load(resourceAsStream);
	}
	
	public Object getBean(String name) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		// 1.ͨ��name����ȡ��Ӧ·��
		String classPath = properties.getProperty(name);
		// 2.���� ��������
		@SuppressWarnings("rawtypes")
		Class claz = Class.forName(classPath);
		return claz.newInstance();
	}
}
