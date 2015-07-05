package com.briup.ch06;
public abstract class Door{
   private String color;
   private String style;
   public abstract void open();
   public abstract void close();

}
interface Alarm{
  void alarm();

}
class PanPanDoor extends Door implements Alarm{
 public void open(){
 System.out.println("open action");
 
 }
 public void close(){
 System.out.println("close action");
 
 }
 public void alarm(){
 System.out.println("alarm action");
 
 }
 public static void main(String[] args){
    Door door = new PanPanDoor();
	door.open();
	door.close();
	Alarm alarm = new PanPanDoor();
	alarm.alarm();
 }


}
