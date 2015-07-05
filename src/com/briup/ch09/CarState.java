package com.briup.ch09;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
//import java.util.Timer;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class CarState implements ActionListener {
	private JFrame frame;
	private Container contentPane;
	// 北边的按钮
	private JButton forward, left, right;

	// 中间的按钮
	private JButton[] btns;
	// 老鼠出现位置的索引
	private int index;
	private Car car;

	public CarState() {
		frame = new JFrame("CarState");
		contentPane = frame.getContentPane();
		frame.setBounds(800, 200, 400, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		car = new Car();
		index = 4;
		
		init();
		frame.setVisible(true);

	}

	public void init() {
		frame.setLayout(new BorderLayout());
		// 次级容器
		JPanel northPanel = new JPanel();
		northPanel.setLayout(new FlowLayout());
		forward = new JButton("Forward");
		left = new JButton("turn left");
		right = new JButton("turn right");
		northPanel.add(forward);
		northPanel.add(left);
		northPanel.add(right);
		contentPane.add(northPanel, BorderLayout.NORTH);
		forward.addActionListener(this);
		left.addActionListener(this);
		right.addActionListener(this);

		JPanel centerPanel = new JPanel();
		centerPanel.setLayout(new GridLayout(3, 3));
		btns = new JButton[9];
		for (int i = 0; i < btns.length; i++) {
			btns[i] = new JButton();
			
			//btns[i].se tIcon(new ImageIcon("bin/com/briup/ch09/east.jpg"));
			centerPanel.add(btns[i]);
		}
		btns[4].setIcon(new ImageIcon("bin/com/briup/ch09/north.jpg"));
		contentPane.add(centerPanel);
	}

	public static void main(String[] args) {
		new CarState();
	}

	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if (obj == forward) {
			car.forward();
		}
		if (obj == left) {
			car.left();
		}
		if (obj == right) {
			car.right();
		}
		btns[index].setIcon(null);
		
		index= index(car.getX(),car.getY());
		btns[index].setIcon(car.getState().icon);
	}

	public int index(int x, int y) {
		
		return (x-3*y+4);
		
	}

}
