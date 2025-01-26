package bankingsystem;

import java.util.*;

public class BankingSystem {
    public static void main(String[] args) {
        // Create accounts
        List<BankAccount> accounts = new ArrayList<>();
        accounts.add(new SavingsAccount("SAV123", "Raj", 10000, 4));
        accounts.add(new CurrentAccount("CUR456", "Purvansh", 5000, 2000));

        for (BankAccount account : accounts) {
            System.out.println("Account Holder: " + account.getHolderName());
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Balance: " + account.getBalance());

            // Calculate interest dynamically
            System.out.println("Interest: " + account.calculateInterest());

            // Demonstrate Loanable interface
            if (account instanceof Loanable) {
                Loanable loanable = (Loanable) account;
                loanable.applyForLoan();
                System.out.println("Loan Eligibility: " + loanable.calculateLoanEligibility());
            }

            System.out.println();
        }
    }
}