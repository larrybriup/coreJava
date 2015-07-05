package com.briup.ch09;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.Timer;

public class HorsePlay extends JFrame implements ActionListener, MouseListener {
	/**
	 * 小马过河 // *
	 */
	//
	private Container contentPane;
	private JButton restartBtn, exitBtn, stopBtn, lineBtn;
	//中间的间隔先
	private JButton[] rivers;
	private JLabel[] horses;
	//右边文本显示区域
	private JTextField[] pos;
	//计时器
	private Timer timer;
	//调速条
	private JComboBox speed;
	//c判断是否开始暂停的加以标记
	private int c = 0;
	private int s = 0;

	public HorsePlay() {
		this.setTitle("HorsePlay");
		contentPane = this.getContentPane();
		this.setBounds(250, 70, 900, 650);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		timer = new Timer(500, this);
		init();
		this.setVisible(true);
	}

	public void init() {
		this.setLayout(null);
		horses = new JLabel[3];
		pos = new JTextField[3];
		rivers = new JButton[4];
		int high = 50;
		for (int i = 0; i < horses.length; i++) {
			horses[i] = new JLabel(new ImageIcon("bin/com/briup/ch09/h"
					+ (i + 1) + ".gif"));
			horses[i].setSize(180, 150);
			horses[i].setLocation(10, high + 150 * i);
			contentPane.add(horses[i]);

			pos[i] = new JTextField();
			pos[i].setSize(50, 30);
			pos[i].setLocation(800, high + 220 * i);
			pos[i].setEnabled(false);
			pos[i].setText(0 + "米");
			pos[i].setCaretColor(Color.RED);
			pos[i].setBackground(Color.BLACK);
			pos[i].setCaretPosition(Font.CENTER_BASELINE);
			contentPane.add(pos[i]);

			rivers[i] = new JButton();
			// new ImageIcon("bin/com/briup/ch09/east.jpg"));
			rivers[i].setSize(770, 10);
			rivers[i].setLocation(0, high + 160 * i);
			rivers[i].setBackground(Color.YELLOW);
			contentPane.add(rivers[i]);
		}
		speed = new JComboBox(new Object[] { "慢速", "中速", "快速" });
		speed.addItemListener(new ItemListener() {

			public void itemStateChanged(ItemEvent e) {
				Object obj = e.getItem();
				if ("慢速".equals(obj)) {
					timer = new Timer(300, HorsePlay.this);
				}
				if ("中速".equals(obj)) {
					timer = new Timer(100, HorsePlay.this);
				}
				if ("快速".equals(obj)) {
					timer = new Timer(10, HorsePlay.this);
				}
			}
		});
		//contentPane.add(new Label("grgergr"),BorderLayout.SOUTH);
		speed.setSize(70, 20);
		speed.setLocation(550, 555);
		contentPane.add(speed);

		lineBtn = new JButton();
		restartBtn = new JButton("重新开始");
		stopBtn = new JButton("开始");
		exitBtn = new JButton("退出");

		lineBtn.setSize(5, 600);
		lineBtn.setLocation(770, 0);
		lineBtn.setBackground(Color.red);
		contentPane.add(lineBtn);

		restartBtn.setSize(86, 30);
		restartBtn.setLocation(314, 550);
		restartBtn.addActionListener(this);
		contentPane.add(restartBtn);

		stopBtn.setSize(60, 30);
		stopBtn.setLocation(400, 550);
		stopBtn.addMouseListener(this);
		contentPane.add(stopBtn);

		exitBtn.setSize(60, 30);
		exitBtn.setLocation(450, 550);
		exitBtn.addActionListener(this);
		contentPane.add(exitBtn);
		contentPane.setBackground(Color.WHITE);

		rivers[3] = new JButton();
		rivers[3].setSize(770, 10);
		rivers[3].setLocation(0, 530);
		rivers[3].setBackground(Color.YELLOW);
		contentPane.add(rivers[3]);

	}

	public static void main(String[] args) {
		new HorsePlay();
	}

	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if (obj == timer) {
			/**
			 * 每激发一次，随机对每一匹马产生一个距离，然后修改label的坐标 移动图片，当图片的坐标最先达到600是，结束
			 */
			for (int i = 0; i < horses.length; i++) {
				s = (int) (Math.random() * 10);
				int x = horses[i].getX() + s;
				horses[i].setLocation(x, horses[i].getY());
				pos[i].setText(x + "米");
				if (x >= 600) {
					timer.stop();
					stopBtn.setEnabled(false);
					JOptionPane.showMessageDialog(null, "Horse " + (i + 1)
							+ " is the winner.", "Congratulatios!",
							JOptionPane.INFORMATION_MESSAGE, new ImageIcon(
									"bin/com/briup/ch09/h" + (i + 1) + ".gif"));
//					"../pictrues/h" + (i + 1) + ".gif"));
					File file = new File("../pictrues/");
					System.out.println(file.getAbsolutePath());
					break;
				}
			}
		}
		if (obj == restartBtn) {
			timer.restart();// 启动计时器
			timer.stop();
			s = 0;
			c = 0;
			// timer.start();// 启动计时器
			// restartBtn.setText("重新开始");
			stopBtn.setText("开始");
			stopBtn.setEnabled(true);
			speed.setEnabled(true);

			int high = 10;
			for (int i = 0; i < horses.length; i++) {
				horses[i].setSize(180, 180);
				horses[i].setLocation(10, high + 150 * i);
				contentPane.add(horses[i]);
				pos[i].setText(0 + "米");

			}
		}
		if (obj == exitBtn) {
			System.exit(0);
		}
	}

	public void mouseClicked(MouseEvent e) {
		Object obj = e.getSource();

		if (obj == stopBtn) {

			if (c % 2 == 0) {
				timer.start();
				stopBtn.setText("暂停");
				speed.setEnabled(false);
			} else {

				timer.stop();
				stopBtn.setText("继续");
			}
			c++;
		}

	}

	public void mousePressed(MouseEvent e) {

	}

	public void mouseReleased(MouseEvent e) {

	}

	public void mouseEntered(MouseEvent e) {

	}

	public void mouseExited(MouseEvent e) {
	}

}
