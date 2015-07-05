
package com.briup.ch03;
public class LoopTest{

  public static void main(String[] args){
  
  forLoop();
  whileLoop();
  doLoop();
  }
  
  public static void forLoop(){
      int i;
	  int sum = 0;
	  for(i=1;i<=100;i++){
		sum+=i;
	

	
	
	}
	
	  System.out.println(sum);
  
  }
 public static void whileLoop(){
      int i = 0;
	  int sum =0;
	  while(i<=100){
	  sum += i;
      i++;
	  
	  }
 
	  System.out.println(sum);
 
 
 }


public static void doLoop(){
int i = 0;
int sum = 0;
do{
	
	sum += i;
    i++;

}while(i<=100);
	  System.out.println(sum);
}


}

