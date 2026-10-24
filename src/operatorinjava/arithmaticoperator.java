package operatorinjava;
import java.util.*;

public class arithmaticoperator {
	public static void main(String[] arg) {
		
//		Scanner sc=new Scanner(System.in);
//		
//		System.out.println("Enter first number");
//		int num1=sc.nextInt();
//		System.out.println("Enter second number");
//		int num2=sc.nextInt();
//		System.out.println("Addition is :"+(num1+num2));
//		System.out.println("substraction is :"+(num1-num2));
//		System.out.println("multiply id :"+(num1*num2));
//		System.out.println("dividation is:"+(num1/num2));
//		

		double salary=45000;
		double bonus=3000;
		double finalsalary=salary+bonus;
		System.out.println("bonus with salary:"+finalsalary);
	double leaves=3000;
	 finalsalary=finalsalary-leaves;
	 System.out.println("after leaves salary :"+finalsalary);
	 double incentive=finalsalary*0.60;
	 System.out.println("salary incentive:"+incentive);
	 finalsalary=finalsalary+incentive;
	 System.out.println("after increament salary:"+finalsalary);
	
}
}
