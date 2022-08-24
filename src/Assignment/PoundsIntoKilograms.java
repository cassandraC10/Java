package Assignment;

import java.util.Scanner;

public class PoundsIntoKilograms {
    public static void main(String[] args){

        Scanner collect = new Scanner(System.in);

        System.out.println("Enter a number in pounds: ");
        double pounds = collect.nextDouble();

        double kilograms = pounds * 0.454;

        System.out.printf("%.1f pounds is %.3f kilograms ", pounds, kilograms);
    }
}
