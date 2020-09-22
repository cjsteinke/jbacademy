import java.util.Scanner;

class Sequence {
    public static void main(String[] argss) {
        Scanner scanner = new Scanner(System.in);
        int element = 0;
        int divisible = 0;

        while (scanner.hasNextInt()) {
            element = scanner.nextInt();
            if (element % 4 == 0 ) {
                if (element > divisible) {
                    divisible = element;
                }
            }
        }
        System.out.println(divisible);

    }
}