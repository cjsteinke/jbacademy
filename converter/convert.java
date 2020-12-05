//
// Take a base 10 number and convert to octal
//
package converter;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;

class convert {
    public static void main(String[] argv) {
        Scanner scanner = new Scanner(System.in);

        int decimalNumber = scanner.nextInt();
        int remainder = 0;
        int quotient = 1;
        ArrayList<Integer> remainders = new ArrayList<Integer>();

        while (quotient > 0) {
            quotient = decimalNumber / 8;
            remainder = decimalNumber % 8;
            remainders.add(remainder);
            decimalNumber = quotient;
        }

        Collections.reverse(remainders);
        System.out.println(remainders.get(remainders.size()-1));

    }
}