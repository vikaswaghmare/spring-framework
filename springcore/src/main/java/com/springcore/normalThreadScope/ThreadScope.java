package com.springcore.normalThreadScope;

public class ThreadScope extends ThreadLocal<String> {

	@Override
	protected String initialValue() {
		// TODO Auto-generated method stub
		return "no data found for the thread because no scope";
	}
}

class A{
	 
	public void m1() {
		System.out.println("m1 mehtod t1 "+Thread1.threadScope1.get());
		System.out.println("m1 mehtod t2 "+Thread2.threadScope2.get());
	}
	
	public void m2() {
		System.out.println("m2 mehtod t2 "+Thread2.threadScope2.get());
		System.out.println("m2 mehtod t1 "+Thread1.threadScope1.get());
	}
	
}

class Thread1 extends Thread{
	static ThreadScope threadScope1=new ThreadScope();
	A a;
	
	public Thread1(A a) {
		this.a=a;
		
	}
	@Override
	public void run() {
		threadScope1.set("Cool1");
		a.m1();
	}
	
}

class Thread2 extends Thread{
	static ThreadScope threadScope2=new ThreadScope();
	A a;
	
	public Thread2(A a) {
		this.a=a;
		
	}
	@Override
	public void run() {
		threadScope2.set("Cool2");
		a.m2();
	}
	
}