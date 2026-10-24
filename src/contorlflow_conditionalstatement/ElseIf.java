package contorlflow_conditionalstatement;
import java.util.*;
public class ElseIf {
	
	public static void main(String [] arg) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("1.laptop");
		System.out.println("2.mobile");
		System.out.println("3.washing machine");
		System.out.println("4.motor cycle");
		System.out.println("Enter your choice");
		double discount=0;
		int choice=sc.nextInt();
		String product="";
		double price=0;
		double finalprice=0;
		int qty=0;
		double totalprice = 0;
		if(choice==1) {
			System.out.println("you selected laptop🧡");
			product="laptop";
			price=30000.0;
        System.out.println("how many quantity you want");
         qty=sc.nextInt();
        totalprice=price*qty;
		
		
        if(totalprice>100000) {
        	System.out.println("you achieve 10% discount");
        discount=10;
        double x=totalprice * 0.10;
        finalprice=totalprice-x;
        }
        else {
        	System.out.println("no dicount");
        	discount=0;
        	finalprice=totalprice;
        }
	
	}   
        
        
        
	else  if(choice==2) {
			System.out.println("you selected Mobile🧡");
			product="mobile";
			price=30000.0;
        System.out.println("how many quantity you want");
         qty=sc.nextInt();
        totalprice=price*qty;
	  
                if(totalprice>10000) {
        	System.out.println("you achieve 10% discount");
        discount=10;
        double x=totalprice * 0.10;
        finalprice=totalprice-x;
        }
        else {
        	System.out.println("no dicount");
        	discount=0;
        	finalprice=totalprice;
        }
        
	}
        
        
          else if(choice==3) {
        	System.out.println("you selected washing machine🧡");
        
			product="washing machine";
			price=30000.0;
        System.out.println("how many quantity you want");
         qty=sc.nextInt();
        totalprice=price*qty;
        
        if(totalprice>35000) {
        	System.out.println("you achieve 10% discount");
        discount=10;
        double x=totalprice * 0.10;
        finalprice=totalprice-x;
        }
        else {
        	System.out.println("no dicount");
        	discount=0;
        	finalprice=totalprice;
        }
        
	}
        
	      else if(choice==4) {
			System.out.println("you selected motor cycle🧡");
			product="motor cycle";
			price=30000.0;
        System.out.println("how many quantity you want");
         qty=sc.nextInt();
        totalprice=price*qty;
		
	 
        if(totalprice>100000) {
        	System.out.println("you achieve 10% discount");
        discount=10;
        double x=totalprice * 0.10;
        finalprice=totalprice-x;
        }
        else {
        	System.out.println("no dicount");
        	discount=0;
        	finalprice=totalprice;
        }
	}
	else {
		System.out.println("Invalid product");
		return;
	}
		System.out.println("=================Receipt============");
		System.out.println("Product Name :"+product);
		System.out.println("qty          :"+qty);
		System.out.println("Total Price :"+totalprice);
		System.out.println("Discount     :"+discount);
		System.out.println("Final Price  :"+finalprice);
		System.out.println("your product booked successfully");
		
        }
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		System.out.println("Enter any number");
//		
//		int price=sc.nextInt();
//		
//		if(price > 10000) {
//			System.out.println("applied 10% discount");
//			double discount=price * 0.10;
//			price -=discount;
//			System.out.println("final price :"+price);
//		}
//		else if(price >8000) {
//			System.out.println("applied 8% discount");
//			double discount=price * 0.08;
//			price -=discount;
//			System.out.println("final price :"+price);
//		}
//		else if(price > 5000) {
//			System.out.println("applied 5% discount");
//			double discount=price * 0.05;
//			price -=discount;
//			System.out.println("final price :"+price);
//		}
//		else if(price > 2000) {
//			System.out.println("applied 2% discount");
//			double discount=price * 0.02;
//			price -=discount;
//			System.out.println("final price :"+price);
//		}
//		else{
//			System.out.println("no discount");
		
	


