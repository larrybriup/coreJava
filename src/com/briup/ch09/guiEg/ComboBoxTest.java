package com.briup.ch09.guiEg;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ComboBoxTest
{
	public static void main(String[] args)
	{
		new ComboBoxFrame();
	}
}

class ComboBoxFrame extends JFrame 
{
	private JComboBox faceCombo;
	private JLabel label;
	private static final int DEFAULT_SIZE = 20;
	
	public ComboBoxFrame()
	{
		setTitle("ComboBoxTest");
		setSize(800, 200);
		Container contentPane = getContentPane();
        	label = new JLabel("The quick brown fox jumps over the lazy dog.");
		label.setFont(new Font("Serif", Font.PLAIN, DEFAULT_SIZE));
		contentPane.add(label, BorderLayout.CENTER);

        faceCombo = new JComboBox();
		//faceCombo.setEditable(true);
		faceCombo.addItem("Serif");
		faceCombo.addItem("SansSerif");
		faceCombo.addItem("Monospaced");
		faceCombo.addItem("Dialog");
		faceCombo.addItem("DialogInput");

		faceCombo.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				label.setFont(new Font((String)faceCombo.getSelectedItem(), Font.PLAIN, DEFAULT_SIZE));
			}
		});

		JPanel comboPanel = new JPanel();
		comboPanel.add(faceCombo);
		contentPane.add(comboPanel, BorderLayout.SOUTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		show();
	}
}
