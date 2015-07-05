package com.briup.ch06;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {
	public static void main(String[] args) {
       Set set = new HashSet();
       Person  kevin = new Person(100, "kevin", true, 38);
       Person  kevin2 = new Person(100, "kevin2", true, 38);
       Person  lucy = new Person(101, "lucy", false, 18);
       set.add(kevin);
       set.add(kevin2);
       set.add(lucy);
       set.remove(kevin);
       
       Iterator iter = set.iterator();
       while(iter.hasNext()){
    	   Person  p = (Person)iter.next();
    	   //(100, "kevin", true, 38);
    	   System.out.println(p);
       }
	}
}
