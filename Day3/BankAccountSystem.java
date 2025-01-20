class BankAccount {
    // Static variable shared across all accounts
    static String bankName = "Canara Bank";
    static int totalAccounts = 0;

    // Final variable to ensure accountNumber cannot be changed once assigned
    final int accountNumber;
    String accountHolderName;
    double balance;

    // Constructor to initialize the BankAccount object
        BankAccount(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName; // Resolving ambiguity with `this`
        this.accountNumber = accountNumber;
        this.balance = 0.0;

    // Increment the totalnumber of accounts created
        totalAccounts++;
    }

    // Static method to display the total number of accounts
    static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    // Method to display account details if the object is an instance of BankAccount
    void displayAccountDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Balance: " + balance);
        }
    }
}

public class BankAccountSystem {
    public static void main(String[] args) {
        // Creating bank accounts
        BankAccount account1 = new BankAccount("Raj Sharma", 93014);
        BankAccount account2 = new BankAccount("Purvansh Sharma", 80584);

        // Display account details
        account1.displayAccountDetails();
        System.out.println();
        account2.displayAccountDetails();

        // Display total accounts created
        System.out.println();
        BankAccount.getTotalAccounts();
    }
}