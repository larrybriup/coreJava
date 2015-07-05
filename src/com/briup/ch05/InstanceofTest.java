package com.briup.ch05;

import com.briup.ch02.Person;

public class InstanceofTest{

	public static void main(String[] args){
		Shape sh = new Circle();
		if(sh instanceof Circle){
			Circle c = (Circle)sh;
			System.out.println("shape --->Circle");
		}

		if(sh instanceof Circle){	
			//Person p =(Person) sh;
		//}
			Circle cc = (Circle)sh;
		}
	}
}
