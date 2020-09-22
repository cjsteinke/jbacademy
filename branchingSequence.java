import java.util.Scanner;

class branchingSequence {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);


		int n = 0;
		int innerCount = 0;

		n = scanner.nextInt(); 

		for (int i = 1; i <= n; i++ ) {
			for (int j = 1; j <= i; j++) {
				if ( innerCount == n ) 
					break;
				System.out.print(i + " ");
				innerCount++;
			}
		}
		System.out.println("");
	}
}
