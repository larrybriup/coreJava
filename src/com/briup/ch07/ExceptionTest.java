package com.briup.ch07;

public class ExceptionTest {
	public int div(int a,int b){
		int res = 0;
		/*try{
		 res = a/b;
		return res;
		}catch(Exception e){
			System.out.println(e.getMessage());
			e.printStackTrace();
			//return 0;
		}*/
		res = a/b;
		return res;
	}
	public static void main(String[] args) {
     ExceptionTest test = new ExceptionTest();
     try {
    	 test.div(10, 0);
	} catch (Exception e) {
		System.out.println(e.getMessage());
		e.printStackTrace();
	}
     
     System.out.println("this is exception test");
	}
}
