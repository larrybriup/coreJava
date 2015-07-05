package com.briup.ch06;

import java.util.Iterator;
import java.util.LinkedList;



public class LinkedListTest {
public static void main(String[] args) {
	LinkedList list = new LinkedList();
	//添加
	//list.add(1);
	list.add(0,new Integer(2));
	list.add(1,new Integer(4));
	list.add(2,new Integer(6));
	list.addFirst(new Integer(5));
	list.addLast(new Integer(7));
    System.out.println(list);	
    //查找
    int i = ((Integer)list.get(3)).intValue();
    list.get(1);
    int j = ((Integer)list.getFirst()).intValue();
    System.out.println("i="+i+" j="+j);
    Iterator iter = list.iterator();
    while(iter.hasNext()){
    	  Integer in = (Integer)iter.next();
    	  System.out.println(in);
    	
    }
    System.out.println(list.size());
    //删除
    list.remove();
    list.remove(1);
    list.remove(new Integer(10));
    list.removeLast();
    System.out.println(list.size());
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
}
