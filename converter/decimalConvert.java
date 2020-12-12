
//package converter;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;
import java.lang.*;

public class decimalConvert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int decimalNumber = scanner.nextInt();
        int radix = scanner.nextInt();

        switch (radix) {
            case 2:
                // Binary Case
                System.out.println("0b" + Integer.toBinaryString(decimalNumber));
                break;
            case 8:
                // Octal Case
                System.out.println("0" + Integer.toOctalString(decimalNumber));
                break;
            case 16:
                // Hexadecimal Case
                System.out.println("0x" + Integer.toHexString(decimalNumber));
                break;
            default:
                // Unknown radix so print out Decimal
                System.out.println(decimalNumber);
                break;
        }
    }
}