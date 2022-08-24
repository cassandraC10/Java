package Assignment;

import java.security.SecureRandom;
import java.util.Scanner;

public class ComputerBasedTest {
        private static int question1;
        private static int question2;
        private static int answer;


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            SecureRandom random = new SecureRandom();
            int message =  question1, question2;


            question1 = random.nextInt(9) + 1;
            question2 = random.nextInt(9) + 1;


            System.out.println("how many is " + question1 + " times " + question2 + " ? ");

            answer = question1 * question2;
            message = random.nextInt(9);


            int userInput = 0;
            while (userInput != -1) {

                userInput = scanner.nextInt();

                if (userInput == answer) {
                    System.out.println("very good");
                } else {
                    System.out.println("pls try again");
                    System.out.println(message);
                }
            }
        }
}

