package Encapsulation;



public class BankAccount {
    private double balance = 0;

    // Method to deposit money
    public void deposit(double amt) {
        if (amt > 0) {
            balance += amt;
            System.out.println("Deposited amount = " + amt);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    // Method to withdraw money
    public void withdraw(double amt) {
        if (amt > 0 && amt <= balance) {
            balance -= amt;
            System.out.println("Withdraw amount = " + amt);
        } else {
            System.out.println("Invalid amount");
        }
    }

    // Private method to access balance (internal use only)
    private double getbalance() {
        return balance;
    }

    // Public method to get current balance securely
    public double checkBalance() {
        return getbalance();  // Calls private method internally
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.deposit(50000);
        acc.withdraw(10000);
        System.out.println("Current balance is = " + acc.checkBalance());
    }



}
