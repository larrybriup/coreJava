package com.briup.ch05;

public class ModifySuper{

	protected int num;
	String msg;
	public String desc;
	private boolean tags;

}

class ModifyTest{
	
	int i;
	public void show(){
		ModifySuper modify = new ModifySuper();
	//	modify.tags = true;//同包不同类私有无法调
		modify.msg = "msg";
		modify.num = 0;
		modify.desc = "desc";
	}
	public static void main(String[] args){
		ModifyTest mt = new ModifyTest();
		mt.i = 100;
		mt.show();
	}
}
