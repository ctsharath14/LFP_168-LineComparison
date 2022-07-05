//Model a line based on a point consisting of (x, y) co-ordinates using the Cartesian system, So that I can calculate its length.

public class LineComparison {
	public static void main(String[] args) {
	int x1 = 4;	
	int y1 = 4;
	int x2 = 10;
	int y2 = 10;
	int length = (int) Math.sqrt(((x2-x1) * (x2-x1)) + ((y2-y1) * (y2-y1)));
	System.out.println("Length between 2 points is : "+length);
	}
} 
	