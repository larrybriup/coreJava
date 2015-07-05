package com.briup.ch06;
public interface List{
boolean add(Object obj);
void add(int index,Object obj);
void clear();
Object get(int index);
Iterator iterator();
Object remove(int index);
boolean remove(Object obj);
int size();
}
