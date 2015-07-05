package com.briup.ch06;

//import java.text.DateFormat.Field;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectTest {
	public static void main(String[] args) throws Exception {
		Class clazz = Class.forName("com.briup.ch06.Person");
		Person p = new Person();
		Class clazz2 = p.getClass();
		Class clazz3 = com.briup.ch06.Person.class;
		System.out.println(clazz);
		System.out.println(clazz2);
		System.out.println(clazz3);

		Class suc = clazz.getSuperclass();
		System.out.println(suc);
		//clazz.getInterfaces();
		Class[] inters = clazz.getInterfaces();

		if ("Object".equals(suc)) {
			System.out.println("sudu");
		}

		System.out.println(inters.length);
		System.out.println("===========");
		printFiles(clazz2, p);
		System.out.println("===========");
		System.out.println(p);
		System.out.println("=========");
		printMethods(clazz, p);
		System.out.println("=====Con====");
		printConstructors(clazz,p);
	}

	
	public static void printFiles(Class clazz, Person p) throws Exception {
		Field[] fields = clazz.getDeclaredFields();// 返回Fields类型的数组
		System.out.println(fields.length);
		for (int i = 0; i < fields.length; i++) {
			Field field = fields[i];
			int mod = field.getModifiers();
			if (mod == 2)
				System.out.println("private ");
			String type = field.getType().getName();
			System.out.print(type + "  ");
			String name = field.getName();
			System.out.println(name + " ");
			 field.setAccessible(true);
			if (name.equals("age")) {
				field.setInt(p, 10);
			}
			if (name.equals("name")) {
				field.set(p, "cho");
			}

		}

	}
	public static void printMethods(Class clazz, Person p) throws Exception {

		Method[] methods = clazz.getDeclaredMethods();
		for (int i = 0; i < methods.length; i++) {
			Method method = methods[i];
			int mod = method.getModifiers();
			System.out.println(mod + " ");//?
			String returnType = method.getReturnType().getName();
			System.out.println(returnType + " " + method.getName() + "(");
			Class[] pars = method.getParameterTypes();
			for (int j = 0; j < pars.length; j++) {
				System.out.println(pars[j].getSimpleName() + " ");
			}
			System.out.println("){}");
			if (method.getName().equals("setName")) {
				method.invoke(p, new Object[]{"jdhfdfh"});
			}

		}

	}
	public static void printConstructors(Class clazz, Person p) throws Exception {
		Constructor[] constructors = clazz.getDeclaredConstructors();// 返回Fields类型的数组
		System.out.println(constructors.length);
		for (int i = 0; i < constructors.length; i++) {
			Constructor constructor = constructors[i];
			int mod = constructor.getModifiers();
			if (mod == 2)
				System.out.print("private ");
//			String type = constructor.getReturnType().getName();
//			System.out.print(type + "  ");
			String name = constructor.getName();
			System.out.println(name + " (");
			
			Class[] pars = constructor.getParameterTypes();
			for (int j = 0; j < pars.length; j++) {
				System.out.println(pars[j].getSimpleName() + " ");
			}
			//Class[] parn = constructor.getParameterNames();
			System.out.println("){}");
			//constructor.setAccessible(true);
			/*if (name.equals("age")) {
				field.setInt(p, 10);
			}
			if (name.equals("name")) {
				field.set(p, "cho");
			}*/

		}

	}

}
