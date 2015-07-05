package com.briup.ch11;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileRWDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;

		fis = new FileInputStream("src/com/briup/ch11/FileRWDemo.java");
		bis = new BufferedInputStream(fis);

		fos = new FileOutputStream("src/com/briup/ch11/FileRWDemo.java.bak");
		bos = new BufferedOutputStream(fos);
		byte[] buff = new byte[128];
		int len = 0;
		String str="";
		while((len=bis.read(buff))!=-1){
			str+=new String(buff,0,len);
//			System.out.print(new String(buff,0,len));
			bos.write(buff,0,len);
		}
		System.out.println(str);
		bos.flush();
		try {
			if (fis != null)
				fis.close();
			if (bis != null)
				bis.close();
			if (fos != null)
				fos.close();
			if (bos != null)
				bos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
}
