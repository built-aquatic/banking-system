// BankingApp.java
public class BankingApp {
    public static void main(String[] args) {
        Customer customer1 = new Customer(1, "John Doe", "john.doe@example.com");
        Customer customer2 = new Customer(2, "Jane Smith", "jane.smith@example.com");

        Account account1 = new Account(101, 1000.0, customer1);
        Account account2 = new Account(102, 500.0, customer2);

        BankingSystem bankingSystem = new BankingSystem();
        bankingSystem.addAccount(account1);
        bankingSystem.addAccount(account2);

        System.out.println("Banking System Information:");
        bankingSystem.displayAccounts();
    }
}
