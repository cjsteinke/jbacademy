import java.util.Scanner;

class busTour {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int busHeight = 0;
		int bridges = 0;

		int bridgeHeight = 0;
		boolean crashes = false;
		int bridgeCounter = 1;
		int bridgeCrash = 0;

	
		busHeight = scanner.nextInt();
		bridges = scanner.nextInt();
		
		while (bridgeCounter <= bridges) {
			bridgeHeight = scanner.nextInt();
			if (bridgeHeight <= busHeight) {
				bridgeCrash = bridgeCounter;
				crashes = true;
			    System.out.println("Will crash on bridge " + bridgeCrash);
				break;
			}
			bridgeCounter++;
		}
		if (crashes == false) {
			System.out.println("Will not crash");
		}
	}
}
			

