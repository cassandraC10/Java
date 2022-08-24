package Assignment;

import java.util.Scanner;

public class PrimeNumberInteger {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);

            System.out.print(" Enter positive integer:");

            int num = input.nextInt();

            if (num < 1)

                System.out.print("Please enter number greater than 1"
                        + "Perform the program again");

            else if (num == 2)
                System.out.print("its a prime yey!");

            else if (num % 2 == 0)
                System.out.print("its not a prime ");

        }
    }

