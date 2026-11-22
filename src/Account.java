public abstract class Account {

    protected int accountNumber;
    protected double balance;
    protected String branch;

    public Account(int accountNumber, double balance, String branch) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.branch = branch;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful!");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful!");
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getBranch() {
        return branch;
    }

    public abstract void displayAccountDetails();
}