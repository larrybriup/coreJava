package com.briup.ch10;

public class TicketOffice {
	private int nums;

	public TicketOffice() {
		// TODO Auto-generated method stub

	}

	public TicketOffice(int nums) {
		// TODO Auto-generated method stub
		this.nums = nums;
	}

	/* synchronized */public void selesTicket() {
		int num = nums - 1;
		if (num < 0) {
			System.out
					.println(Thread.currentThread().getName() + " 购票，没有足够的票！");
			System.exit(1);
		}
		if (num >= 0) {
			System.out.println(Thread.currentThread().getName() + " 购票成功！");
			nums--;
		}

		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

	public int getNums() {
		return nums;
	}

	public void setNums(int nums) {
		this.nums = nums;
	}

}
