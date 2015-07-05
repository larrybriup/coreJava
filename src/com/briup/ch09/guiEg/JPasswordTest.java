package com.briup.ch09.guiEg;

import java.awt.*;
import javax.swing.*;

public class JPasswordTest {
	public static void main(String[] args) {
		new PasswordFrame();
	}
}

class PasswordFrame extends JFrame{
	public PasswordFrame(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		getContentPane().setLayout(new BorderLayout());
		JPasswordField passwordField = 
				new JPasswordField("AAA");
		passwordField.setEchoChar('&');	
		getContentPane().add
		(passwordField, BorderLayout.SOUTH);
		show();
	}
}
