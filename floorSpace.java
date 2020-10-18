import java.util.Scanner;
import java.lang.Math;


class Main {
    public static void main(String[] args) {
	
        Scanner scanner = new Scanner(System.in);
        
        String shape = scanner.nextLine();

        switch (shape) {
            case "rectangle":
                // Calculate the area of a rectangular room.
                double length = scanner.nextDouble();
                double width = scanner.nextDouble();
                System.out.println(length * width);
	        break;
	    case "triangle":
		    // Calculate the area of a traingular room.
		    double a = scanner.nextDouble();
		    double b = scanner.nextDouble();
		    double c = scanner.nextDouble();
		    double p = (a + b + c) / 2;
		    System.out.println("Perimeter of a triangle: " + p);
		    double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		    System.out.println("Area of the triangle: " + area);
		    System.out.println(area);
		    break;
	        case "circle":
		    // Calculate the area of a circullar room.
		    double radius = scanner.nextInt();
		    System.out.println(3.14 * (radius * radius));
	            break;
		    
	    }
    }
}
