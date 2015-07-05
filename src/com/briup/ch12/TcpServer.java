package com.briup.ch12;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class TcpServer {
	public static void main(String[] args) {
		// 1、构建ServerSocket
		// 2、接受Socket
		// 3、获取留
		// 4、包装留
		// 5、读写
		// 6、释放资源
		ServerSocket server = null;//服务器套件
		BufferedReader br = null;
		PrintWriter pw = null;
		Socket client = null;//用于和客户端建立连接的套件
		// server.get
		try {
			server = new ServerSocket(8899);//初始化并规定服务器的端口为8899
			//死循环
			while (true) {
				//服务器通过Socket套件与客户端建立连接,服务器将一直处于接受状态
				client = server.accept();
				//包装从客户端输入的字符流
				br = new BufferedReader(new InputStreamReader(
						client.getInputStream()));
				//读取客户端发送过来的输入流
				String msg = br.readLine();
				System.out.println(" from "
						+ client.getInetAddress().getHostAddress() + " said:"
						+ msg);
				//用PrintWrinter包装返回给客户端的字符流
				pw = new PrintWriter(client.getOutputStream());
				Date date = new Date();
				pw.print("Hello "+client.getInetAddress().getLocalHost()+
						" now is "+date);
				//清空缓存
				pw.flush();
				// server.close();//如果server关闭客户端将无法与之交互
				br.close();
				pw.close();
				client.close();
			}

		} catch (Exception e) {

		}
	}
}
