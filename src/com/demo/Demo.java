package com.demo;



public class Demo extends Thread {

	@Override
	public void run() {
		System.out.println("Run Method called :"+Thread.currentThread().getName());
		
		for(int i=0;i<=5;i++) {
			
			System.out.println(i + Thread.currentThread().getName());
		}
		
	}
	
	public static void main(String[] arg) {
      
		Demo demo=new Demo();
		demo.setName("ram");
//		System.out.println(demo.getName());
		demo.start();
//		
//		Demo demo2=new Demo();
//		demo2.setName("Shyam");
////		System.out.println(demo2.getName());
//		demo2.start();
//		
//		Demo demo3=new Demo();
//		demo3.setName("Rahuk");
////		System.out.println(demo3.getName());
//		demo3.start();
//		
//		Demo demo4=new Demo();
//		demo4.setName("Shri");
////		System.out.println(demo4.getName());
//		demo4.start();
		
	}
}
