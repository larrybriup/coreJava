package com.briup.ch06.OOP;
public class Person{
   public String name;
   Bullet bl = new Bullet();
  public void fire(Bullet bl){
	  System.out.print("让子弹");
      bl.fly();
  }
  public String setName(){
    return this.name = name;
  }
  public void getName(String name){
    return;
  }
   
}
