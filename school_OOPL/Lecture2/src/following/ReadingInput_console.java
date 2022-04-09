package following;
/** Import **/
//Implicit import : import all
import java.util.*;
//Explicit import : import specific 
import java.util.Scanner;
	// + There is no performance difference

public class ReadingInput_console {
	public static void main(String[] args) {
		
	System.out.println("Enter a double value :");
	// Creating a Scanner object (importing java.util.Scanner is needed)
	Scanner input = new Scanner(System.in);
	
	//Use the method nextDouble() to obtain to a double value
	double d = input.nextDouble();
	
	/*
	 * To read numbers from keyboard, you need following methods
	 * - nextByte()
	 * - nextShort()
	 * - nextInt()
	 * - nextLong()
	 * - nextFloat()
	 * - nextDouble()
	 */
	
	//Closing Scanner after use is recommended
	input.close();
	
	System.out.println("You entered " + d);
	
	}
}
