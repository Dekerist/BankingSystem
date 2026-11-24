public class Main {

    public static void main(String[] args) {

        // Create a customer
        Customer customer = new Customer(
            1, "Kgosi", "Motlogelwa", "Gaborone"
        );

        // Customer login
        System.out.println("\n--- CUSTOMER LOGIN ---");

        boolean loginSuccessful = customer.login("kgosi", "12345");

        // Change PIN
        if (loginSuccessful) {
            System.out.println("\n--- CHANGE PIN ---");
            customer.changePin("1234", "5678");
        }

        // Open bank accounts
        System.out.println("\n--- OPENING BANK ACCOUNTS ---");

        customer.openSavingsAccount(
            101, 2000, "Gaborone Branch"
        );

        customer.openInvestmentAccount(
            102, 5000, "Gaborone Branch"
        );

        customer.openChequeAccount(
            103, 3000, "Gaborone Branch",
            "ABC Company", "Gaborone"
        );

        // Retrieve customer accounts
        SavingsAccount savings =
            (SavingsAccount) customer.getAccounts().get(0);

        InvestmentAccount investment =
            (InvestmentAccount) customer.getAccounts().get(1);

        ChequeAccount cheque =
            (ChequeAccount) customer.getAccounts().get(2);

        // Display customer
        System.out.println("\n--- CUSTOMER DETAILS ---");
        customer.displayCustomer();

        // Display account details
        System.out.println("\n--- ACCOUNT DETAILS ---");

        savings.displayAccountDetails();
        investment.displayAccountDetails();
        cheque.displayAccountDetails();

        // Test deposits
        System.out.println("\n--- DEPOSIT TEST ---");

        investment.deposit(1000);
        savings.deposit(500);

        // Test withdrawals
        System.out.println("\n--- WITHDRAWAL TEST ---");

        investment.withdraw(200);
        cheque.withdraw(300);

        // Pay interest
        System.out.println("\n--- INTEREST PAYMENT ---");

        savings.payInterest();
        investment.payInterest();

        // Display updated balances
        System.out.println("\n--- UPDATED BALANCES ---");

        System.out.println("Savings: BWP " + savings.getBalance());
        System.out.println("Investment: BWP " + investment.getBalance());
        System.out.println("Cheque: BWP " + cheque.getBalance());

        // Display transaction histories
        System.out.println("\n--- SAVINGS TRANSACTIONS ---");
        savings.displayTransactionHistory();

        System.out.println("\n--- INVESTMENT TRANSACTIONS ---");
        investment.displayTransactionHistory();

        System.out.println("\n--- CHEQUE TRANSACTIONS ---");
        cheque.displayTransactionHistory();
    }
}