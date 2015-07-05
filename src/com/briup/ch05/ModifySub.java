package com.briup.ch05;


public class ModifySub extends ModifySuper{
	public void print(){
		num = 100;
		//msg = "abc";
		desc = "this is sub's desc";
		//tags = true;
	}
}


class ModifyLast{

	public void print(){
		ModifySuper ms = new ModifySuper();

	//	ms.num = 30;

		ms.desc = "this is ls desc";
	}
}
