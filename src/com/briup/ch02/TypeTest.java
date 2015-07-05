package com.briup.ch02;
   
    public class TypeTest{

         public static void main(String[] args){
   
                   char c1 = 70;
                   char c2 = '\u0060';
                   char c3 = 'b';
                   char c4 = 0x00060;
                   char c5 = '中';
//                   char c6 = "b";

           System.out.println("c1="+c1+"   c2="+c2+" c3="+c3+" c4="+c4+" c5="+c5); 

                int i1 = 11;
               int i2 = 011;int i3 = 0x11;
System.out.println(i1+i2);
         long l;
         l = 100l;
  //         float f = 34.5F;
         float f = (float)34.5;
         System.out.println("l="+l+"f="+f);

          int res1 = (int)(char)(byte)-1;
          int res2 = (int)(short)(char)(byte)-1;
         boolean res3 = ((byte)0x0090==0x0090);
      System.out.println("res1="+res1+"res2="+res2+"res3="+res3); 
              
      }

}
