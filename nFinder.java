import java.util.*;

public class nFinder {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean foundN = false;
        int arrayLen = scanner.nextInt();
        int[] array = new int[arrayLen];
        for (int i = 0; i < arrayLen; i++) {
            array[i] = scanner.nextInt(); // read the next number of the array
        }
        int n = scanner.nextInt();
        for (int element : array) {
            if (element == n) {
                foundN = true;
            }
        }

        System.out.println(foundN);
    }
}