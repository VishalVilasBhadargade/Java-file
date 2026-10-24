package miniprojects;
import java.util.*;
public class secondeproject {

	public static void main(String [] arg) {
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Basic Salary :");
		double basicsalary=sc.nextDouble();
		System.out.println("bonus :");
		double bonus=sc.nextDouble();
		System.out.println("Tax");
		double tax=sc.nextDouble();
		System.out.println("PF");
		double pf=sc.nextDouble();
		
		double result=basicsalary+bonus-tax-pf;
		System.out.println("total Amount :"+
		result);
		
		
		
	}
}
