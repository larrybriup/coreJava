package com.briup.ch05;

public class Student{

	private String name;
	private String gender;
	private int age;
	private Address address;

	public Student(){
		this("MESSI",23);
	}
	public Student(String name,String gender,int age){
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	public Student(String name,int age){
		this(name,"male",age);
	}

	public void print(){
		System.out.println("name: "+this.name+"\tgender: "+this.gender+"\tage: "+this.age+"\t\taddress:"+this.address.print());
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}

	public void setGender(String gender){
		this.gender = gender;
	}
	public String getGender(){
		return this.gender;
	}

	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return this.age;
	}
	
	public void setAddress(Address address){
		this.address = address;
	}
	public Address getAddress(){
		return this.address;
	}
}
