import java.util.Scanner;

class Fact {

    private static long factorial(long n) {
        if (n == 1) {
            return 1;
        } else {
            System.out.println(n);
            return n * factorial(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long n = scanner.nextLong();
        System.out.println(factorial(n));
    }
}