/*
 * LEARNING HOW TO PRINT & READ INPUT FROM CONSOLE
 * 
 * + IMPORT
 * 	- Explicit import
 *  - Implicit import
 * 
 * + IDENTIFIERS
 * 
 * + VARIABLES
 */
package lecture;

/*
 * Why import? What is import?
 * to use Scanner object you need to import java.utill
 */
import java.util.Scanner;// is Explicit import : import specific
import java.util.*; // is Implicit import: import whole

public class ReadingInput_console {	
	
	public static void main(String[] args) {
		// #1ST : CREATE A SCCANER OBJECT
		Scanner input = new Scanner(System.in);
		
		// #2ND : PRINT "ENTER A DOUBLE VALUE" 
		System.out.println("Enter a double value"); // Print out to enter a value
		
		// #3RD : USE THE METHODE nextDouble TO GET A DOUBLE VALUE
/*
 * IDENTIFIER
 *  - Identifier = name of value, class, object etc.
 *  - must start with a letter, a underscore(_) or a dollar sign($)
 *  ! CAN NOT START WITH A DIGIT
 *  ! CAN NOT BE A RESERVED WORD
 */
/*
 * VARIABLES 
 *  - DECLARING VARIABLES
 *  - ASSIGNMENT STATEMENT
 */
		double d = input.nextDouble();
		// Identifier = 'd'
		// Declaring Variables : 'double d'
		// Assigning : '= input.nextDouble'
		// Getting Input from Console : 'input.nextDouble()'
		
		input.close(); // closing input is recommended
		
		System.out.print("You entered " + d);
		
	}

}
