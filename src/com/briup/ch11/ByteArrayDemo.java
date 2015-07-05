package com.briup.ch11;

import java.io.ByteArrayInputStream;

public class ByteArrayDemo {
	public static void main(String[] args) {
		byte[] bytes = new byte[]{10,20,30,40};
		ByteArrayInputStream bis = null;
		try {
			bis = new ByteArrayInputStream(bytes);
			int res = 0;
			while((res=bis.read())!=-1){
				System.out.println(res);
			}
		} catch (Exception e) {
			
		}
	}
}
