package Looping_conditionalstatement;

import java.util.Scanner;

public class Switchcase {
	public static void main(String [] arg) {
		//expression=>any constant value or result is called expression
		//condition =>any statement which boolean result is called condition 
		
//		switch(expression) {
//		case value://code
//			break;
//		case value://code
//			break;
//		case value://code
//			break;
//		default://code
//		==============================================================================
//		int x=2;
//		switch(x) {
//		case 1:System.out.println("Ram");
//		break;
//		case 2:System.out.println("shri");
//		break;
//		case 3:System.out.println("shyam");
//		break;
//		case 4:System.out.println("vishal");
//		break;
//		default :System.out.println("hari");
//		
//		}
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter day :");
//		int day=sc.nextInt();
//		switch(day) {
//		case 1:System.out.println("sunday");
//		break;
//		case 2:System.out.println("monday");
//		break;
//		case 3:System.out.println("Tuesday");
//		break;
//		case 4:System.out.println("wednesday");
//		break;
//		case 5:System.out.println("thirsday");
//		break;
//		case 6:System.out.println("friday");
//		break;
//		case 7:System.out.println("Saturday");
//		break;
//		default:System.out.println("Invalid Day");
//		}
//		===========================================================================
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter Grade :");
//		char grade=sc.next().charAt(0);
//		switch(grade) {
//		case 'a':System.out.println("Excellent");
//		break;
//		case 'b':System.out.println("very good");
//		break;
//		case 'c':System.out.println("Good");
//		break;
//		case 'd':System.out.println("poor");
//		break;
//		case 'e':System.out.println("very poor");
//		break;
//		default:System.out.println("invalid");
//		
//		}
//		 =====================================================================
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter name :");
//		String name=sc.next();
//		switch(name) {
//		case "vishal":
//			System.out.println("welcome :"+name.toUpperCase());
//			break;
//		case "ram":
//			System.out.println("welcome :"+name.toUpperCase());
//			break;
//		case "hari":
//			System.out.println("welcome :"+name.toUpperCase());
//			break;
//		case "shyam":
//			System.out.println("welcome :"+name.toUpperCase());
//			break;
//			default:System.out.println("unknown name");
//		}
//		=======================================================================
//	    new way to write switch case
//		after java 14+
//		no break is needed
//		more easy
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter Day :");
//		int day=sc.nextInt();
//		switch(day) {
//		case 1->System.out.println("monday");
//		case 2->System.out.println("Tuesday");
//		case 3->System.out.println("wednesday");
//		case 4->System.out.println("Thursday");
//		case 5->System.out.println("Friday");
//		case 6->System.out.println("Saturday");
//		case 7->System.out.println("friday");
//		default ->System.out.println("invalid day");
//		}
//		===========================================================================
//		we can use switch as expression
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter a day");
//		int  day=sc.nextInt();
//			String result=
//					switch(day) {
//				case 1->"sunday";
//				case 2->"monday";
//				case 3->"tuesday";
//				case 4->"wednseday";
//				case 5->"thirday";
//				case 6->"Friday";
//				case 7->"Saturday";
//					default ->"invalid day";
//		};
//			System.out.println(result);
////			=====================================================================
//			
//			Scanner sc=new Scanner(System.in);
//			System.out.println("Enter Two Numbers :");
//			int a=sc.nextInt();
//			int b=sc.nextInt();
//			System.out.println("Enter Your Choice = +,*,-,/");
//			char operator=sc.next().charAt(0);
//			
//			int result=switch(operator) {
//			case '+'->a+b;
//			case '*'->a*b;
//			case '/'->a/b;
//			case '-'->a-b;
//			default -> 0;
//			};
//			System.out.println(result);
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter any characters");
		char c=sc.next().charAt(0);
		
	String result=	switch(c) {
		case 'a','e','i','o','u','A','E','I','O','U'->"vowels";
		
		default ->"consonent";
		};
		System.out.println(result);
		 
		
		}
		

	
	}


