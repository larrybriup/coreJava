package com.briup.ch05;

public class ShapeTest{
	public void draw(Shape shape){
		shape.draw();
	}
	public void draw(Shape shape,String title){
		shape.draw(title);
	}
	public static void main(String[] args){
		//构建父类对象，调用draw();
		//构建子类类型对象，调用draw（）
		//构建一个父类指向子类的变量，调用draw()
		//将父类指向换成另一个子列类型
		//父类中添加方法print使用上一步的方法调用
		//在父类指向的子类中添加show方法使用4的变量调用show
		ShapeTest s = new ShapeTest();
		Shape sh = new Shape();
		s.draw(sh);
		s.draw(sh,"shape");
		Circle cc = new Circle();
		s.draw(cc);
		s.draw(cc,"circle");
		
		Rectangle rt = new Rectangle();
		s.draw(rt);
		s.draw(rt,"rectangle");
		sh = cc;
		s.draw(sh);
		s.draw(sh,"P_C");
		sh = rt;
		s.draw(sh);
		s.draw(sh,"P_R");
		sh.print();
		//sh.show();
		((Rectangle)sh).show();
		
		
	}
}
