//Model a line based on a point consisting of (x, y) co-ordinates using the Cartesian system, So that I can calculate its length.

import java.util.Scanner;

public class LineComparison {
	public static void main(String[] args) {
	System.out.println("Welcome to Line Comparison Computation Program");
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Please enter X1 Coordinate");
	double x1 = scan.nextDouble();
	System.out.println("Please enter Y1 Coordinate");
	double y1 = scan.nextDouble();
	System.out.println("Please enter X2 Coordinate");
	double x2 = scan.nextDouble();
	System.out.println("Please enter Y2 Coordinate");
	double y2 = scan.nextDouble();

	scan.close();

	double length = (Math.sqrt(((x2-x1) * (x2-x1)) + ((y2-y1) * (y2-y1))));
	System.out.println("Length between 2 points is : "+length);
	}
}
