package com.briup.ch06;

public class MaxMinTest{
	private int[] array = {12,4,56,77,312};
	private int max,min;
/*	
	public static class MaxMin{//静态内部类
		int max;
		int min;
		public MaxMin(){}
		public MaxMin(int max,int min){
			this.max = max;
			this.min = min;
		}
	}
*/
	/*
	public class MaxMin{//成员内部类
		int max;
		int min;
		public MaxMin(){}
		public MaxMin(int max,int min){
			this.max = max;
			this.min = min;
		}
	}
	*/
	public MM maxMin(){
		max = array[0];
		min = array[0];
		for(int i=1;i<array.length;i++){
		if(array[i]>max)
			max = array[i];
		if(array[i]<min)
			min = array[i];
		}
		//final int t1 = max;
		//final int t2 = min;
		return new MM(){//匿名内部类	
			{
		//	this.min = t2;
		//	this.max = t1;
			this.min = MaxMinTest.this.min;
			this.max = MaxMinTest.this.max;
			}
		};
		/*
	class MaxMin extends MM{//局部内部类
		public MaxMin(){}
		public MaxMin(int max,int min){
			this.max = max;
			this.min = min;
		}
	}


		//MaxMinTest.MaxMin mm = new 
		//	MaxMinTest.MaxMin(max,min);
		//MaxMinTest.MaxMin mm = this.new MaxMin(max,min);	
		MaxMin mm = new MaxMin(max,min);
		return mm;
		*/
	}
/*	public static void main(String[] args){
		MaxMinTest test = new MaxMinTest();
		MaxMin mm = test.maxMin();
		System.out.println("max="+mm.max+" min="+mm.min);
	}*/
}

class MMTest{
	public static void main(String[] args){
		MaxMinTest test = new MaxMinTest();
		//MaxMinTest.MaxMin mm =
		MM mm = test.maxMin();
		System.out.println("max="+mm.max+" min="+mm.min);
	}	
}

class MM{
	int max;
	int min;
}
