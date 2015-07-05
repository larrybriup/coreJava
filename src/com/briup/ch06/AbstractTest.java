package com.briup.ch06;
public abstract class AbstractTest{
    public AbstractTest(){}
	public AbstractTest(int num){}
    public abstract void method();
    public void print(){
     System.out.println("normal method in abstract class");
     }

}
class AbstractDemo extends AbstractTest{
   public void method(){}


}
