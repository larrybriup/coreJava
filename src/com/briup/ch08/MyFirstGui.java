package com.briup.ch08;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MyFirstGui {
	//准备容器
	private JFrame frame;//顶级容器
	private Container container;//附属容器
	private JTextField txt1,txt2,txt3;
	private JLabel addlbl,eqlbl;
	private JButton resBtn;
	public MyFirstGui(){
		frame = new JFrame("MyFirstGui");
		container = frame.getContentPane();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(290, 150, 600, 80);
		init();
	}
	public void init(){
		//设定布局管理器
		frame.setLayout(new FlowLayout());
		//初始化组件
		txt1 = new JTextField(10);
		txt2 = new JTextField(10);
		txt3 = new JTextField(10);
		addlbl = new JLabel("+");
		eqlbl = new JLabel("=");
		resBtn = new JButton("计算");
		resBtn.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int val1=Integer.parseInt
						(txt1.getText());
				int val2=Integer.parseInt
						(txt2.getText());
				txt3.setText((val1+val2)+"");
						
			}
		});
		//将组件放入容器
		container.add(txt1);
		container.add(addlbl);
		
		container.add(txt2);
		container.add(eqlbl);
		container.add(txt3);
		container.add(resBtn);
		
		
		
		
		
	}
	public void go(){
		frame.setVisible(true);
	}
	public static void main(String[] args) {
       new MyFirstGui().go();
	}
}
