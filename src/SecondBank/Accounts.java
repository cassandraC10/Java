package SecondBank;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Accounts {

    private double balance;
    private String fullName;
    private int acctPin;
    private LocalDateTime timeStamp;

    public Accounts(String fullName, double balance) {
        this.fullName = fullName;
        timeStamp = LocalDateTime.now();

        if(balance < 0.0)
            this.balance = balance;
    }

    public String getTimeStamp() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("E, dd-MM-yyyy, hh:mm a");
        String timeStamp = dateTimeFormatter.format(this.timeStamp);
        return timeStamp;
    }
    // write an arraylist method to generate the account numbers
    // set and get it, i think.





    public double getBalance() { return balance; }

    public void setAcctPin(int acctPin) { this.acctPin = acctPin; }

    public String getFullName() {return fullName;}

    public void setFullName(String fullName) {this.fullName = fullName;}

    @Override
    public String toString() {
        return String.format("""
                Date: %s
                                
                firstName: %s
                                
                lastName:
                %s%n""", getTimeStamp(),getFullName());
    }
}
