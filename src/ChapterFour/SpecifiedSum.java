package ChapterFour;

import java.util.Scanner;

public class SpecifiedSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int integer1 = input.nextInt();
        int sum = 0;
        System.out.println("Enter another integer: ");
        int anotherInteger = input.nextInt();
        for(int i=1;i<=integer1;i++){
            sum+= anotherInteger;
            if (sum >= integer1){break;}
            System.out.println("Enter another integer: ");
            anotherInteger = input.nextInt();

//          write an else statement that will make the user know
//            number to put in the beginning and know what will stop the iteration
        }
    }
}
