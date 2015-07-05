package com.briup.ch11;

import java.io.RandomAccessFile;

public class RandomAccessDemo {
	public static void main(String[] args) {
		RandomAccessFile raf=null;
		try {
			raf=new RandomAccessFile("src/com/briup/ch11/ps.txt","rw");
			long pos = raf.length();
			raf.seek(0);
			String line = "";
			while((line=raf.readLine())!=null){
				System.out.println(line);
				raf.write(line.getBytes());
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			try {
				if(raf!=null)
					raf.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
	}
}
