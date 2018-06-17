package com.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "emp", schema = "hr")
public class Employee {
	@Column(name = "name")
	private String name;
	@Column(name = "age")
	private int age;
	@Column(name = "address")
	private String address;
	@Id
	/*@SequenceGenerator(name="EMPLOYEE_ENO_SEQ",sequenceName="EMPLOYEE_ENO_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="EMPLOYEE_ENO_SEQ")*/
	@Column(name = "mobile")
	private int mobile;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getMobile() {
		return mobile;
	}

	public void setMobile(int mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", address=" + address + ", mobile=" + mobile + "]";
	}

}
