import java.util.Scanner;

class isPos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
	int n3 = scanner.nextInt();

	boolean isPos;

	boolean case1 = n1 > 0 && n2 < 1 && n3 < 1;
	boolean case2 = n2 > 0 && n1 < 1 && n3 < 1;
	boolean case3 = n3 > 0 && n2 < 1 && n1 < 1;

	isPos = case1 || case2 || case3;
	
        System.out.println(isPos);

	
    }
}
