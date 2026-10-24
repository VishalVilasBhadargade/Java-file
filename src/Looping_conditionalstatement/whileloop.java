package Looping_conditionalstatement;

import java.util.Scanner;

public class whileloop {
	public static void main(String [] arg) {
		
//		enter multiplication table
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any number");
		int num=sc.nextInt();
		int i=1;
		while(i<=10) {
			System.out.println(num +"*"+i+"="+num*i);
			i++;
		}
		
		
//		print the addition of 1 to 100 numbers while lopp
//		int i=1;
//		int sum=0;
//		while(i<=10) {
//			if(i%2!=0) {
//			sum +=i;
//			}
//			i++;
//			
//		}
//		System.out.println(sum);
//		
//		==========================================================================
//		int i=1;
//		while(i<=100) {
//			if(i%2==0) {
//			System.out.println(i);
//			
//			}
//			i++;
//		}
//		==========================================================================
//		int i=2;
//		while(i<=100) {
//			System.out.println(i);
//			i+=2;
//			
//		}
		
//		==========================================================================
//	#	100 to 1 numbers print using while loop
//		int i=100;
//		while(i>=1) {
//			System.out.println(i);
//			i--;
//		}
//	===============================================================================	
////#		1 to 100 numbers print using while loop
//		int i=1;
//		while(i<=100) {
//			System.out.println(i);
//			i++;
//		}
//				
//	
		
//==================================================================================		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter your pin");
//		 int pin=sc.nextInt();
//		 int attempts=3;
//		 while(attempts >1) {
//			 if(pin==1212) {
//				 System.out.println("pin verified success");
//				 break;
//			 }
//			 else {
//				 attempts-=1;
//				 System.out.println("pin is incorrect :"+attempts);
//				 System.out.println("Try again");
//				 pin=sc.nextInt();
//			 }
//		 }
//		 if(attempts==1) {
//			 System.out.println("Account block");
		
//	===============================================================================
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter Your Name");
//		String username=sc.next();
//		
//		while(true) {
//			if(username.length()<5) {
//				System.out.println("Invalid username");
//				System.out.println("please enter valid username..");
//				username=sc.next();
//			}
//			else {
//				System.out.println("valid username :"+username);
//				break;
//			}
//			
//		}
//		==========================================================================
//		boolean x=true;
//		
//		int num=1;
//		while(x) {
//			System.out.println("Ram");
//			num++;
//			if(num==10) {
//				x=false;
//			}
//		}
//		
//		==========================================================================
		
		
	
		
//		=========================================================================
		
//		int num=sc.nextInt();
//		
//		while(num !=0) {
//		
//			if(num <=0) {
//				System.out.println("Invalid number");
//				System.out.println("Please enter again number");
//				num=sc.nextInt();
//				}
//		
//				else {
//					System.out.println("number is valid: "+num);
//					break;
//					
//			}
//		
//		
//			}
			
		}
}
	
	


