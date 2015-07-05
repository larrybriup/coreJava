package com.briup.ch12;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.Date;

public class UDPServer {
	public static void main(String[] args) {
		DatagramSocket server = null;// 相互通信的插件
		DatagramPacket packet = null;// 数据报包
		try {
			// 插件的端口是9988,就像管子的接口是9988类型的
			server = new DatagramSocket(9988);
			// 接受client发送的字符流
			byte[] buff = new byte[512];
			packet = new DatagramPacket(buff, buff.length);
			server.receive(packet);
			System.out.println(new String(packet.getData()));

			// 要发送的数据,以byte类型的数组存放
			byte[] sendData = new Date().toString().getBytes();
			// packet.getSocketAddress()是取得接受到的client客户端的地址,把字节流发送给他
			DatagramPacket sendPacket = new DatagramPacket(sendData,
					sendData.length, packet.getSocketAddress());
			server.send(sendPacket);

			server.close();
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
