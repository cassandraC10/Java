package ChapterFour;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int digit1, digit2, digit3, digit4, digit5;

        System.out.println("Enter 5 digit number: ");
        int number = input.nextInt();
        while(number < 9999 || number > 100000) {
            System.out.println("Enter a 5 digit number!");
            number = input.nextInt();
        }

        digit1 = number / 10000;
        digit2 = number % 10000 / 1000;
        digit3 = number % 1000 / 100;
        digit4 = number % 100 / 10;
        digit5 = number % 10;

        if(digit1 == digit5 && digit2 == digit4)
            System.out.println("Number is a Palindrome!");
        else
            System.out.println("Number is not a Palindrome");
    }
}
