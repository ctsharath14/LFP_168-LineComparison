//compare two lines based on the end points, So that I know one line is equal, greater or less than the other line.

import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.println("Please enter X1 Coordinate of line 1");
        double x1 = Scan.nextDouble();
	System.out.println("Please enter Y1 Coordinate of line 1");
        double y1 = Scan.nextDouble();
	System.out.println("Please enter X2 Coordinate of line 1");
        double x2 = Scan.nextDouble();
	System.out.println("Please enter Y2 Coordinate of line 1");
        double y2 = Scan.nextDouble();

	System.out.println("Please enter X1 Coordinate of line 2");
        double a1 = Scan.nextDouble();
	System.out.println("Please enter Y1 Coordinate of line 2");
        double b1 = Scan.nextDouble();
	System.out.println("Please enter X2 Coordinate of line 2");
        double a2 = Scan.nextDouble();
	System.out.println("Please enter Y2 Coordinate of line 2");
        double b2 = Scan.nextDouble();
	
	Scan.close();

        double length1 = Math.sqrt(((x2 - x1)*(x2 - x1) +(y2 - y1) * (y2 - y1)));
        System.out.println("The length of line 1 is :" + length1);

        double length2 = Math.sqrt(((a2 - a1)*(a2 - a1) +(b2 - b1) * (b2 - b1)));
        System.out.println("The length of line 2 is :" + length2);

        if (length1 > length2) {
            System.out.println("Line 1 is greater than Line 2");
        } 
	else if (length1 < length2) {
	    System.out.println("Line 1 is smaller than Line 2");
	}
	else {
            System.out.println("Both the lines are equal");
        }
    }
}