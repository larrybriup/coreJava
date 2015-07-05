package com.briup.ch05;

public class StudentTest{


	public static void main(String[] args){
		Student stu = new Student("MESSI","male",23);
		Address address = new Address();
		address.setCity("巴萨罗纳");
		address.setStreet("MainStreet");
		stu.setAddress(address);
		stu.print();
	}
}
