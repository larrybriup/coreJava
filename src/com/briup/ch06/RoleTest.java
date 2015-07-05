package com.briup.ch06;

public class RoleTest{
	public static void main(String[] args){
	Role role = new Role();
	role.name = "王麻子";
	Arms arm = new Gun();
	Action bullet = new Bullet();
	arm.bullet = bullet;
	role.arms = arm;
	role.let();
	}
}
class Role{
	String name;
	Arms arms;
	public void let(){
		System.out.print(name+"让");
		arms.fire();
	}
}
