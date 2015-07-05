package com.briup.ch06;
//public  final 
public class Final{
   
	//private final int num = 10;
	private final int num;
/*	{
	 num = 34;
	
	}*/
	public Final(){
	num = 40;
	}
  public final void method(){
       //num = 10;无法给fianl变量赋值。相当于常量
  System.out.println("method in final class"+num);

  }


}
class FinalDemo extends Final{
   public void show(){
   
    System.out.println("show in FinalDemo");
    method();
   }
  // public void show(){}
   public static void main(String[] agrs){
   FinalDemo fd = new FinalDemo();
   fd.show();
   }

}
