import java.util.Scanner;

class isPositive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
	int n3 = scanner.nextInt();

	boolean isPos; 
	
	//boolean isOnePos = n1 > 0 && n2 > 0 && n3 > 0;
	if (( n1 > 0 && n2 > 0 && n3 > 0) || (n1 > 0 && n2 > 0 || n2 > 0 & n3 > 0 || n1 > 0 && n3 > 0)) {
	    isPos = false;
	} else if ( n1 > 0 || n2 > 0 || n3 > 0) {
	    isPos = true;
	} else if ( n1 <= 0 || n2 <= 0 || n3 <= 0 || n1 <= 0) {
	    isPos = false;
	} else {
	    // We shouldn't get here
	    isPos = true;
	}
	
        System.out.println(isPos);

	
    }
}
