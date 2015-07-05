package com.briup.ch06;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String[] args) {

		Person kevin = new Person(100, "kevin", true, 38);
		Person terry = new Person(102, "terry", true, 308);
		Person lucy = new Person(101, "lucy", false, 38);
		TreeSet ts = new TreeSet(new Comparator() {

			public int compare(Object o1, Object o2) {
				Person p1 = (Person) o1;
				Person p2 = (Person) o2;
				return p1.getId() - p2.getId();
			}
		});
		ts.add(kevin);
		ts.add(terry);
		ts.add(lucy);

		Iterator iter = ts.iterator();
		while (iter.hasNext()) {
			Person p = (Person) iter.next();
			// (100, "kevin", true, 38);
			System.out.println(p);
		}

	}
}
