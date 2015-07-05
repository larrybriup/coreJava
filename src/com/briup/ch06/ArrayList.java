package com.briup.ch06;
public class ArrayList implements List{
	private Object[] objs;
	private int index;
    private int max_size;
	public ArrayList(){
		this(5);
	}
	public ArrayList(int max_size){
	  this.max_size = max_size;
	  objs = new Object[max_size];
	  index  = 0;

	}
	private void reset(){
	   Object[] temp = new Object[max_size+=3];
	   System.arraycopy(objs,0,temp,0,index);
	   objs = temp;
	   temp = null;
	}
   public boolean add(Object obj){//将传入的元素放入链表末尾
      if(index>=max_size)
		  reset();
	   objs[index++] = obj;
	   return false;
   }
public Iterator iterator(){

return new Iterator(){
   private int index = -1;

   public Object next(){//获取下一个元素
   return objs[index] ;
   }
   public boolean hasNext(){//有没有下一个元素
	    if(++index<ArrayList.this.index)

   return true;
		return false;
   }
   public void remove(){//删除当前获取的元素，实际是删除集合中的元素
      ArrayList.this.remove(index);
   index--;
   }
};
}

public void add(int index,Object obj){//指定位置插入元素
   if(this.index>=max_size)
	   reset();
   if(index>=0&&index<=this.index){
	   for(int i=this.index;i>index;i--){
	      objs[i] = objs[i-1];
	   
	   
	   }
	   objs[index]=obj;
	   this.index++;
   }else{
   return; 
   }
}
public void clear(){//清空链表
index = 0;
for(int i=0;i<index;i++){
   objs[i] = null;
}
index = 0;
}
public Object get(int index){//得到指定元素
	if(index>=0&&index<this.index)
		return objs[index];
	return null;
}
public Object remove(int index){//删除指定元素
if(index>=0&&index<this.index){
  Object obj = objs[index];
  for(int i=index;i<this.index-1;i++){
   objs[i] = objs[i+1];
  }
  this.index--;
  return obj;
}
	
return null;
}
public boolean remove(Object obj){//删除指定的元素
	int index = -1;
	if(obj!=null){
		for(int i=0;i<this.index;i++){
	       if(objs[i].equals(obj)){
		   index = i;
		   break;
		   }	
		}
	
		if(index>=0){
	       remove(index);
			return true;
	}
	
	return false;
	}
return false;
}
public int size(){//返回数组元素个数
   return index;
}
}
