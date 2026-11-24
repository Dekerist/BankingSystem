import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Transaction {

    private int transactionID;
    private String transactionType;
    private double amount;
    private LocalDateTime transactionDate;
    private String transactionStatus;

    public Transaction(int transactionID, String transactionType,
                       double amount) {

        this.transactionID = transactionID;
        this.transactionType = transactionType;
        this.amount = amount;
        this.transactionDate = LocalDateTime.now();
        this.transactionStatus = "Successful";
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

    public String getTransactionStatus() {
        return transactionStatus;
    }

    public void setTransactionStatus(String transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

    public void displayTransaction() {

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        System.out.println("--- TRANSACTION DETAILS ---");
        System.out.println("Transaction ID: " + transactionID);
        System.out.println("Transaction Type: " + transactionType);
        System.out.println("Amount: BWP " + amount);
        System.out.println("Date: " +
                transactionDate.format(formatter));
        System.out.println("Status: " + transactionStatus);
    }
}