package com.briup.ch11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class FileRWTest {
	public static void main(String[] args) {

		BufferedReader br = null;
		// 只能包裝支付劉
		BufferedWriter bw = null;
		// 既可以包裝字節流也可以包裝字符流
		PrintWriter pw = null;
		try {
			br = new BufferedReader(new InputStreamReader(new FileInputStream(
					new File("src/com/briup/ch11/FileRWTest.java")), "GBK"));
//			bw = new BufferedWriter(new OutputStreamWriter(
//					new FileOutputStream(
//							"src/com/briup/ch11/FileRWTest.java.bak"), "GBK"));
			pw=new PrintWriter(new FileOutputStream("src/com/briup/ch11/FileRWTest.java.bak"));
			String str = "";
			while ((str = br.readLine()) != null) {
				System.out.println(str);
//				bw.write(str+"\n");
				pw.println(str);
			}
//			bw.flush();
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				if (br != null)
					br.close();
				if (bw != null)
					bw.close();
				if (pw != null)
					pw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
}
