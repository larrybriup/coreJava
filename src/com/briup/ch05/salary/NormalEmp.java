package com.briup.ch05.salary;

public class NormalEmp extends Employee{

	private int years;
	
	public NormalEmp(){}
	public NormalEmp(int id,String name,boolean gender,int age,int years){
		super(id,name,gender,age);
		this.years = years;
	}

	public void setYears(int years){
		this.years = years;
	}
	public int getYears(){
		return years;
	}

	public void modifySalary(){
//		if(){}
	}
}
