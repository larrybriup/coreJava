package com.briup.ch12;

import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;

public class TcpReceiver {
public static void main(String[] args) {
	ServerSocket server = null;//服务器插件
	ObjectInputStream ois=null;//声明包装输入流的类
	PrintWriter pw = null;
	Socket client=null;
	
	try {
		//规定一个8888端口
		server=new ServerSocket(8888);
		while(true){
			client=server.accept();
			new TcpThread(client).start();
			Thread.sleep(500);
			/*ois=new ObjectInputStream(client.getInputStream());
			List list=(List)ois.readObject();
			for (Object i:list) {
				System.out.println(i);
			}
			//获得输出流方法然后开始向客户端发送西消息
			pw=new PrintWriter(client.getOutputStream());
			pw.println("I am TcpReceiver.Iterator over");
			pw.flush();
			
			
			pw.close();
			ois.close();
			client.close();*/
		}
	} catch (Exception e) {
		// TODO: handle exception
	}
}
}
