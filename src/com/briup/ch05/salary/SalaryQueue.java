package com.briup.ch05.salary;

public class SalaryQueue{
	//动态扩展，入队，出队，队列长度，查询；
	private int index;
	private double[] arr;
	private int maxLen;

	//无参构造
	public SalaryQueue(){
		maxLen = 10;
		arr = new double[maxLen];
		index = 0;	
	}
	//指定队列长度的
	public SalaryQueue(int maxLen){
		if(maxLen <= 0){
			System.out.println("queue length not correct!");
			System.exit(1);
		}
		this.maxLen = maxLen;
		arr = new double[maxLen];
		index = 0;
	}
	//动态扩展
	public void reset(){
		/*
		create array
		copy
		replace var
		change maxLen
		*/
		double[] temp = new double[maxLen+=10];
		System.arraycopy(this.arr,0,temp,0,index);
		this.arr = temp;
		temp = null;//释放内存不写不报错的
	}
	//入队
	public void releaseSalary(double value){
		/*
		判断是否越位
		*/
		if(index>=this.maxLen)
		reset();
		arr[index++] = value;
	}
	//出队
	public double dequeue(){
		double value = arr[0];
		for(int i=0;i<index-1;i++){
			arr[i] = arr[i+1];
		}
		arr[--index] = 0.0;
		return value;
	}
	//队列长度
	public int getLength(){
		return index;
	}
	//查询
	/*
	public boolean query(int value){
		for(int i=0;i<index;i++){
			if(arr[i]==value){
				return true;
			}
		}
		return false;
	}
	*/
	//
	public double getLastSalary(){
		return arr[(index-1)];
	}

}
