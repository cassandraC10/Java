package Assignment;

import java.util.Scanner;

public class EvenOddIntegers {
    public static void main(String[]args){

        //initializing variables
        int InputNums = 0, OddNums = 0, EvenNums = 0, loopingVar = 0, PrintAmount;

        //initializing scanner class
        Scanner scanner = new Scanner(System.in);

        //Input using Scanner
        System.out.print("How many numbers you want to input: ");
        PrintAmount = scanner.nextInt();

        //Loop to execute if PrintAmount is bigger than or equal to The loop Variable
        while(loopingVar <= PrintAmount) {

            //increase Loop Variable by 1 if it is smaller than PrintAmount
            loopingVar++;

            //The input which will be sorted into odd or even
            System.out.print("Please input a number : ");
            InputNums = scanner.nextInt();

            //Conditional statements to Sort Input into Odd or even
            if (InputNums % 2 == 0)
            {
                //store input numbers into OddNums var if it is not divisible by 2
                OddNums = OddNums + InputNums;
            }
            else
            {
                //store input numbers into EvenNums var if it is divisible by 2
                EvenNums = EvenNums + InputNums;
            }

            if(loopingVar == PrintAmount)
            {
                //If the loop variable is equal to the print amount the break will end the loop
                break;
            }
        }

        //if the condition is true the sums are printed and the code is stopped
        if (loopingVar == PrintAmount)
        {
            System.out.println("Sum of even numbers is : " + OddNums);
            System.out.println("Sum of odd numbers is : " + EvenNums);
            System.exit(0);
        }

        //if InputNums is smaller than 0 there has been some error in the code
        if (InputNums < 0)
        {
            System.out.print("Invalid input");
            System.exit(0);
        }
    }
}
