package miniprojects;
import java.util.*;
public class thirdproject {
	
	public static void main(String [] arg) {
		Scanner sc=new Scanner(System.in);
		double bankbalance=2000;
		int db=1211;
		System.out.println("Enter your pin:");
		int pin=sc.nextInt();
		if(pin==db) {
			
		
		System.out.println("WELCOME TO APNA BANK");
		System.out.println("1.check balance");
		System.out.println("2.deposit");
		System.out.println("3.withdraw");
		System.out.println("4.exit");
		System.out.println("Enter Your Choice:");
		int choice =sc.nextInt();
		if(choice==1) {
			System.out.println("YOUR CURRENT BALANCE:"+bankbalance);
			
		}
		else if(choice==2) {
			System.out.println("Enter Your Deposite Amount");
			double deposite=sc.nextDouble();
			if(deposite >0) {
				    deposite +=bankbalance;
					System.out.println("Your amount deposite is Succesfully:"+deposite);
				}
				else {
					System.out.println("Invalid Amount");
				}
			}
		else if(choice==3) {
			System.out.println("Enter your withdraw amount");
			double withdraw=sc.nextDouble();
			if(withdraw >0) {
				if(withdraw <=bankbalance) {
				bankbalance -=withdraw;
				System.out.println("Your withdrawl amount is :"+bankbalance);
			}
				else {
					System.out.println("Insuficient balance");
				}
			}
			else {
				System.out.println("Invalid Amount");
			}
		}
			else if(choice==4) {
				
				System.out.println("THANK YOU");
				
			}
			else {
				System.out.println("wrong number");
			}
		
	
	}
	
else {
	System.out.println("Incorrect password");
	
}
	}
}
		
		
	




