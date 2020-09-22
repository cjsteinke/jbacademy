import java.util.Scanner;

class orderedSeq {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int current = 0;
        int previous = 0;
	int elementCount = 0;

        boolean ascend = true;
        boolean descend = false;
        boolean ordered = true;

        while ((current = scanner.nextInt()) != 0) {
            // No Negative numbers
            if (current < 0) {
                break;
            }
	    //
	    // Assume the list is ordered. 
            // First test if sequence is asending.
	    //
            if (current > previous) {
		if (descend == true && elementCount != 1) {
			ordered = false;
			break;
		}
		previous = current;
		ascend = true;
		descend = false;
		ordered = true;
		elementCount = elementCount + 1; 
	    } else if (current < previous) {
		    if (ascend == true && elementCount != 1) {
			    ordered = false;
			    break;
		    }
		    previous = current;
		    ascend = false;
		    descend = true;
		    ordered = true;
		    elementCount = elementCount + 1; 
	    } else {
		    // Current is equal to previous
		    ordered = true;
	    }
	}
	System.out.println(ordered);
    }
}
