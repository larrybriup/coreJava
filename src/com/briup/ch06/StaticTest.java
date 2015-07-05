package com.briup.ch06;
public class StaticTest{

    protected static int num;

	static{
	System.out.println("thsi is static block");
	num = 20;
	test();
	
	}
 public static void main(String[] args){

	System.out.println("mainMethod");
 }
	public StaticTest(){
	num++;
	}
	public void test2(){
	test();
	}
    public static void test(){
	
	System.out.println("this is static test()!");
	}
     // test2();

}
class TestStatic{
 public static void main(String[] args){
 
	System.out.println("mainTest");
   
	
	
	/*for(int i=0;i<10;i++){
	new StaticTest();

	
	System.out.println("num is:"+StaticTest.num);
	}
	StaticTest.test();
	StaticTest test = new StaticTest();
	test.test();
	test.test2();
*/

 }

}




