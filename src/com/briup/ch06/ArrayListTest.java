package com.briup.ch06;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//import javax.swing.text.html.HTMLDocument.Iterator;


public class ArrayListTest {
	public static void main(String[] args) {
		List list = new ArrayList();
		
		for(int i=0;i<10;i++){
			Person p = new Person(i+10, "cho"+i, true, i+23);
			list.add(p);
		}
	//	System.out.println(list);
		

	
		
		
	Iterator iter = list.iterator();
	while(iter.hasNext()){
		
		Person p = (Person)iter.next();
	//	System.out.println(p);
//		if (p.getAge()%4==0) {
//			iter.remove();
//		}
		if(p.getName().equals("cho1")){//删除一个之后，后面的会自动补上
			iter.remove();
		}
		
	}
	System.out.println(list);
	System.out.println(list.get(1));
	System.out.println(list.size());
	list.add(3,new Person());
	System.out.println(list.size());
	
	}
	
}
