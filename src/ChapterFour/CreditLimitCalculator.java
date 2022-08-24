package ChapterFour;

import java.util.Scanner;

public class CreditLimitCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        {
            int account = 1, balance, charges, credits, credit_limit, newbal;
            while( account != 0 ) {
                System.out.println();
                System.out.print("Input Account Number: ");
                account = scan.nextInt();
                System.out.print("Input Beginning Balance: ");
                balance = scan.nextInt();
                System.out.print("Input Total Charges: ");
                charges = scan.nextInt();
                System.out.print("Input Total Credits: ");
                credits = scan.nextInt();
                System.out.print("Input Credit Limit: ");
                credit_limit = scan.nextInt();
                newbal = balance + charges - credits;
                System.out.println("Equivalent New Balnce: " + newbal);
                if ( newbal > credit_limit) {
                    System.out.println("Credit Limit Exceeded");
                    break;
                }
            }
        }

    }
}
