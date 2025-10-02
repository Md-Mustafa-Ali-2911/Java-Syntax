class Account {
    protected int accNumber;

    public Account() {
        this.accNumber = -1;
        System.out.println("Account default constructor called");
    }

    public Account(int accNumber) {
        this.accNumber = accNumber;
        System.out.println("Account parameterized constructor called");
    }
}

class BankAccount extends Account {
    private String ownerName;
    private double balance;

    private static double interestRate = 5.0;

    public BankAccount() {
        this(0, "Unknown", 0.0);
        System.out.println("BankAccount default constructor called");
    }

    public BankAccount(int accNumber, String ownerName, double balance) {
        super(accNumber);
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public void withdraw(double amount) {
        if (amount <= balance) balance -= amount;
        else System.out.println("Insufficient balance");
    }

    public void applyInterest() {
        balance += (balance * interestRate / 100);
    }

    public static void setInterestRate(double rate) {
        interestRate = rate;
    }

    public double getBalance() {
        return balance;
    }

    public String toString() {
        return "Account[" + accNumber + ", " + ownerName + ", Balance=" + balance + "]";
    }
}

public class Main {

    public static void main(String args[]) {

        BankAccount.setInterestRate(6.0);

        BankAccount a1 = new BankAccount(101, "ALice", 1000);
        BankAccount a2 = new BankAccount(102, "Bob", 2000);
        BankAccount a3 = new BankAccount();

        a1.applyInterest();
        a2.applyInterest();

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
    }
}