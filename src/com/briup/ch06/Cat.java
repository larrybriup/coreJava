package com.briup.ch06;
public class Cat{
  public static void call(){
  System.out.println("miao~miao");
  }
 
}
class BosiCat extends Cat{
public static void call(){
  
  System.out.println("wang~wang");
}

}
class CatTest{
 public static void main(String[] args){
   Cat cat = new BosiCat();
   //((BosiCat)cat).call();
   cat.call();
   BosiCat bc = new BosiCat();
   bc.call();
   Cat c = null;
   c.call();
   //StaticTest test = null;
   //test.test2();
 }

}
