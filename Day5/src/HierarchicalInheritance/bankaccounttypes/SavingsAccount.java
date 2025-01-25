package HierarchicalInheritance.bankaccounttypes;

// Subclass: SavingsAccount
class SavingsAccount extends BankAccount {
    private double interestRate; // Interest rate in percentage

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance); // Call the constructor of BankAccount
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        double interest = balance * (interestRate / 100);
        balance += interest;
        System.out.println("Interest applied: " + interest);
    }

    public void displayAccountType() {
        System.out.println("Account Type: Savings Account");
    }
}

