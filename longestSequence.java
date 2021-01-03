import java.util.*;

public class longestSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arrayLen = scanner.nextInt();
        int[] array = new int[arrayLen];
        int sequenceCount = 1;
        int maxCount = 1;
        Integer previous = null;

        for (int i = 0; i < arrayLen; i++) {
            array[i] = scanner.nextInt();
        }

        for (int current : array) {
            if (previous != null) {
                // Compare
                if (current > previous) {
                    sequenceCount++;
                    // Keep track of the max sequence.
                    maxCount = sequenceCount;
                }
                else {
                    sequenceCount = 1;
                }
            }
            previous = current;
        }
        System.out.println(maxCount);
    }
}