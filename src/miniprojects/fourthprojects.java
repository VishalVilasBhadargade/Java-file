package miniprojects;
import java.util.*;
public class fourthprojects {
	
	public static void main(String [] arg) {
		Scanner sc=new Scanner(System.in);
		System.out.println("WELCOME TO ANNA FOD DELIVERY APPLICATION...");
		
		System.out.println("1.PURI BHAJI-250RS");
		System.out.println("2.PIZZA    - 400RS");
		System.out.println("3.BURGER   - 220RS");
		System.out.println("4.VADAPAV  - 30RS");
		System.out.println("5.SAMOSA   -20RS");
		System.out.println("6.PUNERI MISAL - 190RS");
		System.out.println("7.CHAHA -  20RS");
		System.out.println("8.CHICKEN BIRYANI - 230RS");
		System.out.println("9.SANDWITCH - 120RS");
		System.out.println("10.PAV BHAJI- 160RS");
		
		System.out.println("\n WHAT YOU WANT ORDER TODAY..");
		String ordername="";
		int qty=0;
		double orderprice;
		double discount=0;
		int choice=sc.nextInt();
		double gst=0;
		double finalprice=0;
		double servicecharge=0;
		double totalprice=0;
		
		if(choice==1) {
		ordername="PURI BHAJI";
		orderprice=250;
		System.out.println("how many quantity you want..");
		qty=sc.nextInt();
		 totalprice =orderprice * qty;
		
		
		if(totalprice > 100) {
			discount=totalprice*0.05;
			totalprice=totalprice-discount;
			System.out.println("YOU GOT FREE DELIVERY");
			gst=45;
			servicecharge=20;
			finalprice=totalprice+gst+servicecharge;
			
		}
	}
      System.out.println("=============YOUR FINAL RECEIPT===========");
      System.out.println("order name         :"+ordername);
      System.out.println("Quantity           :"+qty);
      System.out.println("total price        :"+totalprice);
      System.out.println("Discount           :"+discount);
      System.out.println("GST                :"+gst);
      System.out.println("Service Chargr     :"+servicecharge);
      System.out.println("final price to pay :"+finalprice);
      System.out.println("your order on the way");
      
      
      
      
      
      
      
      
      
      
      
      
      
		
	}

}
