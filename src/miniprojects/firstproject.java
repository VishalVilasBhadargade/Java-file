package miniprojects;
import java.util.*;

public class firstproject {
	
	public static void main(String [] arg) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Java Marks");
		double java=sc.nextDouble();
		System.out.println("Enter Python Marks");
		double python=sc.nextDouble();
		System.out.println("Enter c marks ");
		double c=sc.nextDouble();
		System.out.println("Enter c++ marks");
		double cpp=sc.nextDouble();
		
		double totalmarks=java+python+c+cpp;
		System.out.println("Total marks:"+totalmarks);
		
		double percentage=totalmarks/4;
		System.out.println("percentage :"+percentage);
		
		if(percentage > 90) {
			System.out.println("grade of percentage is : A");
			
		}
		else if(percentage >70) {
			System.out.println("grade of percentage is : B");
		}
		else if(percentage >50) {
			System.out.println("grade of percentage is: C");
		}
		else {
			System.out.println("Fail");
		}
		
	}
	

}
