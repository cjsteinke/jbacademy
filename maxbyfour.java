import java.util.Scanner;


class maxbyfour {
    public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);

	int numElements = scanner.nextInt();
	int maxElement = 1;
	

	for (int i = 0; i < numElements; i++) { 
	   int element = scanner.nextInt();
	   if (element % 4 == 0 && element >maxElement) {
	       maxElement = element;
	   }
	}

	System.out.println(maxElement);
    }
}
		
