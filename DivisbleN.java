import java.util.Scanner;

public class DivisbleN {
    public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);

	int a = scanner.nextInt();
	int b = scanner.nextInt();	
	int n = scanner.nextInt();

	int divisibleCount = 0; 

	for ( int i = a; i <= b; i++ ) {
	    if ( i % n == 0 ) {
		divisibleCount++; 
	    }
	}

	System.out.println(divisibleCount);
    }
}
		
