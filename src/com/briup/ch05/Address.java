package com.briup.ch05;

public class Address{

	private String city;
	private String street;
	
	public String print(){
		return this.street+" "+this.city;
	}
	public void setCity(String city){
		this.city = city;
	}
	public String getCity(){
		return this.city;
	}
	
	public void setStreet(String street){
		this.street = street;
	}
	public String getStreet(){
		return this.street;
	}

}
