import java.util.Scanner;

class ElementsSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int element = 0;

        while ((element = scanner.nextInt()) != 0) {
            sum = sum + element;
        }
        System.out.println(sum);
    }
}

