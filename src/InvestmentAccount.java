public class InvestmentAccount extends Account implements InterestBearing {

    private final double interestRate = 0.05;

    public InvestmentAccount(int accountNumber, double balance, String branch) {
        super(accountNumber, balance, branch);

        if (balance < 500) {
            throw new IllegalArgumentException(
                "Investment account requires an initial deposit of BWP 500."
            );
        }
    }

    public double calculateInterest() {
        return balance * interestRate;
    }

    public void payInterest() {
        balance += calculateInterest();
        System.out.println("Investment interest paid successfully!");
    }

    @Override
    public void displayAccountDetails() {
        System.out.println("Account Type: Investment Account");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: BWP " + balance);
        System.out.println("Branch: " + branch);
        System.out.println("Monthly Interest Rate: 5%");
    }
}