package com.briup.ch10;

public class GetTickets implements Runnable {
	private TicketOffice office;

//	public GetTickets() {
//		office = new TicketOffice();
//		new Thread(this).start();
//	}

	public GetTickets(String name,TicketOffice office) {
//		office = new TicketOffice(50);
		this.office=office;
		Thread t = new Thread(this);
		
		t.setName(name);
		t.start();
	}

	 public void run() {
		 
		while (true) {
			synchronized (office){
			office.selesTicket();
			System.out.println(Thread.currentThread().getName()
					+ " execute and tickets count is : " + office.getNums());
			try {
				Thread.sleep(50);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		 }
	}
	public static void main(String[] args) {
		TicketOffice office = new TicketOffice(20);
		new GetTickets("北京火车站",office);
		new GetTickets("12306",office);
		new GetTickets("南京火车站",office);
	}

	
	
	
	
	
	
	
	
	
	
	
}
