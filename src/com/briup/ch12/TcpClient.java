package com.briup.ch12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpClient {
	public static void main(String[] args) {
		//构建客户端Socket
		//根据Socket获取输入流或者输出流
		//包装流
		//读写操作
		//释放资源
		
		//构建客户端Socket
		Socket client = null;
		BufferedReader br = null;
		PrintWriter pw=null;
		try {
			//根据Socket获取输入流或者输出流
			client = new Socket("localhost",8899);
			//包装流
			OutputStream os=client.getOutputStream();
			
			//读写操作
			pw=new PrintWriter(os);
			pw.println("Please give me your time!");
			pw.flush();//刷新缓存
			//获得输入流
			InputStream is = client.getInputStream();
			//读取获得的输入流BufferedReader不能直接读取is流,
			//需要用InputStreamReader包装一下
			br=new BufferedReader(new InputStreamReader(is));
			//读取输入流,以String类型存储在内存
			String msg=br.readLine();
			System.out.println(msg);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				//释放资源
				if(br!=null)br.close();
				if(pw!=null)pw.close();
				if(client!=null)client.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
