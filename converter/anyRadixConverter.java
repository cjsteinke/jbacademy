//package converter;

import java.util.Scanner;

public class anyRadixConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sourceRadix = scanner.nextInt();
        int sourceNumber = scanner.nextInt();
        int targetRadix = scanner.nextInt();

        if (sourceRadix == 1) {
            // Base 1 Case
            String baseOneNumber = Integer.toString(sourceNumber);
            if (targetRadix == 10) {
                System.out.println(baseOneNumber.length());
            } else {
                // First convert to decimal
                int decimalTemp = baseOneNumber.length();
                System.out.println(Integer.toString(decimalTemp, targetRadix));
            }
        } else  {
            int decimalNum = Integer.parseInt(Integer.toString(sourceNumber), sourceRadix);
            System.out.println(Integer.toString(decimalNum, targetRadix));
        }

        if (targetRadix == 1) {
            if (sourceRadix == 10) {
                for (int i = 1; i <= sourceNumber; i++) {
                    System.out.print("1");
                }
                System.out.print("\n");
            } else {
                int decTemp = Integer.parseInt(Integer.toString(sourceNumber), sourceRadix);
                for (int j = 1; j <= decTemp; j++) {
                    System.out.print("1");
                }
                System.out.print("\n");
            }
        }
    }
}