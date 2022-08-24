package ChapterFour;

import java.util.Scanner;

public class FindingTheLargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number, largest = 0;
        System.out.println("Enter 10 integers");
        for(int i = 0; i < 10; i++){
            number = input.nextInt();
            if(number > largest)
                largest = number;
        }
        System.out.printf("Largest integer: %d\n", largest);
    }
}
