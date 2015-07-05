package com.briup.ch08;
import java.awt.*;
import java.applet.Applet;

public class buttonDir extends Applet {
  public void init() {//applet
    setLayout(new BorderLayout());
    add(new Button("North"), BorderLayout.NORTH);
    add(new Button("South"), BorderLayout.SOUTH);
    add(new Button("East"), BorderLayout.EAST);
    add(new Button("West"), BorderLayout.WEST);
    add(new Button("Center"), BorderLayout.CENTER);
  }
}
