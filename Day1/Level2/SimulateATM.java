class BankAccount{
    String accountHolder;
    int accountNumber;
    double balance;

    BankAccount(String accountHolder, int accountNumber, double balance){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;     
    }

     public void deposit(double money){
        balance += money; 
        System.out.println("Deposited " + money + " Successfully");
     }
     
     public void withdraw(double money){
        if(balance >= money){
            System.out.println("Successfuly withdraw of " + money);
            balance -= money;
        } else{
            System.out.println("Insufficient balance");
        }
     }
     public void displayCurrentAmount(){
        System.out.println("Availabe Balance is " + balance);
     }

}

public class SimulateATM {
    public static void main(String[] args) {
 
        BankAccount person1 = new BankAccount("Purvansh", 88785024 , 10000);
        person1.deposit(4000);
        person1.withdraw(12000);
        person1.displayCurrentAmount();
    
    }
    
}
