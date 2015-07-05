package com.briup.ch11;

import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipedStreamDemo {
	public static void main(String[] args) {
		PipedInputStream pis = null;
		PipedOutputStream pos = null;
		try {
			pis = new PipedInputStream();
			pos = new PipedOutputStream();
			//pis.connect(pos);
			pos.connect(pis);
			PipedStreamDemo psd = new PipedStreamDemo();
			PipedStreamDemo.Writer w = psd.new Writer(pos);
			w.start();
			PipedStreamDemo.Reader r = psd.new Reader(pis);
			r.start();
			
			w.join();
			r.join();
			pis.close();
			pos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public class Writer extends Thread{
		public PipedOutputStream pos;
		public Writer(PipedOutputStream pos){
			this.pos = pos;
		}
		public void run(){
			for(int i=1;i<=10;i++){
				try {
					pos.write(i);
					sleep(1000);
					pos.flush();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
	public class Reader extends Thread{
		private PipedInputStream pis;
		public Reader(PipedInputStream pis){
			this.pis = pis;
		}
		public void run(){
			for(int i=1;i<=10;i++){
				try {
					System.out.println(pis.read());
					sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}
