import java.util.Scanner;

class Learners {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int language =  scanner.nextInt();

        switch (language) {
	    case 1:
                // Java
                System.out.println("Yes!");
                break;
  	    case 2:
		// Kotlin
	        System.out.println("No!");
                break;
            case 3:
		// Scala
	        System.out.println("No!");
	        break;
            case 4:
		// Python
                System.out.println("No!");
                break;
            default:
                System.out.println("Unknown number");
                break;
	}
    }
}
