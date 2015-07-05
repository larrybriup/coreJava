package com.briup.ch05.salary;

public class EmpManagerTest{

	public static void main(String[] args){
		EmpManager em = new EmpManager();
		Employee e1 = new NormalEmp(100,"MESSI",true,23,4);
		e1.setSalary(50000.0);
		em.addEmp(e1);
		Employee e2 = new Manager(10,"Super",true,23,2.5);
		e2.setSalary(80000.0);
		em.addEmp(e2);
		em.releaseSalary();
		em.modifySalary();
		
	}
}
