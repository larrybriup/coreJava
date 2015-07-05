package com.briup.ch12;

import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;

public class TcpThread extends Thread {
	private Socket client;

	public TcpThread(Socket client) {
		this.client = client;
	}

	public void run() {
		try {
			//用ObjectInputStream类获得输入流
			ObjectInputStream ois = new ObjectInputStream(
					client.getInputStream());
			List list = (List) ois.readObject();
			for (Object i : list) {
				System.out.println(i);
				System.out.println("打印了");
				//每打印一个数休眠一秒钟
				sleep(1000);
			}
			//获得输出流方法并向里面写入字符流
			PrintWriter pw = new PrintWriter(client.getOutputStream());
			pw.println("I am TcpThread.Iterator over");
			pw.flush();

			pw.close();
			ois.close();
			client.close();
		} catch (Exception e) {
			
		}
	}
}
