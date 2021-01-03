import java.util.*;

public class arrayTest {

    public static void nineSquares() {
        int n = 10; // the size of an array
        int[] squares = new int[n]; // creating an array with the specified size

        System.out.println(Arrays.toString(squares)); // [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

        /* iterating over the array */
        for (int i = 0; i < squares.length; i++) {
            squares[i] = i * i; // set the value by the element index
        }

        System.out.println(Arrays.toString(squares)); // [0, 1, 4, 9, 16, 25, 36, 49, 64, 81]
    }

    public static void brokenArray() {

        int[] numbers = {1, 2, 3, 4, 5, 10, 6}; // the order is broken

        boolean broken = false; // suppose the array is well-ordered

        /* iterating over the array */
        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] < numbers[i - 1]) { // if the order is broken
                broken = true; // write a result
                break;         // terminate the loop
            }
        }

        if (broken) {
            System.out.println("BROKEN");
        } else {
            System.out.println("OK");
        }
    }

    public static void readArray() {
        Scanner scanner = new Scanner(System.in);

        int len = scanner.nextInt(); // reading a length
        int[] array = new int[len];  // creating an array with the specified length

        for (int i = 0; i < len; i++) {
            array[i] = scanner.nextInt(); // read the next number of the array
        }

        System.out.println(Arrays.toString(array)); // output the array
    }

    public static void printNums() {
        int[] nums = {2, 4, 6, 8};

        for (int i = 0; i < nums.length; i++) { System.out.print(nums[i]); }
        System.out.println("\n");
        for (int i = 0; i <= 3; i++) { System.out.print(nums[i]); }
        System.out.println("\n");
        for (int i = 0; i <= 3; i++) { System.out.print(nums[0]); }
        System.out.println("\n");
        for (int i = nums.length - 1; i >= 0; i--) { System.out.print(nums[i]); }
        System.out.println("\n");

    }

    public static void main(String[] args) {

        System.out.println("Example 1: Zero an array then print squares of numbers to 9");
        nineSquares();
        System.out.println("Example 2: Is the elements of the array ordered or not?");
        brokenArray();
        System.out.println("Example 3: Read in size of the array and then it's elements and then output the contents:");
        readArray();

        printNums();
    }
}