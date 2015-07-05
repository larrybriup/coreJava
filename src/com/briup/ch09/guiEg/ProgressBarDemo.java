package com.briup.ch09.guiEg;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;

public class ProgressBarDemo implements ActionListener,ChangeListener
{
    JFrame f;
    JProgressBar progressbar;
    JLabel label;
    Timer timer;
    JButton b;
    
    public ProgressBarDemo()                           
    {
        f = new JFrame("progressbar Example");
        Container contentPane = f.getContentPane();
        
        label = new JLabel(" ", JLabel.CENTER);
        progressbar = new JProgressBar();
        progressbar.setOrientation(JProgressBar.HORIZONTAL);
        progressbar.setMinimum(0);
        progressbar.setMaximum(100);
        progressbar.setValue(0);
        progressbar.setStringPainted(true);
        progressbar.addChangeListener(this);
        
        JPanel panel = new JPanel();
        b = new JButton("Start");
        b.addActionListener(this);
        panel.add(b);
        
        timer = new Timer(500, this);
        
        contentPane.add(panel,BorderLayout.NORTH);
        contentPane.add(progressbar,BorderLayout.CENTER);
        contentPane.add(label,BorderLayout.SOUTH);
        
        f.pack();
        f.setVisible(true);        
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args)
    {
        new ProgressBarDemo();
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == b)
        {
            timer.start();
        }            
        if(e.getSource() == timer)
        {
            int value = progressbar.getValue();
            if(value < 100)
            {
                value++;
                progressbar.setValue(value);
            }
            else
            {
                timer.stop();
                progressbar.setValue(0);
            }
        }
    }
            
    public void stateChanged(ChangeEvent e1)
    {
        int value = progressbar.getValue();
        if(e1.getSource() == progressbar)
        {            	
			label.setText("当前进度："+Integer.toString(value)+" %"); 
        }
    }
}
