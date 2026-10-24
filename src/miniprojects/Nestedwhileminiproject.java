package miniprojects;

import java.util.Scanner;

public class Nestedwhileminiproject {
public static void main(String [] arg) {
	//banking Application
	double bankbalance=15000.00;
	Scanner sc=new Scanner(System.in);
    int attempts=3;
    while(attempts>0) {
    	System.out.println("Enter your pin");
    	int pin=sc.nextInt();
    	if(pin==1212) {
    		while(true) {
    		System.out.println("1.Deposit");
    		System.out.println("2.withdraw");
    		System.out.println("3.check balance");
    		System.out.println("4.exits");
    	
    		System.out.println("Enter your choice...");
    		int choice=sc.nextInt();
    	if(choice==1) {
    		System.out.println("Enter deposite Amount ");
    		int amount=sc.nextInt();
    		if(amount>0) {
    			bankbalance +=amount;
    			System.out.println("deposite success:"+bankbalance);
    		}
    		else {
    			System.out.println("Invalid amount");
    		}
    	
    	}
    	else if(choice==2) {
    		System.out.println("Enter withdrawl Amount");
    		int amount=sc.nextInt();
    		if(bankbalance >amount) {
    			if(amount>0) {
    			
    			bankbalance -=	amount ;
    			System.out.println("withdrawl successful ");
    			System.out.println("Current balance is :"+bankbalance);
    			
    			}
    		else {
    			System.out.println("invalid amount");
    		}
    		}
    		else {
    			System.out.println("insufficient balance");
    			
    	
    		}
    		

    		}
    	else if(choice==3) {
    		System.out.println("current balance is:"+bankbalance);
    	
    	
    	}
    	else if(choice==4){
    		System.out.println("THANK YOU VISIT AGAIN...");
    		break;
    		
    	}

	}
	}
    	else {
    		System.out.println("Incorrect password");
    		attempts--;
	}
    
    }
	}
}
