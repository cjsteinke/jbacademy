import java.util.Scanner;

class Collatz {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int element = scanner.nextInt();


        System.out.print(element + " ");
        while (element != 1) {
            if (element % 2 == 0) {
                element = element / 2;
                System.out.print(element + " ");
            } else {
                element = (element * 3) + 1;
                System.out.print(element + " ");
            }
        }
        System.out.println();
    }
}