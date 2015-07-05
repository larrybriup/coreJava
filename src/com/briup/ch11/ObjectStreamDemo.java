package com.briup.ch11;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStreamDemo {
	public static void main(String[] args) {
		Person kevin = new Person("kevin",100,true,34);
		Person tracy = new Person("tracy",101,false,34);
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream(new File("src/com/briup/ch11/ps.txt")));
			oos.writeObject(kevin);
			oos.writeObject(tracy);
			oos.flush();
			
			ois= new ObjectInputStream(new FileInputStream("src/com/briup/ch11/ps.txt"));
			Person k = (Person)ois.readObject();
			Person t = (Person)ois.readObject();
			System.out.println(k.getId()+k.getName());
			System.out.println(t.getId()+t.getName());
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				if(oos!=null)oos.close();
				if(ois!=null)ois.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
