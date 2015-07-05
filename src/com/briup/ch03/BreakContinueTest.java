
package com.briup.ch03;
public class BreakContinueTest{

public static void main(String[] args){
for(;;){
double num = Math.random();
if(num<0.1){

System.out.println("continue");
continue;
}else{

System.out.println("break for loop!");
break;

}


}
loop:for(int i=2;i<500;i++){
	 
	 int j = 2;
	 while(j<=i){
	 
	 if(i%j==0&&i!=j){
     j++;	 
	 break;
	 
	 
	 }else{
	 
	 System.out.println(i+" ");
	 j++;
	 continue loop;
	 
	 
	 }
	 
	 
	 }
	 
	 
	 }

}


}
