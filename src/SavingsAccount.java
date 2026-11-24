public class SavingsAccount extends Account implements InterestBearing {

    private final double interestRate = 0.0005;

    public SavingsAccount(int accountNumber, double balance, String branch) {
        super(accountNumber, balance, branch);
    }

    @Override
    public double calculateInterest() {
        return balance * interestRate;
    }

    @Override
    public void payInterest() {

        double interest = calculateInterest();

        balance += interest;

        recordTransaction("Interest Payment", interest);

        System.out.println("Savings interest paid successfully!");
    }

    @Override
    public void withdraw(double amount) {

        recordFailedTransaction("Withdrawal", amount);

        System.out.println(
            "Withdrawals are not allowed on Savings Accounts."
        );
    }

    @Override
    public void displayAccountDetails() {

        System.out.println("Account Type: Savings Account");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: BWP " + balance);
        System.out.println("Branch: " + branch);
        System.out.println("Monthly Interest Rate: 0.05%");
    }
}