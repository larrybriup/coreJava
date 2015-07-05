package com.briup.ch11;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamDemo {
	public static void main(String[] args) {
		DataInputStream dis = null;
		DataOutputStream dos = null;
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			//鍒濆鍖栧苟鍖呰
			fos = new FileOutputStream("src/com/briup/ch11/data.bat");
			dos = new DataOutputStream(fos);
			//鍐欐搷浣�			dos.writeInt(135);
			dos.writeUTF("Hello World");
			dos.writeBoolean(true);
			dos.writeDouble(46.5);
			//鍒锋柊缂撳啿鍖�			dos.flush();
			
			fis = new FileInputStream("src/com/briup/ch11/data.bat");
			dis = new DataInputStream(fis);
			System.out.println(dis.readInt());
			System.out.println(dis.readUTF());
			System.out.println(dis.readBoolean());
			System.out.println(dis.readDouble());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				//閲婃斁璧勬簮
				if(dos!=null)dos.close();
				if(fos!=null)fos.close();
				if(fis!=null)fis.close();
				if(dis!=null)dis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
