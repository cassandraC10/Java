import SecondBank.CrudeBanking;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.*;

public class CrudeBankingTest {
    CrudeBanking person1;
    CrudeBanking person2;

    @BeforeEach public void beginEachWith(){
        person1 = new CrudeBanking();
        person2 = new CrudeBanking();
    }
    @Test public void canCreateAccountTest(){
        person1.createAccount("Cassandra","Oliver","1234","246810");
        assertEquals("successfully created", CrudeBanking.getCreationMessage());
    }

    @Test public void canDepositIntoAcctTest(){
        person1.createAccount("Cassandra","Oliver","1234","246810");
        person1.depositInto("Cassandra Oliver","12345", 2000);
        assertEquals(2000, person1.getBalance());
    }

    @Test public void withdrawFromAccountTest(){
        person1.createAccount("Cassandra","Oliver","1234","246810");
        person1.depositInto("Cassandra Oliver","12345", 2000);
        person1.withdrawFrom(2000, "12345", "1234");
        assertEquals(0, person1.getBalance());
    }
}
