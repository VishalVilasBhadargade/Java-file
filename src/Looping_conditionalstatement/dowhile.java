package Looping_conditionalstatement;

import java.util.Scanner;

public class dowhile {
	public static void main(String[] arg) {
		  
		Scanner sc=new Scanner(System.in);
		String mobile="";
		int price=0;
		do {
			System.out.println("Welcome....to our shopping application");
			System.out.println("1.iphone(15k)");
			System.out.println("2.Redmi(23k)");
			System.out.println("3.real mee(15k)");
			System.out.println("4.Oppo(5k)");
			System.out.println("5.Exit");
			
			System.out.println("which mobile you want to purchase");
			
			int choice=sc.nextInt();
			if(choice==1) {
				System.out.println("You Are Selected iphone");
				mobile="Iphone";
				price=15000;
				System.out.println("Your Purchases is succesfully completed");
			}
			
			else if(choice==2) {
				System.out.println("You Are Selected iphone");
				mobile="Redmi";
				price=23000;
				System.out.println("Your Purchases is succesfully completed");
				
			}
			else if(choice==3) {
				System.out.println("You Are Selected iphone");
				mobile="Real mii";
				price=15000;
				System.out.println("Your Purchases is succesfully completed");
			}
			else if(choice==4) {
				System.out.println("You Are Selected iphone");
				mobile="Oppo";
				price=5000;
				System.out.println("Your Purchases is succesfully completed");
			}
			else if(choice==5) {
				System.out.println("thank you visit again");
				break;
			}
			else {
				System.out.println("Invalid choice");
			}
		}
		while(true);
		
	System.out.println("====================Receipt===================");
	System.out.println("mobile name    :"+mobile);
	System.out.println("mobile price   :"+price);
	
		
	}
}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		 
//		int i=1;
//		do {
//			System.out.println("hello:"+i);
//			i++;
//		}
//		while(i<=10);
//		
//		Scanner sc=new Scanner(System.in);
//		int num=0;
//		do
//		{
//			System.out.println("Enter any number");
//			 num=sc.nextInt();
//			System.out.println("jay shri ram :"+num);
//			
//		}
//		while(num!=0);
//		double bankbalance=1500;
//		int choice=0;
//		boolean x=false;
//		Scanner sc=new Scanner(System.in);
//        int attempts=3;
//			do {
//				System.out.println("Enter your pin");
//				int pin =sc.nextInt();
//			
//		if(pin==1212) {
//		
//		
//		
//		
//		
//	do {
//		System.out.println("Enter Your Choice");
//		System.out.println("1.diposite");
//		System.out.println("2.withdarw");
//		System.out.println("3.check balance");
//		System.out.println("4.exit");
//		choice=sc.nextInt();
//	
//		if(choice==1) {
//			System.out.println("Enter Diposite amount");
//			double amount=sc.nextDouble();
//			if(amount >0) {
//		bankbalance +=amount;
//				System.out.println("Diposite Your Amount:"+bankbalance);
//				
//			}
//			else {
//				System.out.println("Invalid number");
//			}
//		}
//		
//		else if(choice==2) {
//			System.out.println("Enter your withdarw amount");
//			int amount=sc.nextInt();
//			if(bankbalance>amount) {
//			if(amount >0) {
//				bankbalance -=amount;
//					System.out.println("Enter Your Withdarw amount:"+bankbalance);
//			}
//			else {
//				System.out.println("Invalid amount");
//			}
//			}
//			
//			else {
//				System.out.println("Insufficient balance");
//			}
//			
//}
//		else if(choice==3) {
//			System.out.println("current available balance is:"+bankbalance);
//		}
//		else if(choice==4) {
//			
//			System.out.println("Thank you..Visit Again:");
//			x=true;
//		}
//	
//		
//			
//			}
//			while(choice!=4);
//		}
//		else {
//			attempts--;
//			System.out.println("incorrect password:"+attempts);
//		}
//		if(x==true) {
//		break;
//		}
//		}while(attempts>0);}

