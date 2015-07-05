package com.briup.ch06;
public class SingleTon{
//单子模式
  private static SingleTon ton;
  private SingleTon(){}
  public static SingleTon newInstance(){
    if(ton==null){
	  ton = new SingleTon();

	}
  
	  return ton;
  }


}
class TonTest{
 public static void main(String[] args){

System.out.println(SingleTon.newInstance());
System.out.println(SingleTon.newInstance());
System.out.println(new TonTest());
System.out.println(new TonTest());
 }
}
