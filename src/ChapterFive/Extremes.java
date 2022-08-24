package ChapterFive;

import java.util.Scanner;

public class Extremes {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter two numbers to find maximum of two: ");

        int a = input.nextInt();
        int b = input.nextInt();

        if (a > b) {
            System.out.printf("Between %d and %d, maximum is %d %n", a, b, a);
        }
        else {
            System.out.printf("Between %d and %d, maximum number is %d %n", a, b, b);
        }
    }

}
