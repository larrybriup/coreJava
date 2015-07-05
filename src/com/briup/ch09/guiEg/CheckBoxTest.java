package com.briup.ch09.guiEg;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CheckBoxTest
{
	public static void main(String[] args)
	{
		new CheckBoxFrame();
	}
}

class CheckBoxFrame extends JFrame 
{
	private static final int FONTSIZE = 25;
	private JLabel label;
	private JCheckBox bold;
	private JCheckBox italic;
   
	public CheckBoxFrame()
	{  
		setTitle("CheckBoxTest");
		setSize(600, 200);
		Container contentPane = getContentPane();
        	label = new JLabel("The quick brown fox jumps over the lazy dog.");
		label.setFont(new Font("Serif", Font.PLAIN, FONTSIZE));
		contentPane.add(label, BorderLayout.CENTER);
		ActionListener listener = new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				int mode = 0;
				if (bold.isSelected()) mode += Font.BOLD; 
				if (italic.isSelected()) mode += Font.ITALIC;
				label.setFont(new Font("Serif", mode, FONTSIZE));
			}
        	};
		JPanel buttonPanel = new JPanel();
		bold = new JCheckBox("Bold");
		bold.addActionListener(listener);
		buttonPanel.add(bold);
		italic = new JCheckBox("Italic");
		italic.addActionListener(listener);
		buttonPanel.add(italic);
		contentPane.add(buttonPanel, BorderLayout.SOUTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//show();
	}
	public static void main(String[] args) {
		new CheckBoxFrame().setVisible(true);
	}
}
