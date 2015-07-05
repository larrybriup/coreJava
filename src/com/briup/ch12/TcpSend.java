package com.briup.ch12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

public class TcpSend {
public static void main(String[] args) {
	Socket client=null;
	ObjectOutputStream oos=null;
	BufferedReader br=null;
	try {
		client=new Socket("localhost",8888);
//		ArrayList list = new ArrayList();
	   List list = new ArrayList();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		//包装并发送
		oos=new ObjectOutputStream(client.getOutputStream());
		oos.writeObject(list);
		oos.flush();
		//读取服务器发送过来的消息
		br= new BufferedReader(new InputStreamReader(client.getInputStream()));
		System.out.println(br.readLine());
		
		oos.close();
		br.close();
		client.close();
		
	} catch (UnknownHostException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
