package ChapterTwo;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first integer: ");
        int firstInteger = input.nextInt();

        System.out.println("Enter the second integer: ");
        int secondInteger = input.nextInt();

        int firstIntegerSquare = firstInteger * firstInteger;
        int secondIntegerSquare = secondInteger * secondInteger;

        System.out.printf("The square of %d is %d%n", firstInteger, firstIntegerSquare);
        System.out.printf("The square of %d is %d%n", secondInteger, secondIntegerSquare);

        int sumOfSquares = firstIntegerSquare + secondIntegerSquare;
        System.out.printf("The sum of their squares is %d%n", sumOfSquares);

        int diferencesOfSquares = firstIntegerSquare - secondIntegerSquare;
        System.out.printf("The difference of their squares is %d%n", diferencesOfSquares);
    }
}
