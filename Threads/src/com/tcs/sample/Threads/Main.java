package com.tcs.sample.Threads;

public class Main {
	public static void main(String[] args) {
		
		MyThread m1=new MyThread("hello Thread");
		MyThread m2=new MyThread("welcome THread");
		MyThread m3=new MyThread("upload Thread");
		Thread t1=new Thread(m1);
		Thread t2=new Thread(m2);
		Thread t3=new Thread(m3);
		
		t1.start();
		t2.start();
		t3.start();
	}

}
