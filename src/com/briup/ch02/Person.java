package com.briup.ch02;
    public class Person {
  //实例变量，成员变量
       private int id;
       private String name;
       private boolean gender;
       private int age;
       private String address;
       private String phone;
//方法参数中的变量是局部变量，只在方法中哦那有效
   public void setId(int id){

   this.id = id;
      
   }
    public int getId(){
   
     return id;

    }
   public void setName(String name){

      this.name = name;  

    }
   public String getName(){

      return name;

   }
     public void setGender(boolean gender){

      this.gender = gender;
    }
   public boolean getGender(){

      return gender;

   }
public void setAge(int age){

      this.age = age;
    }
   public int getAge(){

      return age;

   }
public void setAddress(String address){

      this.address = address;
    }
   public String getAddress(){

      return address;

   }
public void setPhone(String phone){

      this.phone = phone;
    }
   public String getPhone(){

      return phone;

   }


}
