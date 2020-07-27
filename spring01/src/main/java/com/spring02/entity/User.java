package com.spring02.entity;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class User {
	private Integer id;
	private String password;
	private String sex;
	private Integer age;
	private Date bornDate;
	private String[] hobbys;
	private Set<String> phones;
	private List<String> names;
	private Map<String, String> countries;
	private Properties files;
	private Address address;
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		System.out.println("set address");
		this.address = address;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Date getBornDate() {
		return bornDate;
	}
	public void setBornDate(Date bornDate) {
		this.bornDate = bornDate;
	}
	public String[] getHobbys() {
		return hobbys;
	}
	public void setHobbys(String[] hobbys) {
		this.hobbys = hobbys;
	}
	public Set<String> getPhones() {
		return phones;
	}
	public void setPhones(Set<String> phones) {
		this.phones = phones;
	}
	public List<String> getNames() {
		return names;
	}
	public void setNames(List<String> names) {
		this.names = names;
	}
	public Map<String, String> getCountries() {
		return countries;
	}
	public void setCountries(Map<String, String> countries) {
		this.countries = countries;
	}
	public Properties getFiles() {
		return files;
	}
	public void setFiles(Properties files) {
		this.files = files;
	}
}
