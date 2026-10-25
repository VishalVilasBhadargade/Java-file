package com.demo;

public class Vishal implements Runnable {

	@Override
	public void run() {
		System.out.println("Run Called");
		
		for(int i=0;i<=5;i++) {
			System.out.println(i + Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	public static void main(String [] arg) {
		Vishal v=new Vishal();
		
		Thread t1=new Thread(v);
		t1.start();
		
		Thread t2=new Thread(v);
		t2.start();
		
	}
	
	
	
	
}
