package Tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class CrudeBankingTest {
Bank secondBank;
private Accounts accounts;
    @BeforeEach
    public void setUp() { secondBank = new Bank(); }

    @Test
    public void setUpAccount(){
        Accounts accounts = new Accounts("Peter", 1000);
    }

    @Test
    public void accountCanBeCreated(){
        assertEquals(accounts.getName(), "Peter");
        assertEquals(1000, accounts.getBalance());
    }

    @Test
    public void DepositMoneyToAnAccountTest(){
        Accounts accounts = new Accounts("Peter", 1000);
        accounts.deposit(1000);
        assertEquals(1000, accounts.getBalance());
    }

    @Test
    public void withdrawMoneyFromAccount(){
        Accounts accounts = new Accounts("Peter", 1000);
        accounts.deposit(1000);
        accounts.withdraw(500);
        assertEquals(500, accounts.getBalance());
    }

}
