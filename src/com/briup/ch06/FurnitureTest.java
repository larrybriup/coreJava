package com.briup.ch06;
public class FurnitureTest implements SofaBed{

  public void use(){
  
  
  System.out.println("use");
  }
  public void sit(){
  System.out.println("sit");
  }
  public void sleep(){
  System.out.println("sleep");
  }
  public void show(){
  System.out.println("show");
  }
  public static void main(String[] args){
    FurnitureTest fur = new FurnitureTest();
	Furniture f = fur;
	f.use();
	Sofa sofa = fur;
	sofa.sit();

	Bed bed= fur;
	bed.use();
	bed.sleep();

	SofaBed sb = fur;
	sb.use();
	sb.sit();
	sb.sleep();
	sb.show();
  
  }
}
