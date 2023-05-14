// This class be the driven class
import java.text.NumberFormat;
public class Account {
    // instance data (Always make them private so no one can access them outside the class)
    private final double RATE = 0.035; // 3.5 % interest rate on your savings
    private double balance; // current balance in the account
    private String name; // name of the account holder
    private int accNumber; // account number of the account holder
    
    // methods
    // constructor
    public Account (double amount, String owner, int num){
        // initialize all the instance variables
        balance = amount;
        name = owner;
        accNumber = num;
    }
    
    // Deposit to the account
    public double deposit(double amount){
        balance = balance + amount;
        return balance;
    }
    // withdraw from the account
    public double withdraw (double amount, double fee){
        balance = balance - amount - fee; // minus the fee to withdraw
        return balance;
    }
    // add the interest (3.5%) to the balance
    public double addInterest(){
        balance = balance + balance * RATE;
        return balance;
    }
    
    public double getBalance(){
        return balance;
    }
    
    public String toString(){
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        return "The account with "+accNumber+ " number of "+name+"has balance of " + fmt.format(balance);
    }
}