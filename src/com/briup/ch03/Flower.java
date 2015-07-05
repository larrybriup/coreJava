package com.briup.ch03;
public class Flower{
public static void main(String[] args){
	int num;
int i = 1;
int j = 0;
int k = 0;
for(i=1;i<=9;i++){
 for(j=0;j<=9;j++){
   for(k=0;k<=9;k++){
   num = i*100+j*10+k;
   if (num==i*i*i+j*j*j+k*k*k)
	   System.out.println("Flower"+i+j+k);
   
   
   }
 
 }


}

}
}
