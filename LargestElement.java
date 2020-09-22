import java.util.Scanner;

class LargestElement {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int maxElement = 1;
        int element = 0;

        while ((element = scanner.nextInt()) != 0) {
            if (element > maxElement) {
                maxElement = element;
            }
        }

        System.out.println(maxElement);

    }
}