package com.briup.ch09;

import javax.swing.ImageIcon;

public class Car {
	private int x, y;
	private State state;

	public Car() {
   state = new NorthState();
	}

	public void forward() {
		state.forward();
	}

	public void left() {
		state.left();
	}

	public void right() {
		state.right();
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public void setY(int y) {
		this.y = y;
	}

	public class NorthState extends State {
      public NorthState(){
    	  icon=new ImageIcon("bin/com/briup/ch09/north.jpg");
    	  this.car=Car.this;
      }
		@Override
		public void forward() {
			// TODO Auto-generated method stub
			int x=car.x;
			int y=car.y;
			if(y+1<=1){
				y++;
			}
			
			car.x=x;
			car.y=y;
			
		}

		@Override
		public void left() {
			// TODO Auto-generated method stub
			car.state=new WestState();
		}

		@Override
		public void right() {
			// TODO Auto-generated method stub
			car.state=new EastState();
		}

	}
	public class SouthState extends State {
	      public SouthState(){
	    	  icon=new ImageIcon("bin/com/briup/ch09/south.jpg");
	    	  this.car=Car.this;
	      }
			@Override
			public void forward() {
				// TODO Auto-generated method stub
				int x=car.x;
				int y=car.y;
				if(y-1>=-1){
					y--;
				}
				car.x=x;
				car.y=y;
				
			}

			@Override
			public void left() {
				// TODO Auto-generated method stub
				car.state=new EastState();
			}

			@Override
			public void right() {
				// TODO Auto-generated method stub
				car.state=new WestState();
			}

		}
	public class WestState extends State {
	      public WestState(){
	    	  icon=new ImageIcon("bin/com/briup/ch09/west.jpg");
	    	  this.car=Car.this;
	      }
			@Override
			public void forward() {
				// TODO Auto-generated method stub
				int x=car.x;
				int y=car.y;
				if(x-1>=-1){
					x--;
				}
				car.x=x;
				car.y=y;
				
			}

			@Override
			public void left() {
				// TODO Auto-generated method stub
				car.state=new SouthState();
			}

			@Override
			public void right() {
				// TODO Auto-generated method stub
				car.state=new NorthState();
			}

		}
	public class EastState extends State {
	      public EastState(){
	    	  icon=new ImageIcon("bin/com/briup/ch09/east.jpg");
	    	  this.car=Car.this;
	      }
			@Override
			public void forward() {
				// TODO Auto-generated method stub
				int x=car.x;
				int y=car.y;
				if(x+1<=1){
					x++;
				}
				car.x=x;
				car.y=y;
				
			}

			@Override
			public void left() {
				// TODO Auto-generated method stub
				car.state=new NorthState();
			}

			@Override
			public void right() {
				// TODO Auto-generated method stub
				car.state=new SouthState();
			}

		}
}
