import java.util.Scanner;

public class maxOfThree {

    public static int getNumberOfMaxParam(int a, int b, int c) {

        if (a >= b && a >= c) {
            return 1;
        } else if (b >= a && b >= c) {
	    return 2;
        } else if (c >= a || c >= b) {
            return 3;
        } else {
            return 0;
	}

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final int a = scanner.nextInt();
        final int b = scanner.nextInt();
        final int c = scanner.nextInt();

        System.out.println(getNumberOfMaxParam(a, b, c));
    }
    
}

