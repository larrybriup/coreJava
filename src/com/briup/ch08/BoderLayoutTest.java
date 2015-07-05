package com.briup.ch08;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BoderLayoutTest {
	private JFrame frame;
	private Container contentPane;
	private JButton northBtn, southBtn, westBtn, eastBtn, centerBtn;

	public BoderLayoutTest() {
		frame = new JFrame("BorderLayout");
		contentPane = frame.getContentPane();
		frame.setSize(600, 500);
		frame.setLocation(100, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		init();
		frame.setVisible(true);
	}

	public void init() {
		frame.setLayout(new BorderLayout());
		northBtn = new JButton("north");
		southBtn = new JButton("south");
		westBtn = new JButton("west");
		eastBtn = new JButton("east");
		centerBtn = new JButton("centerth");
		contentPane.add(northBtn, BorderLayout.NORTH);
		contentPane.add(southBtn, BorderLayout.SOUTH);
		contentPane.add(westBtn, BorderLayout.WEST);
		contentPane.add(eastBtn, BorderLayout.EAST);
		contentPane.add(centerBtn, BorderLayout.CENTER);

	}

	public static void main(String[] args) {
		new BoderLayoutTest();
	}
}
