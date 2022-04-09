package following;

public class FloatingPointNumber {

	public static void main(String[] args) {
		
		double a = 0.1;
		double b = 1.0;
		
		double c = (b - a -a -a -a -a);
		
		if (0.5 == (b - a -a -a -a -a)) {
			System.out.println("0.5 is equals to 1 -0.1 -0.1 -0.1 -0.1 -0.1 in java");
		}
		else {
			System.out.println("0.5 is not equals to 1 -0.1 -0.1 -0.1 -0.1 -0.1 in java");
			System.out.println("but it is equals to " + c);
			System.out.println("This shows Calculations involving floating-porint numbers are approximated because these numbers are not stared with complete accuracy.");
			System.out.println("But integers are stored precisely.");
			System.out.println("Therefore, calculations with integers yield a precise integer result.");
		}



	}

}
