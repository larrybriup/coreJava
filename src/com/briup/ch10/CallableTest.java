package com.briup.ch10;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableTest 
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
		CallableTest task1 = new CallableTest();
		CallableTest task2 = new CallableTest();
		CallableTest task3 = new CallableTest();

		 ExecutorService es = 
		 Executors.newFixedThreadPool(3);     
	        try {     
	            // 提交并执行任务，任务启动时返回了一个 Future对象，     
	            // 如果想得到任务执行的结果或者是异常可对这个Future对象进行操作     
	            Future future1 = es.submit(task1);     
	            // 获得第一个任务的结果，如果调用get方法，当前线程会等待任务执行完毕后才往下执行     
	            System.out.println("task1: " + future1.get());     
	                 
	            Future future2 = es.submit(task2);     
	            // 等待5秒后，再停止第二个任务。因为第二个任务进行的是无限循环     
	            //Thread.sleep(5000);     
	            System.out.println("task2 cancel: " + future2.cancel(true));     
	                 
	            // 获取第三个任务的输出，因为执行第三个任务会引起异常     
	            // 所以下面的语句将引起异常的抛出     
	            Future future3 = es.submit(task3);     
	            System.out.println("task3: " + future3.get());     
	        } catch (Exception e){     
	            System.out.println(e.toString());     
	        }     
	        // 停止任务执行服务     
	        es.shutdownNow();
	}
}
