package com.briup.ch06;
public class WrapperTest{

  public static void main(String[] args){
   //int--Integer
	  Integer i1 = 10;//自动装箱
	  int i = 10;
	  Integer i2 = new Integer(i);
      Integer i3 = Integer.valueOf(i);
     int j = i2;
	 int j2 = i2.intValue();
	 int j3 = Integer.parseInt("123");
	 //int j4 = Integer.getInteger("123");
	 System.out.println(Integer.toBinaryString(23535));
	 for(int ii=Integer.MAX_VALUE-5;ii<=Integer.MAX_VALUE;ii++){
	    System.out.println("*");
	 
	 }
  }

}
