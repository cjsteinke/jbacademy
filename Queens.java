import java.util.Scanner;

public class Queens {
    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

	    int x1 = scanner.nextInt();
	    int y1 = scanner.nextInt();
	    int x2 = scanner.nextInt();
	    int y2 = scanner.nextInt();
	    //
	    // Convert Integer to Double so we can use the infinite case. 
	    //
	    double dx1 = x1;
	    double dx2 = x2;
	    double dy1 = y1;
	    double dy2 = y2;
	    // Slope is Infinite when say one queen is at (1,1) and the other is at (1,6). 
	    double inf = Double.POSITIVE_INFINITY;
	    double slope = (Math.abs(dy2 - dy1))/(Math.abs(dx2-dx1));

	    if ((slope == 1.0) || (slope == 0.0) || (slope == inf)) {
		System.out.println("YES");
	    } else if ((slope < 0) || (slope > 1) || (slope < 1)) {
		System.out.println("NO");
	    } else {
		System.out.println("UNDEFINED");
	    }
    }
}
		
	    
