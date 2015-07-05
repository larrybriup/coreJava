package com.briup.ch11;

import java.io.File;
import java.io.IOException;

public class File2Test {
	public static void main(String[] args) throws IOException {
		File f1 = new File("src/com/briup/ch11/fileDir/fDir");
		if (!f1.exists())
//用System.out.println("没有那个目录,现在是否已经自动创建:"+f1.mkdirs());
//直接就可以创建目录
//		f1.mkdirs();
		System.out.println("没有那个目录,现在是否已经自动创建:"+f1.mkdirs());
		File f2 = new File("src/com/briup/ch11/fileDir/fDir/file.txt");
		if (!f2.exists())
			try {
				f2.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
//	System.out.println(f2.toString()+"......");
		String[] ls = f1.getParentFile().list();
		for (int i = 0; i < ls.length; i++) {
			System.out.println(ls[i] + "  ");
		}
		System.out.println("==================================");
		System.out.println(" file.txt can read? " + f2.canRead()
				+ " file.txt can read? " + f2.canWrite());
		System.out.println(" file.txt path: "+f2.getAbsolutePath()+"-----"+
				f2.getCanonicalPath()+"----"+f2.getPath());
		System.out.println(f2.getName()+" parent path "+f2.getPath());
		System.out.println(f2.separator);
	}
}
