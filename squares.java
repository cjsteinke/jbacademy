//
// squares.java
//
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); 
        int element = 1;
        int square = 0;

        while ((square = element * element) <= n) {
            System.out.println(square);
            element++;
        }
    }
}