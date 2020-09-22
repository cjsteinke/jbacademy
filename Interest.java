//
// Interest
//
// Ann put MM money in the bank. The bank increases Ann's deposit by PP percent every year.
// Ann wants to know how many years should pass until her deposit in the bank reaches KK money.
// Can you help her to answer this question?
//
// The input contains three integers M, P, KM,P,K. It is guaranteed that all numbers are positive and K \geq MK≥M.
// Output the answer to Ann's question.
import java.util.Scanner;

class Interest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initial deposit amount
        double m = scanner.nextDouble();

        // Interest Rate
        double interest = scanner.nextDouble();
        double p = interest / 100;

        // Target Dolllar amount
        double k = scanner.nextInt();

        int years = 0;

        while (m < k) {
            m = m + (m * p);
            years++;
        }
        System.out.println(years);

    }
}