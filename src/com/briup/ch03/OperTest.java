package com.briup.ch03;
    public class OperTest{
    public static void main(String[] args){
     
        int a = 10;
        int b = 20;
        double d = 45.5;
        a+=b;
         System.out.println("a="+a);
        a =10;b=20;
        a=a+b;

         System.out.println("a="+a);
        a=10;
        a+=d;

         System.out.println("a="+a);
        a=10;
        a=(int)(a+d);

         System.out.println("a="+a);
        int i = 0;
        i++;

         System.out.println("i="+i);
        i = 0;
        i = i++;

         System.out.println("i="+i);
        i = 0;
        ++i;

         System.out.println("i="+i);
        i = 0;
       i=++i;

         System.out.println("i="+i);
       String str = "hello";
     if(str instanceof Object){
     System.out.println("str is an Object!");
    }
   
    if(str instanceof String){
    System.out.println("str is a String!");
}
      int m = 10;
      int n = 3 ;
      double k = 10.0;
     System.out.println("m/n="+m/n);

   System.out.println("k/n="+k/n);
   System.out.println("m%n="+m%n);
   m=5;n=-1;
   System.out.println(m>>2);
   m=5;

   System.out.println(m<<2);
   System.out.println(n>>2);
   n=-1;
   System.out.println(n<<2);

   n=-1;
   System.out.println(n>>>2);
   m=5;
   System.out.println(m>>2);
   System.out.println(m>>34);
   m=5;
   System.out.println(m>>5);
   long l = 5l;
 m = 5;
n=4;
int kk=-5;
System.out.println("m&n:"+(m&n));

System.out.println("m|n:"+(m|n));
System.out.println("m^n:"+(m^n));
System.out.println("~m:"+(~m));

System.out.println("~kk:"+(~kk));
char x = 'X';
int y = 10;
int z =  20;
double dd= 50.0;
System.out.println("y>z?x:y"+(y>z?x:y));
System.out.println(y<z?x:69);
System.out.println(y>z?x:69);
System.out.println(y>z?dd:y);
//System.out.println(y>z?x:y);

}



 
 }
