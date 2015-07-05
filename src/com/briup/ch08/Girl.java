package com.briup.ch08;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Girl {
	private String name;
	private Set listeners;
	public Girl(){
		this("This is tracy ");
	}
public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
public Girl(String name){
		this.name= name;
		listeners =new HashSet();
		
	}
public void addEmotionListener(EmotionListener listener){
	listeners.add(listener);
}
public void removeEmotionListener(EmotionListener listener){
	listeners.remove(listener);
}
public void happy(){
	EmotionEvent event = new EmotionEvent();
	event.setSource(this);
	event.setInfo("I'm happy");
	Iterator iter = listeners.iterator();
	while(iter.hasNext()){
		EmotionListener listener =
				(EmotionListener)iter.next();
		listener.happy(event);
	}
}
public void sad(){
	EmotionEvent event = new EmotionEvent();
	event.setSource(this);
	event.setInfo("I'm sad");
	for(Iterator iter=listeners.iterator();iter.hasNext();){
		EmotionListener listener = 
				(EmotionListener)iter.next();
		listener.sad(event);
	}
}


}















