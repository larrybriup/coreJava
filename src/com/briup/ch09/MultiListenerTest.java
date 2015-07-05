package com.briup.ch09;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MultiListenerTest extends WindowAdapter implements MouseListener,
		MouseMotionListener {
	private JFrame frame;
    private Container contentPane;
    private JLabel msg;
    private JPanel center;
    public MultiListenerTest(){
    	frame=new JFrame();
    	contentPane= frame.getContentPane();
    	frame.setBounds(100, 200, 300, 300);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	init();
    	frame.setVisible(true);
    }
    public void init(){
    	msg=new JLabel("etet");
    	msg.setHorizontalAlignment(msg.HORIZONTAL);
    	contentPane.add(msg,BorderLayout.NORTH);
    	msg.setBackground(Color.white);
    	center = new JPanel();
    	contentPane.add(center);
    	center.setBackground(Color.gray);
    	center.addMouseMotionListener(this);
    	center.addMouseListener(this);
    	frame.addWindowListener(this);
    	
    	
    }
	
	public static void main(String[] args) {
		new MultiListenerTest();
	}
	@Override
	public void windowClosing(WindowEvent e) {
		// // TODO Auto-generated method stub
		// super.windowClosing(e);
		System.out.println("Window closing!");
	}

	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		int x=e.getX();
		int y=e.getY();
		msg.setText("Mouse Dragged:x="+x+" y="+y);
	}

	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		int x=e.getX();
		int y=e.getY();
		msg.setText("Mouse Moved:x="+x+" y="+y);
	}

	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		int x=e.getX();
		int y=e.getY();
		msg.setText("Mouse Clicked:x="+x+" y="+y);
	}

	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		int x=e.getX();
		int y=e.getY();
		msg.setText("Mouse Pressed:x="+x+" y="+y);
	}

	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		int x=e.getX();
		int y=e.getY();
		msg.setText("Mouse Released:x="+x+" y="+y);
		System.out.println("Mouse Released:x="+x+" y="+y);
	}

	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		int x=e.getX();
		int y=e.getY();
		msg.setText("Mouse Entered:x="+x+" y="+y);
		System.out.println("Mouse Enteredx="+x+" y="+y);
	}

	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		int x=e.getX();
		int y=e.getY();
		msg.setText("Mouse Exited:x="+x+" y="+y);
	}

}
