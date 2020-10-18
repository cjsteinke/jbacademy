import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);

	long num1 = scanner.nextLong();
        String operator = scanner.next();
        long num2 = scanner.nextLong();

	
	switch (operator) {
	    case "+":
		System.out.println(num1 + num2);
	        break;
	    case "-":
		System.out.println(num1 - num2);
	        break;
	    case "/":
		if (num2 == 0) {
		    System.out.println("Division by 0!");
		} else {
		    System.out.println(num1 / num2);
		}
	        break;
	    case "*":
                System.out.println(num1 * num2);
	        break;
	    default:
                System.out.println("Undefined Operation!");
                break;

	    } 

    }
}

	
