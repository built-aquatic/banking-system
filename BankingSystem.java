// BankingSystem.java
import java.util.ArrayList;
import java.util.List;

public class BankingSystem {
    private List<Account> accounts;

    public BankingSystem() {
        accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void displayAccounts() {
        System.out.println("Accounts in the Banking System:");
        for (Account account : accounts) {
            account.displayInfo();
            System.out.println();
        }
    }
}
