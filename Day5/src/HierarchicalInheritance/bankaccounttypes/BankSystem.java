package HierarchicalInheritance.bankaccounttypes;

// Main Class: BankSystem
public class BankSystem {
    public static void main(String[] args) {
        // Create a Savings Account
        SavingsAccount savings = new SavingsAccount("SAV123", 1000.0, 5.0);
        System.out.println("\nSavings Account:");
        savings.displayAccountType();
        savings.displayBalance();
        savings.applyInterest();
        savings.displayBalance();

        // Create a Checking Account
        CheckingAccount checking = new CheckingAccount("CHK456", 2000.0, 500.0);
        System.out.println("\nChecking Account:");
        checking.displayAccountType();
        checking.displayBalance();
        checking.withdraw(600.0); // Exceeds limit
        checking.withdraw(300.0); // Within limit
        checking.displayBalance();

        // Create a Fixed Deposit Account
        FixedDepositAccount fixedDeposit = new FixedDepositAccount("FD789", 5000.0, 7000.0, 5);
        System.out.println("\nFixed Deposit Account:");
        fixedDeposit.displayAccountType();
        fixedDeposit.displayBalance();
        fixedDeposit.displayMaturityDetails();
    }
}
