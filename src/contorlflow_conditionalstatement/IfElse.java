package contorlflow_conditionalstatement;
import java.util.*;
public class IfElse {
	public static void main(String [] arg) {
//		int num=-100;
//		
//		
//		if(num>0) {
//			System.out.println("Number is Positive");
//			
//		}
//		else {
//			System.out.println("Number is Negative");
//		}
//		
		
		Scanner sc=new Scanner(System.in);
//		double balance=45000.00;
//		System.out.println("Enter withdraw amount");
//		double amount=sc.nextDouble();
//		
//		if(amount <=balance) {
//			balance -=amount;
//			System.out.println("withdraw Succesful:"+balance);
//		}
//		else {
//			System.out.println("Insufficient balance");
//		}
//		
		
		System.out.println("Enter the product price");
		double price=sc.nextDouble();
		
		if(price > 10000) {
			double discount=price*0.10;
			price -=discount;
			
			System.out.println("Applied 10% discount:"+discount);
			System.out.println("final price:"+price);
		}
	}

}
