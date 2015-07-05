package com.briup.ch04;
public class ArrayCopy{
public static void main(String[] args){

	int a[] = {3,5,6,};
   int b[] = {8,9,0,};
   System.arraycopy(a,0,b,0,a.length);

   for(int i=0;i<b.length;i++){
   
   System.out.print(b[i]+" ");
   }
   System.out.println();
}



}
