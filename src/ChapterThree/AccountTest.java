package ChapterThree;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Account account = new Account(" ", 0);

        System.out.println("Enter your name: ");
        String name = input.next();
        account.setName(name);
        System.out.printf("Your account balance is %.2f\n", account.getBalance());

        System.out.println("Enter amount to deposit in your account: ");
        double deposit = input.nextDouble();
        account.depositAmount(deposit);

        System.out.printf("Your new balance is: %.3f\n", account.getBalance());

        System.out.println("Enter amount you wish to withdraw: ");
        double withdraw = input.nextDouble();
        account.withdrawn(withdraw);

        System.out.printf("Your new balance is: %.3f\n", account.getBalance());


    }
}
