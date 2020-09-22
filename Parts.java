import java.util.Scanner;


class Parts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numParts = scanner.nextInt();
        int tofix = 0;
        int reject= 0;
        int toship = 0;

        for (int i = 0; i < numParts; i++) { 
           int part = scanner.nextInt();
           if (part == 1) {
               // To Fix
               tofix++;
           } else if (part == -1) {
               // Reject
               reject++;
           } else {
	       // Ship part
               toship++;
           } 
        }
        System.out.println(toship + " " + tofix + " " + reject);
    }
}
		
