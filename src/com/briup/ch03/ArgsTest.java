package com.briup.ch03;
public class ArgsTest{

public static void main(String[] args){

         if (args.length<1){

        System.out.println("Please input args!");

System.exit(1);

    }
int num = Integer.parseInt(args[0]);
System.out.println("num="+num);



}




}
