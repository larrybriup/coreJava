
package com.briup.ch04;
import com.briup.ch02.Person;
public class ArrayBasic{

public static void main(String[] args){
//声明
int[] a1;
int a2[];
//int a3[3];
//int[5] a4;

//创建
a1 = new int[5];
a2 =new int[]{1,2,3};

Person[] ps = new Person[3];
String[] strs = {"abc","def"};
double[] ds = new double[]{12.5,22,5};


ps[0] = new Person();
Person kevin = new Person();
kevin.setName("kevin");
ps[1] = kevin;

//删除就是还原初始值
ds[0]  = 0.0;

//修改就是覆盖

ds[1] = 100.9;

//查询
System.out.println("ps="+ps[1]);
System.out.println("ds[1]="+ds[1]);
for(int i=0;i<a2.length;i++){

System.out.println("a2[i]="+a2[i]);

}


System.out.println("===================================================");


}


}
