package ChapterTwo;

import java.util.Scanner;

public class ArithmeticSmallestLargest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first integer: ");
        int firstInteger = input.nextInt();


        System.out.println("Enter second integer: ");
        int secondInteger = input.nextInt();


        System.out.println("Enter third integer: ");
        int thirdInteger = input.nextInt();

        int sum = firstInteger + secondInteger + thirdInteger;
        int avg = (firstInteger + secondInteger + thirdInteger)/3;
        int product = firstInteger * secondInteger * thirdInteger;

        System.out.println("The sum of the three numbers is "+ sum);
        System.out.println("The average of the three numbers is "+ avg);
        System.out.println("The Product of the three numbers is "+ product);


        if ((firstInteger > secondInteger) && (secondInteger > thirdInteger)) {System.out.printf("The largest of the numbers is %d and the smallest of the number is %d%n",firstInteger,thirdInteger);}

        if ((firstInteger > thirdInteger) && (thirdInteger > secondInteger)) {System.out.printf("The largest of the numbers is %d and the smallest of the number is %d%n",firstInteger,secondInteger);}

        if ((secondInteger > firstInteger) && (firstInteger > thirdInteger)) {System.out.printf("The largest of the numbers is %d and the smallest of the number is %d%n",secondInteger,thirdInteger);}

        if ((secondInteger > thirdInteger) && (thirdInteger > firstInteger)) {System.out.printf("The largest of the numbers is %d and the smallest of the number is %d%n",secondInteger,firstInteger);}

        if ((thirdInteger > firstInteger) && (firstInteger > secondInteger)) {System.out.printf("The largest of the numbers is %d and the smallest of the number is %d%n",thirdInteger,secondInteger);}

        if ((thirdInteger > secondInteger) && (secondInteger > firstInteger)) {System.out.printf("The largest of the numbers is %d and the smallest of the number is %d%n",thirdInteger,firstInteger);}

    }
}
