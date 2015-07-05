package com.briup.ch05;

public class ParameterTest {

static void increment(int i) { 
	++i;
}
static void changeName(Student s) {
	s.setName("Larry"); 
}
static void changeStudent(Student s) {
	s = new Student("Mary", "female", 20); 
}
public static void main(String[] args){
	int i = 2;
	System.out.println("before increment() " + i); 
	increment(i); 
	System.out.println("after increment() " + i); 

	Student s = new Student("zhao", "male", 18);
	System.out.println("before changeName() " + s);
	changeName(s);
	System.out.println("after changeName() " + s);

	s = new Student("zhao", "male", 18);
	System.out.println("before changeName() " + s);
	changeStudent(s);
	System.out.println("after changeName() " + s);
}
}
