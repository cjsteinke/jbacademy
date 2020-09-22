import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int terms = 0;
		int termsCount = 0;

		for (int x = a; x <= b; x++) {
			if ( x % 3 == 0) {
				terms += x;
				termsCount++;
			}
		}
		if (termsCount != 0) {
			System.out.println(terms/termsCount);
		}
    }
}
		
