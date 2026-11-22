public class Main {

    public static void main(String[] args) {

        // Create a customer
        Customer customer = new Customer(
            1, "Kgosi", "Motlogelwa", "Gaborone"
        );

        // Create different bank accounts
        SavingsAccount savings = new SavingsAccount(
            101, 2000, "Gaborone Branch"
        );

        InvestmentAccount investment = new InvestmentAccount(
            102, 5000, "Gaborone Branch"
        );

        ChequeAccount cheque = new ChequeAccount(
            103, 3000, "Gaborone Branch",
            "ABC Company", "Gaborone"
        );

        // Add accounts to customer
        customer.addAccount(savings);
        customer.addAccount(investment);
        customer.addAccount(cheque);

        // Display customer information
        customer.displayCustomer();

        System.out.println("\n--- ACCOUNT DETAILS ---");

        savings.displayAccountDetails();
        investment.displayAccountDetails();
        cheque.displayAccountDetails();

        // Perform deposits
        System.out.println("\n--- DEPOSIT ---");

        investment.deposit(1000);

        // Pay monthly interest
        System.out.println("\n--- INTEREST PAYMENT ---");

        savings.payInterest();
        investment.payInterest();

        // Display updated balances
        System.out.println("\n--- UPDATED BALANCES ---");

        System.out.println("Savings: BWP " + savings.getBalance());
        System.out.println("Investment: BWP " + investment.getBalance());

        // Create transaction record
        Transaction transaction = new Transaction(
            1, "Deposit", 1000
        );

        transaction.displayTransaction();
    }
}