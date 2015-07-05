package com.briup.ch12;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Windows implements ActionListener {
	private JFrame frame;
	private Container contentPane;
	private JButton startBtn, nextBtn, stopBtn;
	private JLabel msg;
//	static int index;
	 private  int index;
	public Windows(int index) {
		this.index=index;
		frame = new JFrame();
		contentPane = frame.getContentPane();
		frame.setLayout(new BorderLayout());
		frame.setSize(300, 200);
		if (index == 1) {
			frame.setTitle("1号贵宾柜台");
		} else {
			frame.setTitle(index + " 号普通柜台");
		}
		frame.setLocation((index - 1) * 300 + 200, 50);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		init();
		frame.setVisible(true);
	}

	private void init() {
		msg = new JLabel("******************");
		contentPane.add(msg, BorderLayout.NORTH);

		JPanel panel = new JPanel();

		startBtn = new JButton("开始受理");
		startBtn.addActionListener(this);

		nextBtn = new JButton("下一个");
		nextBtn.addActionListener(this);
		nextBtn.setEnabled(false);

		stopBtn = new JButton("暂停");
		stopBtn.addActionListener(this);
		stopBtn.setEnabled(false);

		panel.add(startBtn);
		panel.add(nextBtn);
		panel.add(stopBtn);
		contentPane.add(panel, BorderLayout.SOUTH);

	}

	public static void main(String[] args) {
		for (int i = 1; i <= 3; i++) {
			new Windows(i);
		}
//		new Main();
	}

	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if (obj == startBtn) {
			startBtn.setEnabled(false);
			nextBtn.setEnabled(true);
			stopBtn.setEnabled(true);
			msg.setText("此窗口没有用户排队");

		}
		if (obj == nextBtn) {
			try {
				Socket client = new Socket("localhost", 7788);
				String msg = index+"";
				PrintWriter pw = new PrintWriter(client.getOutputStream());
				pw.println(msg);
				pw.flush();
				
				BufferedReader br = new BufferedReader
						(new InputStreamReader(client.getInputStream()));
				String mesg=br.readLine();
				if(mesg.contains("vip:")){
					if(mesg.length()>4){
						int vNo=
								Integer.parseInt(mesg.substring(4));
						this.msg.setText("正在为贵宾"+vNo+"办理业务");
					}else{
						this.msg.setText("没有用户排队");
					}
				}else{
					if(mesg.length()>7){
						String nno = mesg.substring(7);
						int no = Integer.parseInt(nno);
						this.msg.setText("正在为普通用户"+no+"号办理业务");
					}else{
						this.msg.setText("没有用户排队");
					}
				}
				
			} catch (UnknownHostException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		if (obj == stopBtn) {
			startBtn.setEnabled(true);
			nextBtn.setEnabled(false);
			stopBtn.setEnabled(false);
			msg.setText("暂停服务！");
		}
	}

}
