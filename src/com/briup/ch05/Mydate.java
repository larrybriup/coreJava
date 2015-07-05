package com.briup.ch05;

/*
 要求：
 1、将Mydate改为封装类
 2、year的有效范围为1900~2100
 3、month的有效范围为1~12
 4、day的有效范围根据month确定，2月为1~28
 5、year、month、day的值如果在有效范围之外，不执行赋值操作
 6、修改Teacher和TeacherTest，实现对封装后的Mydate类进行调用

 7、将所有方法参数改为与属性相同的名称，使用this进行处理
 8、增加构造器Mydate(int year, int month)和
 Mydate(int year)，
 month和day属性可以使用1作为调用构造器的参数值
 */
public class Mydate {
	private int year;
	private int month;
	private int day;

	public Mydate(int year, int month, int day) {
		setYear(year);
		setMonth(month);
		setDay(day);
	}

	public Mydate(int year) {
		this(year, 1, 1);
	}

	public Mydate(int year, int month) {
		this(year, month, 1);
	}

	public void setYear(int year) {
		if (year >= 1900 && year <= 2100)
			this.year = year;
	}

	public int getYear() {
		return year;
	}

	public void setMonth(int month) {
		if (month >= 1 && month <= 12)
			this.month = month;
	}

	public int getMonth() {
		return month;
	}

	public void setDay(int day) {
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			if (day >= 1 && day <= 31)
				this.day = day;
			break;
		case 2:
			if (day >= 1 && day <= 28)
				this.day = day;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			if (day >= 1 && day <= 30)
				this.day = day;
			break;
		}
	}

	public int getDay() {
		return day;
	}

	public String getDate() {
		return year + "-" + month + "-" + day;
	}
}
