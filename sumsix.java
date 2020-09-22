import java.util.Scanner;


class sumsix {
    public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);

	int numElements = scanner.nextInt();
	int sum = 0;
	

	for (int i = 0; i < numElements; i++) { 
	   int element = scanner.nextInt();
	   if (element % 6 == 0) {
	       sum = sum + element;
	   }
	}

	System.out.println(sum);
	
    }
}
		
