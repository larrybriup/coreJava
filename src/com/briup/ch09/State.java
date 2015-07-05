package com.briup.ch09;

import javax.swing.ImageIcon;

public abstract class State {
	protected Car car;
	protected ImageIcon icon;

	public State() {
	}

	public State(Car car) {
		this.car = car;
	}

	public abstract void forward();

	public abstract void left();

	public abstract void right();

}
