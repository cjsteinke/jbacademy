import java.util.*;

public class maximus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int arrayLen = scanner.nextInt();
        int[] array = new int[arrayLen];

        for (int i = 0; i < arrayLen; i++) {
            array[i] = scanner.nextInt(); // read the next number of the array
        }

        int max = array[0];
        int maxIndex = 0;
        for (int j = 0; j < arrayLen; j++) {
            if (array[j] > max) {
                max = array[j];
                maxIndex = j;
            }
        }
        System.out.println(maxIndex);
    }
}