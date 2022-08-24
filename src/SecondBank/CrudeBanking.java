package SecondBank;

public class CrudeBanking {
    private String fullName;
    private String firstName;
    private String lastName;
    private String password;
    private String accountNo;
    private int balance;
    private String pin;

    public void createAccount(String firstName, String lastName, String password, String accountNo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.accountNo = accountNo;
    }

    public static String getCreationMessage() {
        return "successfully created";
    }

    public void depositInto(String fullName, String acctNo, int amount) {
        this.fullName = firstName + lastName;
        balance += amount;
    }


    public int getBalance() { return balance; }

    public void withdrawFrom(int amount, String accountNo, String pin) {
        this.pin = pin;
        balance -= amount;
    }
}
