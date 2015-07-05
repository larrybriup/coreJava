package com.briup.ch05.salary;

public class Employee{

	private int id;
	private String name;
	private boolean gender;
	private int age;
	private double salary;
	private SalaryQueue sallist;
	
	public Employee(){
		sallist  = new SalaryQueue();
	}
	public Employee(int id,String name,boolean gender,int age){
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
		sallist = new SalaryQueue();
	}
	
	public void setId(int id){
		this.id = id;
	}
	public int  getId(){
		return id;
	}

	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}

	public void setGender(boolean gender){
		this.gender = gender;
	}
	public boolean getGender(){
		return gender;
	}

	public void setAge(int age){
		this.age = age;
	}
	public int  getAge(){
		return age;
	}
	
	public void setSalary(double salary){
		this.salary = salary;
	}
	public double getSalary(){
		return salary;
	}
	
	public void setSallist(SalaryQueue sallist){
		this.sallist = sallist;
	}	
	public SalaryQueue getSallist(){
		return sallist;
	}
	
	//
	public void releaseSalary(){
		sallist.releaseSalary(salary);
	}
	//tiaoxin
	public void modifySalary(){}
}
