package com.briup.ch08;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class CardLayoutTest {

	private JFrame frame;
	private Container contentPane;
	private JButton btns[];

	public CardLayoutTest() {
		frame = new JFrame();
		contentPane = frame.getContentPane();
		frame.setTitle("CardLayoutTest");
		frame.setBounds(100, 200, 345, 465);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		init();
		frame.setVisible(true);

	}

	public void init() {
		final CardLayout layout = new CardLayout();
		frame.setLayout(layout);
		btns = new JButton[5];
		for (int i = 0; i < btns.length; i++) {
			btns[i] = new JButton((i + 1) + "");
			btns[i].addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {

					layout.next(contentPane);

				}
			});
			contentPane.add(btns[i], i + "");

		}

	}

	public static void main(String[] args) {

		new CardLayoutTest();

	}
}
