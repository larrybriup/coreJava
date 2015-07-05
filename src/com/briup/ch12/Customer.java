package com.briup.ch12;

import java.util.LinkedList;

public class Customer {
	private LinkedList vips;
	private LinkedList normals;
	private int vipNo, normalNo;
	

	public Customer() {
		vips = new LinkedList();
		normals = new LinkedList();
		vipNo = 1;
		normalNo = 1;

	}

	public int getVipNo() {
		vips.add(vipNo);
		return vipNo++;
	}

	public int getNormalNo() {
		normals.add(normalNo);
		return normalNo++;
	}

	public int vipLen() {
		return vips.size();
	}

	public int normalLen() {
		return normals.size();
	}
	public int callVip(){
		return (Integer)vips.removeFirst();
	}
	public int callNormal(){
		return (Integer)normals.removeFirst();
	}
}
