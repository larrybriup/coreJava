package com.briup.ch10;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableTest1 
implements Callable{
	public Object call() throws Exception {
		for(int i=0;i<10;i++){
			System.out.println
			(Thread.currentThread().getName()
			+" running i is "+i);
			Thread.sleep(1000);
		}
		return null;
	}
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		FutureTask<Integer> future = 
				new FutureTask<Integer>(new CallableTest1());
		new Thread(future).start();
		FutureTask<Integer> future1 = 
				new FutureTask<Integer>(new CallableTest1());
		new Thread(future1).start();
	}
}
