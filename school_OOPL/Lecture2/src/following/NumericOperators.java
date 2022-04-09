package following;

import java.util.Scanner;

public class NumericOperators {
	public static void main(String[] args) {
		
		System.out.println("Enter a double value to assign it to a");
		
		Scanner input = new Scanner(System.in);
		double a = input.nextDouble();
		
		System.out.println("Enter another one to assign it to b");
		double b = input.nextDouble();
		
		input.close();
		
		System.out.println(a + " + " + b + " is " + (a+b));
		System.out.println(a + " - " + b + " is " + (a-b));
		System.out.println(a + " * " + b + " is " + (a*b));
		System.out.println(a + " / " + b + " is " + (a/b));
		System.out.println(a + " % " + b + " is " + (a%b));
			
	}

}
