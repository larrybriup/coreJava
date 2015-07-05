package com.briup.ch08;

public class EmotionTest {
	public static void main(String[] args) {
		 Girl girl = new Girl();
		girl.addEmotionListener(new EmotionListener() {
			
			public void sad(EmotionEvent event) {
				System.out.println(((Girl)event.getSource()).getName()+event.getInfo()+
						"I'm very very happy!Because you are sad!");
			}
			
			public void happy(EmotionEvent event) {
				System.out.println(((Girl)event.getSource()).getName()+event.getInfo()+
						"I'm very very sad!Because you are happy!");
			}
		});
		girl.happy();
		girl.sad();
	}
}
