package HierarchicalInheritance.bankaccounttypes;

// Subclass: CheckingAccount
class CheckingAccount extends BankAccount {
    private double withdrawalLimit; // Maximum withdrawal amount per transaction

    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance); // Call the constructor of BankAccount
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > withdrawalLimit) {
            System.out.println("Withdrawal amount exceeds the limit of " + withdrawalLimit);
        } else {
            super.withdraw(amount); // Call the withdraw method of BankAccount
        }
    }

    public void displayAccountType() {
        System.out.println("Account Type: Checking Account");
    }
}
