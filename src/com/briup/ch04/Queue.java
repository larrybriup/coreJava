package com.briup.ch04;
public class Queue{
   /*
	要实现的功能：
	动态扩展
    入对
	出对
	队列长度
	查询
    */
	//定义int类型的数组
	private int[] array;
	//index实际长度
	private int index;
	//maxLength最大长度
	private int maxLength;

	public Queue(){
        maxLength = 5;
		array = new int[maxLength];
        index = 0;
    	}
	public Queue(int length){
	    if(length<=0){
	     System.out.println("Queue length not correct!");
         System.exit(1);
	    }
	    maxLength = length;
		array = new int[maxLength];
        index = 0;
	  }
    //动态扩展
	public void reset(){
       int[] temp = new int[maxLength+=10];	
	   System.arraycopy(array,0,temp,0,index);
	   array = temp;
	   temp = null;
	 }
	//入对
	 public void inqueue(int value){
       if(index>=maxLength){
		   reset();
	   }
	  array[index++]=value;
	  }
	 //出对
 	 public int dequeue(){
	    int res = array[0];
        for(int i=0;i<index-1;i++){
	     array[i] = array[i+1];
	    }
	   array[--index]=0;
	   return res;
	 }
	//队列长度
	public int length(){
	  return index;
	}
	//查询
	public boolean query(int value){
		boolean res = false;
		for(int i=0;i<index;i++){
		   if(value==array[i]){
		     res = true;
		     break;
		    }
		  }
	   return res;
	}
}
