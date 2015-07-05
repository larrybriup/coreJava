package com.briup.ch12;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

public class UDPClient {
	public static void main(String[] args) {
		// DatagramSocket数据报插座,插件等,
		// 此方法定义一个数据报类型的client
		DatagramSocket client = null;

		try {
			// 初始化client
			client = new DatagramSocket();
			String msg = "please give me your time!";

			// 将String 类型msg中的字符以字节的形式取出,
			// 并且存放在byte类型的数组中
			byte[] buff = msg.getBytes();// ?
			// 再把buff包装在DatagramPacket 数据包send中,
			// 其中包含要发送的对象buff,发送的长度,和要发送的主机地址和端口
			DatagramPacket send = new DatagramPacket(buff, buff.length,
					new InetSocketAddress("localhost", 9988));
			// new InetSocketAddress("172.16.10.72", 9988));
			// 用插座发送
			client.send(send);
			// 接受服务器发送过来的字符,以byte类型的数组接受
			byte[] rec = new byte[128];// ?
			// 用DatagramPacket 进行二次包装,便于传送
			DatagramPacket recPacket = new DatagramPacket(rec, rec.length);
			// 同样用插件client接受,插件client既可以发送又可以接受
			client.receive(recPacket);
			System.out.println(new String(rec));
			client.close();

		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
