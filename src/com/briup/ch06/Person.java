package com.briup.ch06;

public class Person //implements Comparable{
{
	private int id;
	private String name;
	private boolean gender;
	private int age;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @param j 
	 * @param b 
	 * @param string 
	 * @param i 
	 */
	public Person(){}
	public Person(int id, String name, boolean gender, int age) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	/**
	 * @return the gender
	 */
	public boolean isGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "name="+name+" gender="+gender+" age="+age;
	}
	public boolean equals(Object obj){
		//return "id="+id+
		if(obj==null) return false;
		if(obj==this) return true;
		if(obj.getClass()!=this.getClass()) 
			return false;
		Person p = (Person)obj;
		return id==p.id && name.equals(p.name);
	}
	public int hashCode(){
		
		return id+age;
	}
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return this.id-((Person)o).id;
	}
	
		
	
	
}
