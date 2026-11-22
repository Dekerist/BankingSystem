import java.time.LocalDateTime;

public class Transaction {

    private int transactionID;
    private String transactionType;
    private double amount;
    private LocalDateTime transactionDate;

    public Transaction(int transactionID, String transactionType,
                       double amount) {

        this.transactionID = transactionID;
        this.transactionType = transactionType;
        this.amount = amount;
        this.transactionDate = LocalDateTime.now();
    }

    public int getTransactionID() {
        return transactionID;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDateTime getTransactionDate() {
        return transactionDate;
    }

    public void displayTransaction() {
        System.out.println("Transaction ID: " + transactionID);
        System.out.println("Transaction Type: " + transactionType);
        System.out.println("Amount: BWP " + amount);
        System.out.println("Date: " + transactionDate);
    }
}