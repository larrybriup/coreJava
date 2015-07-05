
package com.briup.ch03;

public class Cash{

   public static void main(String[] args){
    
if (args.length<1){

        System.out.println("请输入利润额!");

System.exit(1);

    }
//int I = Integer.parseInt(args[0]);
double I = Double.parseDouble(args[0]);
double t;

if(I<=10){
   t=I*0.1;
System.out.println("应发奖金位："+t+"万");

   }else if(I>10&&I<=20){
      t=(I-10)*0.075+1;
     System.out.println("应发奖金位："+t+"万");

   }else if(I>20&&I<=40){
      t =(I-20)*0.05+8.5;
     System.out.println("应发奖金位："+t+"万");
   
   }else if(I>40&&I<=60){
      t = (I-40)*0.03+9.5;
     System.out.println("应发奖金位："+t+"万");
   
   }else if(I>60&&I<=100){
      t =(I-60)*0.015+10.1;
     System.out.println("应发奖金位："+t+"万");

   }else if(I>100){
      t =(I-100)*0.01+10.7;
     System.out.println("应发奖金位："+t+"万");

   }



    }



}
