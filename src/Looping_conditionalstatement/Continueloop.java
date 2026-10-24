package Looping_conditionalstatement;

public class Continueloop {
	public static void main(String [] arg) {
//		for(int i=1;i<=10;i++) {
//			if(i==1 || i==4) 
//				continue;
//				
//				if(i==6) {
//					break;
//				}
//				System.out.println(i);
//			}
		
//		for(int i=1,k=1;i<=5;i++) {
//			for(int j=1;j<=5;j++) {
//				if(j==3 || j==4)
//					continue;
//				System.out.print("Ram:"+k);
//				k++;
//			}
			
//		}
//		how to create Array?
//		Syn.datatype variablename[]=new datatype[size];
//		int numbers[]=new int[5];
//		numbers[0]=56;
//		numbers[1]=-133;
//		numbers[2]=76;
//		numbers[3]=123;
//		numbers[4]=100;
//		
//		for(int i=0;i<5;i++) {
//			if(numbers[i]%2==0)
//				continue;
//			
//			System.out.println(numbers[i]);
//		}
		String emails[]=new String[5];
		emails[0]="vishla@gmail.com";
		emails[1]="shubh@gmail.com";
		emails[2]="visddsd.com";
		emails[3]="iouwt.@";
		emails[4]="shunb@gmail.com";
		
		
		for(int i=0;i<5;i++) {
			if(!emails[i].contains("@") ||!emails[i].endsWith(".com")) {
				continue;
			}
			System.out.println(emails[i]);
			
		}
		}
	}


