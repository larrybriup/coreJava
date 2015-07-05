package com.briup.ch08;

import java.awt.BorderLayout;
import java.awt.Container;
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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class MousePlay implements ActionListener {
	private JFrame frame;
	private Container contentPane;
	// 北边的按钮
	private JComboBox levels;
	private JLabel timeLbl, centLbl;
	private JButton startBtn;
	// 中间的按钮
	private JButton[] btns;
	// 计时器
	private Timer t1, t2;// t1控制老鼠出现的频率,t2倒计时
	// 图片索引
	private ImageIcon icon;
	// 老鼠出现位置的索引
	private int index;
	// 标识老鼠是否被打过
	private boolean flag;
	//判斷按鈕開關标记
	private int c = 0;

	public MousePlay() {
		frame = new JFrame("MousePlay");
		contentPane = frame.getContentPane();
		frame.setBounds(1000, 200, 300, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		t1 = new Timer(700, this);
		t2 = new Timer(1000, this);
		init();
		frame.setVisible(true);

	}

	public void init() {
		frame.setLayout(new BorderLayout());
		// 次级容器
		JPanel northPanel = new JPanel();
		levels = new JComboBox(new Object[] { "初级", "中级", "高级" });
		levels.addItemListener(new ItemListener() {

			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				Object obj = e.getItem();
				if ("初级".equals(obj)) {
					t1 = new Timer(7000, MousePlay.this);
				} else if ("中级".equals(obj)) {
					t1 = new Timer(400, MousePlay.this);
				} else if ("高级".equals(obj)) {
					t1 = new Timer(100, MousePlay.this);
				}
			}
		});
		timeLbl = new JLabel("15");
		centLbl = new JLabel("0");
		startBtn = new JButton("开始");

		startBtn.addActionListener(this);
		icon = new ImageIcon("bin/com/briup/ch08/mouse.jpg");
		northPanel.add(levels);
		northPanel.add(new Label("时间:"));
		northPanel.add(timeLbl);
		northPanel.add(new Label("分数:"));
		northPanel.add(centLbl);
		northPanel.add(startBtn);
		contentPane.add(northPanel, BorderLayout.NORTH);
		JPanel centerPanel = new JPanel();
		centerPanel.setLayout(new GridLayout(3, 3));
		btns = new JButton[9];
		for (int i = 0; i < btns.length; i++) {
			btns[i] = new JButton();
			btns[i].setEnabled(false);
			btns[i].addActionListener(this);
			centerPanel.add(btns[i]);
		}
		contentPane.add(centerPanel);
	}

	public static void main(String[] args) {
		new MousePlay();
	}

	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if (obj == t1) {// 出现老鼠
			btns[index].setIcon(null);// 清除按钮图片
			index = (int) (Math.random() * 9);
			btns[index].setIcon(icon);
			flag = true;
		}
		if (obj == t2) {
			/**
			 * 获取页面数据，判断是否为0，为0停止 清除老鼠
			 */
			int time = Integer.parseInt(timeLbl.getText().trim());
			if (time == 0) {
				t1.stop();
				t2.stop();
				c=0;
				
				btns[index].setIcon(null);
				timeLbl.setText("15");
				startBtn.setText("开始");
				JOptionPane.showMessageDialog(null, Integer.parseInt(centLbl.getText().trim())+"分，恭喜您！","游戏结束！",JOptionPane.INFORMATION_MESSAGE);
				for (int i = 0; i < btns.length; i++) {
					btns[i].setEnabled(false);
					levels.setEnabled(true);
					startBtn.setEnabled(true);

				}
				centLbl.setText(0+" ");
			} else {
				time--;
				timeLbl.setText(time + "");
			}
		}

		int d = 0;
		if (obj == startBtn) {
			// 启动t1老鼠开始出现，t2开始倒计时,btns按钮可操作，start按钮不可操作，levels按钮不可操作
			/*
			 * if(d==0){ t1.start(); t2.start(); centLbl.setText("0"); for (int
			 * i = 0; i < btns.length; i++) btns[i].setEnabled(true);
			 * levels.setEnabled(false); //startBtn.setEnabled(false);
			 * startBtn.setText("暂停"); } d++;
			 */
			if (c % 2 == 0) {
				t1.start();
				t2.start();
				// centLbl.setText("0");
				for (int i = 0; i < btns.length; i++)
					btns[i].setEnabled(true);
				levels.setEnabled(false);
				// startBtn.setEnabled(false);
				startBtn.setText("暂停");
			}
			// if(!(c%2==0)){
			else {
				t1.stop();
				t2.stop();
				 for (int i = 0; i < btns.length; i++)
				 btns[i].setEnabled(false);
				levels.setEnabled(false);
				startBtn.setText("开始");

			}
			c++;

		}
		int cent = Integer.parseInt(centLbl.getText().trim());
		if (obj == btns[index] && flag) {//?
			
			cent++;
			centLbl.setText(cent + "");
			flag = false;
		}
	}

}
