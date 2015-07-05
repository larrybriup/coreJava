package com.briup.ch06;

public interface Action{
	void fly();
}

class Bullet implements Action{
	public void fly(){
		System.out.println("嗖嗖的飞...");
	}
}
abstract class Arms{
	protected Action bullet;
	public abstract void fire();
}

class Gun extends Arms{
	public void fire(){
		System.out.print("子弹");
		bullet.fly();
	}
}


