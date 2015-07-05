package com.briup.ch11;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileTest {
	
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		try {
			fis = new FileInputStream("src/com/briup/ch11/FileTest.java");
			bis = new BufferedInputStream(fis);
			fos = new FileOutputStream("src/com/briup/ch11/FileTest.java.bak");
			bos = new BufferedOutputStream(fos);
			byte[] buff = new byte[128];
			int len = 0;
			while((len=bis.read(buff))!=-1){
				System.out.print(new String(buff,0,len));
				bos.write(buff,0,len);
			}
			bos.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				if(fis!=null)fis.close();
				if(fos!=null)fos.close();
				if(bis!=null)bis.close();
				if(bos!=null)bos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
