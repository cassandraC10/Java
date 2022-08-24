package ChapterFour;

import java.util.Scanner;

public class SalesCommissionCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double value; double total = 0;
        System.out.println("Enter the value of item sold terminate with digit 1: ");

        int check = 0;
        while(check==0) {
            value = input.nextDouble();
            if(value == 1)
                check = 1;
            total += value;
        }
        double earnings = total * 0.09 + 200 ;
        System.out.printf("Earning: %.2f\n", earnings);
    }
}
