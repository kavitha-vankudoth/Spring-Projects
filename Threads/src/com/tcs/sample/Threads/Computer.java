package com.tcs.sample.Threads;

public class Computer extends Thread{
	
	Printer obj;
	String msg;
	
	public Computer(String msg,Printer obj) {
		this.msg=msg;
		this.obj=obj;
	}
	public void run() {
		obj.print(msg);
	}

}
