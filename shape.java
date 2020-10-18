import java.util.Scanner;

class shape {
    public static void main(String[] args) {
        // put your code here
        
        Scanner scanner = new Scanner(System.in);
        
        String shape = scanner.nextInt();
        
        switch (shape) {
	case 1:
                System.out.println("You have chosen a square");
                break;
            case 2:
                System.out.println("You have chosen a circle");
                break;
            case 3:
                System.out.println("You have chosen a triangle");
                break;
            case 4:
                System.out.println("You have chosen a rhombus");
                break;
            default:
                System.out.println("There is no such shape!");
                break;
        }
        
    }
}
