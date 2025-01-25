package HierarchicalInheritance.bankaccounttypes;

// Subclass: FixedDepositAccount
class FixedDepositAccount extends BankAccount {
    private double maturityAmount; // Amount after maturity
    private int tenure; // Tenure in years

    public FixedDepositAccount(String accountNumber, double balance, double maturityAmount, int tenure) {
        super(accountNumber, balance); // Call the constructor of BankAccount
        this.maturityAmount = maturityAmount;
        this.tenure = tenure;
    }

    public void displayMaturityDetails() {
        System.out.println("Maturity Amount: " + maturityAmount + "\nTenure: " + tenure + " years");
    }

    public void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
    }
}
