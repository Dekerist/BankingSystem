import java.util.ArrayList;

public abstract class Account {

    protected int accountNumber;
    protected double balance;
    protected String branch;

    private ArrayList<Transaction> transactions;
    private static int nextTransactionID = 1;

    public Account(int accountNumber, double balance, String branch) {

        this.accountNumber = accountNumber;
        this.balance = balance;
        this.branch = branch;

        transactions = new ArrayList<>();
    }

    public void deposit(double amount) {

        if (amount > 0) {

            balance += amount;
            recordTransaction("Deposit", amount);

            System.out.println("Deposit successful!");

        } else {

            recordFailedTransaction("Deposit", amount);
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {

        if (amount > 0 && amount <= balance) {

            balance -= amount;
            recordTransaction("Withdrawal", amount);

            System.out.println("Withdrawal successful!");

        } else {

            recordFailedTransaction("Withdrawal", amount);
            System.out.println("Insufficient funds or invalid amount.");
        }
    }

    protected void recordTransaction(String type, double amount) {

        Transaction transaction = new Transaction(
            nextTransactionID++, type, amount
        );

        transactions.add(transaction);
    }

    protected void recordFailedTransaction(String type, double amount) {

        Transaction transaction = new Transaction(
            nextTransactionID++, type, amount
        );

        transaction.setTransactionStatus("Failed");
        transactions.add(transaction);
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

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public void displayTransactionHistory() {

        System.out.println("\n--- TRANSACTION HISTORY ---");

        if (transactions.isEmpty()) {
            System.out.println("No transactions available.");
            return;
        }

        for (Transaction transaction : transactions) {
            transaction.displayTransaction();
            System.out.println("----------------------");
        }
    }

    public abstract void displayAccountDetails();
}