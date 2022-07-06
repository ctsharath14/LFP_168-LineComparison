//Model a line based on a point consisting of (x, y) co-ordinates using the Cartesian system, So that I can calculate its length.

import java.util.Scanner;

public class LineComparison {
	public static void main(String[] args) {
	System.out.println("Welcome to Line Comparison Computation Program");
	Scanner scan = new Scanner(System.in);
	double x1 = 0;	
	double y1 = 0;
	double x2 = 0;
	double y2 = 0;
	double length = 0;
	
	System.out.println("Please enter X1 Coordinate");
	x1 = scan.nextInt();
	System.out.println("Please enter Y1 Coordinate");
	y1 = scan.nextInt();
	System.out.println("Please enter X2 Coordinate");
	x2 = scan.nextInt();
	System.out.println("Please enter Y2 Coordinate");
	y2 = scan.nextInt();

	scan.close();

	length = (Math.sqrt(((x2-x1) * (x2-x1)) + ((y2-y1) * (y2-y1))));
	System.out.println("Length between 2 points is : "+length);
	}
} 
	