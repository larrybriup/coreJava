package com.briup.ch12;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropTest {
	public static void main(String[] args) throws IOException {
		Properties prop = null;
		//取得messages.propertie
		InputStream is=PropTest.class.getResourceAsStream("messages.properties");
		prop = new Properties();
		prop.load(is);
		if(args.length>0){
			System.out.println(prop.getProperty(args[0])+" "+prop.getProperty(args[1]));
//			System.out.println(prop.get(args[0]));
			
		}
	}
}
