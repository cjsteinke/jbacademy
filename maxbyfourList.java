import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

	    int numElements = scanner.nextInt();
	    int count = 0;
	
	    List<Integer> elements = new ArrayList<>();

	    for (int i = 0; i < numElements; ++i) { 
	        int element = scanner.nextInt();
	        if (element % 4 == 0) {
	            elements.add(count,element);
	            count = count + 1; 
	        }
	    }
	    int maxElement = Collections.max(elements);
	    System.out.println(maxElement);
    }
}
