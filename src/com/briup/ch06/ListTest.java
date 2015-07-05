package com.briup.ch06;
public class ListTest{
  public static void main(String[] args){
   List list = new ArrayList();
     for(int i=0;i<15;i++){
	   list.add(i);
	 }
	 list.add(9,100);
	 System.out.println("size="+list.size());
	 Iterator iter = list.iterator();
	 while(iter.hasNext()){
	  int i = (Integer)iter.next();

	 System.out.println(i+"\t");
	   if(i%4==0){
	   iter.remove();
	   }

	 }


	 System.out.println("size="+list.size());
	 list.remove(new Integer(11));
	 System.out.println("size="+list.size());
     list.clear();
  }

}
