package com.briup.ch04;
public class MaxValue{
 public static void main(String[] args){
 
 int[] array = new int[]{2,4,68,9,34,};
 int m = array[0];
 for(int j=0;j<array.length;j++)
 if(m<array[j]){
 
    m = array[j];
 
 }
 System.out.println("m="+m);
 for(int i=1;i<array.length;i++){
 if(m>array[i]){
    m = array[i];
 
 }

 }
 System.out.println("m="+m);
 }





}
