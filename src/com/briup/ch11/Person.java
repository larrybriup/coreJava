package com.briup.ch11;

import java.io.Serializable;

public class Person implements Serializable {
	private static final long serialVersionUID = -7340891025325843588L;
	private String name;
	private int id;
	private boolean gender;
	private int age;

	public Person() {
	}

	public Person(String name, int id, boolean gender, int age) {
		super();
		this.name = name;
		this.id = id;
		this.gender = gender;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
