package following;

public class IntroducingExample_ComputeArea {
/**Main method**/
	public static void main(String[] args) {
		//Allocating memories for radius and area.
		double radius; // Declaring variables
		double area;
		
		//Named constants
		final double PI = 3.141592;
		
		//Assigning value 20 to radius
		radius = 20;
		
		//Compute area and assign it
		area = radius * radius * PI;
		
		//Display results : print message to the console
		System.out.println("The area for the circle of radius " + radius + " is " + area);

	}

}
