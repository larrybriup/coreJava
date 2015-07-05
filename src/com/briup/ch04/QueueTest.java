package com.briup.ch04;
public class QueueTest{

public static void main(String[] args){

Queue q = new Queue();
q.inqueue(30);
q.inqueue(1);
q.inqueue(23);
q.inqueue(34);
q.inqueue(56);
q.inqueue(445);
System.out.println(q.length());
System.out.println(q.query(1));
int val = q.dequeue();
System.out.println("val="+val+"\n"+"length="+q.length());

}

}
