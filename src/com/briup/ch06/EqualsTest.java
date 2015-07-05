package com.briup.ch06;
public class EqualsTest{
   public static void main(String[] args){
     int i = 10;
	 int j = 10;
	 Student s1 = new Student("kevin","male",35);
   
	 Student s2 = new Student("kevin","male",35);
	 System.out.println("i==j:"+(i==j)+"s1==s2"+(s1==s2)+("s1.equals(s2)")+s1.equals(s2));
	 System.out.println(s1);
	// String str1 = "abc";
	 String str1 = "abc"+123;
	 String str2 = "abc";
	 String str3 = new String("abc");
	 System.out.println((str1==str2)+"\t"+(str1==str3)+"\t"+(str1.equals(str3)));
	 StringBuffer sb = new StringBuffer();
	 sb.append("123");
	 System.out.println(sb);
	   }

}
