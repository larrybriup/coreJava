package com.briup.ch05.salary;

public class EmpManager{

	private Employee[] emps;
	private int index;
	private int maxlen;
	
	public EmpManager(){
		emps = new Employee[10];
		maxlen = 10;
		index = 0;
	}
	public void reset(){
		Employee[] temp = new Employee[maxlen+=5];
		System.arraycopy(emps,0,temp,0,index);
		emps = temp;
		temp = null;
	}
	//添加员工
	public void addEmp(Employee emp){
		
	}
	//delete
	public Employee removeEmp(Employee emp){
		return null;
	}
	//search
	public Employee query(int id){
		return null;
	}
	//发工资
	public void releaseSalary(){
		for(int i=0;i<emps.length;i++){
			Employee rmp = emps[i];
			rmp.releaseSalary();
		}
	}
	//调整薪水
	public void modifySalary(){
		
	}
	
	
}
