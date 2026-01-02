package com.tcs.sample.Threads;

public class MyThread implements Runnable{
	private String msg;
	public MyThread(String msg) {
		this.msg=msg;
	}
	
	public void run() {
		for (int i=0;i<=10;i++) {
			System.out.println(msg);
			try {
				Thread.sleep(300);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}
}
