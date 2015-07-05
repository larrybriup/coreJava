 package com.briup.ch02;
      
       public class BlockTest {
       
       static{
          
        System.out.println("This is a static block");
           }
        {
          System.out.println("This is a normal block");
         }
      public BlockTest(){

    System.out.println("this a cons block");
       }
     public void method(){
      System.out.println("method block");
        {
          System.out.println("normal block in method block!");
         }

      }
   

    public static void main(String[] args) {

     System.out.println("this a mian method");
     BlockTest test = new BlockTest();
     test.method();
     }
}

