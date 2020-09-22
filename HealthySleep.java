import java.util.Scanner;

public class HealthySleep {
    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

	    int a = scanner.nextInt();
	    int b = scanner.nextInt();
	    int h = scanner.nextInt();

	    if (a <= b) {
		if (h < a) {
		    System.out.println("Deficiency");
		} else if (h > b) {
		    System.out.println("Excess");
		} else {
		    System.out.println("Normal");
		}
	    } else {
		// There was a problem with the input
		System.out.println("Error");
		System.exit(-1);
	    }
	}
}
