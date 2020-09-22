import java.util.Scanner;

class EvenOdd {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int element = 0;

        while ((element = scanner.nextInt()) != 0) {
            if  (element % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }

        }

    }
}



