package com.tcs.sample.Threads;

public class Printer {
	public synchronized void print(String msg) {
		System.out.println("Printer started....wait for some time");
		synchronized(this) {
		
		for(int i=0;i<=10;i++) {
			System.out.println(msg);
			try {
				Thread.sleep(100);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
		System.out.println("Printer stopped");
	}

	
}


