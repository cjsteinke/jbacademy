import java.util.Scanner;

public class Product {
    public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);

	int a = scanner.nextInt();
	int b = scanner.nextInt();

        long product = 1; 

	if (a < b) {
	    for (int i = a; i < b; i++) {
		product = product * i;
	    }
	    System.out.println(product);
	} else {
	    System.out.println("Error: a must be less than b");
	}
    }
}
		
