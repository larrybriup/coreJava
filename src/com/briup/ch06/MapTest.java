package com.briup.ch06;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest {
public static void main(String[] args) {
	Map map = new HashMap();
	Person kevin = new Person(101, "kevin", true, 38);
	Person terry = new Person(102, "terry", true, 308);
	Person lucy = new Person(106, "lucy", false, 380);
	map.put(new Integer(102), kevin);
	map.put(new Integer(102), terry);
	map.put(new Integer(101), lucy);
	Object value = map.get(new Integer(102));
	System.out.println(value);
	map.remove(new Integer(102));
	System.out.println(map.size());
	map.put(new Integer(102), kevin);
	map.put(new Integer(100), terry);
	//System.out.println();
	//遍历
	System.out.println("====keyset====");
	Set keys = map.keySet();
	Iterator iter = keys.iterator();
	while(iter.hasNext()){
		Integer key = (Integer)iter.next();
		Person val = (Person)map.get(key);
		System.out.println(key+"====="+val);
		
	}
	System.out.println("===entrySet====");
	Set entrys = map.entrySet();
	Iterator it = entrys.iterator();
	while(it.hasNext()){
		Map.Entry entry = (Map.Entry)it.next();
		Integer key = (Integer)entry.getKey();
		Person val = (Person)entry.getValue();
		System.out.println(key+"===="+val);
	}
}
}
