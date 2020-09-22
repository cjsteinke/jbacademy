import java.util.Scanner;

class integerBarrier {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

	int sum = 0; 
	int element = 0;

        while ((element = scanner.nextInt()) != 0) {
		sum = sum + element;
		if (sum >= 1000) {
			sum = sum - 1000;
			break;
		}
	}
	System.out.println(sum);
    }
}
