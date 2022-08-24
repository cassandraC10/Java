package Assignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    @Test
    public void checkNameTest(){
        Account adeola_Emmanuel = new Account();  //created a new account for adeola
        adeola_Emmanuel.setName("adeola_Emmanuel"); // used the set method in account class methon to store the name
        assertEquals("adeola_Emmanuel", adeola_Emmanuel.getName()); // tested the get name method
        var saved = adeola_Emmanuel.getName();
        System.out.println(saved);
    }
}

//import java.util.Scanner;
//
//public class AccountTest {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        Account myAccount = new Account();  //created a new account for adeola
//        System.out.printf("Initial name is: %s%n%n", myAccount.getName());
//        System.out.println("Please enter the account name");
//        String theName = scan.nextLine();
//        myAccount.setName(theName);
//        System.out.println();
//
//        System.out.printf("Name in object myAccount is: %n%s%n", myAccount.getName());
//
//    }
//}