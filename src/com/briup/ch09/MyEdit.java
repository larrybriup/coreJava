package com.briup.ch09;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.JViewport;

public class MyEdit {
private JFrame frame;
private Container contentPane;
//声明菜单
private JMenu fileMu,editMu,helpMu;
//菜单想
private JMenuItem openItem,exitItem,copyItem,cutItem,helpItem,pasteItem;
//工具烂
private JToolBar tBar;
private JButton copyBtn,cutBtn,pasteBtn;
//自定义菜单想
private JPopupMenu popMu;
private JMenuItem copyPop,cutPop,pastePop;
//文本编辑区域
private JTextArea area;
private JScrollPane pane;

public MyEdit(){
	frame = new JFrame("MyEdit");
	contentPane=frame.getContentPane();
	frame.setBounds(10, 10, 900, 700);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	init();
		frame.setVisible(true);
	
}
public void init(){
	frame.setLayout(new BorderLayout());
//	frame.getMenuBar();
	fileMu = new JMenu("file");
	openItem = new JMenuItem("open");
	exitItem=new JMenuItem("exit");
	fileMu.add(openItem);
	fileMu.addSeparator();//分割线
	fileMu.add(exitItem);
	
	editMu =new JMenu("edit");
	copyItem= new JMenuItem("copy");
	cutItem= new JMenuItem("cut");
	pasteItem= new JMenuItem("paste");
	editMu.add(copyItem);
	editMu.addSeparator();
	editMu.add(cutItem);
	editMu.addSeparator();
	editMu.add(pasteItem);
	
	helpMu=new JMenu("help");
	helpItem=new JMenuItem("about");
//	helpMu.addSeparator();
	helpMu.add(helpItem);
	
	JMenuBar bar = new JMenuBar();
	bar.add(fileMu);
	bar.add(editMu);
	bar.add(helpMu);
	frame.setJMenuBar(bar);
//	contentPane.add(bar,BorderLayout.SOUTH);
	tBar = new JToolBar();
	copyBtn=new JButton("copy");
	cutBtn =new JButton("cut");
	pasteBtn = new JButton("paste");
	tBar.add(copyBtn);
	tBar.add(cutBtn);
	tBar.add(pasteBtn);
	contentPane.add(tBar,BorderLayout.NORTH);
	
	area = new JTextArea();
	pane = new JScrollPane();
	JViewport port = pane.getViewport();
	port.add(area);
	contentPane.add(pane);
	
	popMu = new JPopupMenu();
	copyPop = new JMenuItem("copy");
	cutPop = new JMenuItem("cut");
	pastePop = new JMenuItem("paste");
	popMu.add(copyPop);
	popMu.add(cutPop);
	popMu.add(pastePop);
	
	area.addMouseListener(new MouseAdapter() {

		@Override
		public void mousePressed(MouseEvent e) {
			if(e.isPopupTrigger()){
				int x= e.getX();
				int y = e.getY();
				popMu.show(area,x,y);
				
			}
		
		}
		
	});
}


public static void main(String[] args) {
	new MyEdit();
}











}
