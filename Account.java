// Account.java
public class Account {
    private int accountId;
    private double balance;
    private Customer customer;

    public Account(int accountId, double balance, Customer customer) {
        this.accountId = accountId;
        this.balance = balance;
        this.customer = customer;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    public void displayInfo() {
        System.out.println("Account ID: " + accountId);
        System.out.println("Balance: $" + balance);
        System.out.println("Customer Information:");
        customer.displayInfo();
    }
}
