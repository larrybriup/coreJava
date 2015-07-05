package com.briup.ch10;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableFuture;

public class CallableTest2 
implements Callable,Executor{
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
		CallableTest2 test = 
				new CallableTest2();
		FutureTask future = 
		new FutureTask(test);
		test.execute(future);
		CallableTest2 test1 = new CallableTest2();
		FutureTask future1 = 
		new FutureTask(test1);
		test.execute(future1);
	}
	public void execute(Runnable command) {
		new Thread(command).start();
	}
}
