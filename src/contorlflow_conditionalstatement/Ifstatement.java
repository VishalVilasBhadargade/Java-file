package contorlflow_conditionalstatement;
import java.util.*;
public class Ifstatement {
	public static void main(String [] arg) {
		
		double d=10/4;
		System.out.println(d); 
//		int x=111;
//		if (x<200) {
//			
//			System.out.println("hello");
//			System.out.println("hii");
//			System.out.println("we are learning java");
//		}
//		System.out.println("hi i am from pune");
//	}
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter username...");
	
	String username=sc.next();
	
	if(username.length()<5) {
		
		System.err.println("Invalid Username . please enter valid username");
		
	}
	if(username.length()>=5) {
		System.out.println("valid username  :"+username.toUpperCase());
	}
	System.out.println("Enter password");
        String	password=sc.next();
     if(password.length()<8) {
    	 System.err.println("Invalid password . please enter valid number");
    	 
     }
     if(password.length()>=8)
     {
    	 System.out.println("valid password :"+password);
     }
     if(username.equals("vishalandjava")&& password.equals("vishal1212")) {
    	 System.out.println("login succesful");
     }
    	 else {
    		 System.out.println("unsuccesful");
    	 
     }
		
	}
	
	
	
}
