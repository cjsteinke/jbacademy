import java.util.Scanner;

class SmallestVal {

    private static long factorial(long n) {
        if (n == 0) { return 0; }
        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long n = 0;
        long m = scanner.nextLong();

        do {
            n++;
        } while (factorial(n) <= m);

        System.out.println(n);

    }
}

