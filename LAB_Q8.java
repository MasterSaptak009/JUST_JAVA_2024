/*Write a java program which create a class named Account and 
derive saving Account and Fixed - Account access from it.
 Define appropriate Constructors and methods to access account details. */

 import java.util.Scanner;

class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(int amount){
        balance=amount;
    }
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void addInterest() {
        double interest = getBalance() * interestRate / 100;
        deposit(interest);
        System.out.println("Interest added: " + interest);
    }
}

class FixedAccount extends Account {
    private int tenure; // in months

    public FixedAccount(String accountNumber, double balance, int tenure) {
        super(accountNumber, balance);
        this.tenure = tenure;
    }

    public int getTenure() {
        return tenure;
    }

    public void closeAccount() {
        double interest = getBalance() * 0.05; // Assuming fixed interest rate for closing account
        deposit(interest);
        System.out.println("Account closed. Interest added: " + interest);
        setBalance(0);
    }
}

public class LAB_Q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating Savings Account
        SavingsAccount savingsAccount = new SavingsAccount("SA123", 1000.0, 3.5);
        savingsAccount.displayDetails();
        savingsAccount.deposit(500.0);
        savingsAccount.addInterest();
        savingsAccount.displayDetails();

        // Creating Fixed Account
        FixedAccount fixedAccount = new FixedAccount("FA456", 2000.0, 12);
        fixedAccount.displayDetails();
        fixedAccount.withdraw(1000.0);
        fixedAccount.closeAccount();
        fixedAccount.displayDetails();

        scanner.close();
    }
}