package com.spring02.entity;

public class Address {
	private Integer id;
	private String city;
	public Address() {
		System.out.println("Address �����췽��");
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		System.out.println("Address SetId");
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public void init_qf() {
		System.out.println("Address ��ʼ��");
	}
	
	public void destroy_qf() {
		System.out.println("Address ����");
	}
}
