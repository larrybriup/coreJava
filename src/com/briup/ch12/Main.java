package com.briup.ch12;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main implements ActionListener {
	private JFrame frame;
	private Container contentPane;
	private JLabel msgLbl, noLbl, leavLbl;
	private JButton vipBtn, normalBtn;
	private static Customer cust;

	public Main() {
		frame = new JFrame("取号台");
		contentPane = frame.getContentPane();
		cust = new Customer();
		frame.setBounds(500, 300, 300, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		init();
		frame.setVisible(true);

	}

	private void init() {
		frame.setLayout(null);

		msgLbl = new JLabel("尊敬的客户:");
		leavLbl = new JLabel("***************");
		noLbl = new JLabel("**************");
		msgLbl.setBounds(10, 10, 180, 30);
		leavLbl.setBounds(50, 80, 170, 20);
		noLbl.setBounds(50, 100, 150, 20);
		contentPane.add(msgLbl);
		contentPane.add(leavLbl);
		contentPane.add(noLbl);

		vipBtn = new JButton("贵宾用户取号");
		vipBtn.addActionListener(this);

		normalBtn = new JButton("普通用户取号");
		normalBtn.addActionListener(this);

		vipBtn.setBounds(40, 140, 120, 20);
		normalBtn.setBounds(150, 140, 120, 20);
		contentPane.add(vipBtn);
		contentPane.add(normalBtn);
	}

	public static void main(String[] args) throws IOException {
		Main m = new Main();
		ServerSocket server = new ServerSocket(7788);
		while(true){
			Socket client=server.accept();
			BufferedReader br = new BufferedReader
					(new InputStreamReader(client.getInputStream()));
			String msg=br.readLine();
			int cNo= Integer.parseInt(msg.trim());
			PrintWriter pw = new PrintWriter(client.getOutputStream());
			int vipLen=cust.vipLen();
			int normalLen= cust.normalLen();
			
			if (cNo==1) {
				if(vipLen<=1){
					pw.println("vip:");
					pw.flush();
					m.msgLbl.setText("目前没有客户排队");
				}else{
				int no = cust.callVip();
				pw.println("vip:"+no);
				pw.flush();
				m.msgLbl.setText("请贵宾"+no+"号到1号柜台办理业务!");
				}
			}else{
				if(vipLen>=5){
					int no=cust.callVip();
					pw.println("vip:"+no);
					pw.flush();
					m.msgLbl.setText("请贵宾"+no+"号到"+cNo+"号柜台办理业务!");

				}else{
					int no = cust.callNormal();
					pw.print("normal:"+no);
					pw.flush();
					m.msgLbl.setText("请普通客户"+no+"号,到"+cNo+"号柜台办理业务!");
					}
			}
			client.close();
			br.close();
			pw.close();
		}
	}

	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		int no = 0;
//		int leave=0;
		int len=0;
		
		if (obj == vipBtn) {
			no = cust.getVipNo();
			len = cust.vipLen();
			noLbl.setText("您是贵宾"+no+"号");
			leavLbl.setText("您前面还有"+(len-1)+"人,请耐心等待！");
		}
		if (obj == normalBtn) {
			no = cust.getNormalNo();
			len = cust.normalLen();
			noLbl.setText("您是"+no+"号");
			leavLbl.setText("您前面还有"+(len-1)+"人,请耐心等待！");
		}
		
	}
}
