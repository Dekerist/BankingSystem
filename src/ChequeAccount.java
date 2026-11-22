public class ChequeAccount extends Account {

    private String companyName;
    private String companyAddress;

    public ChequeAccount(int accountNumber, double balance,
                         String branch, String companyName,
                         String companyAddress) {

        super(accountNumber, balance, branch);

        if (companyName == null || companyName.trim().isEmpty()
                || companyAddress == null || companyAddress.trim().isEmpty()) {
            throw new IllegalArgumentException(
                "Company name and address are required."
            );
        }

        this.companyName = companyName;
        this.companyAddress = companyAddress;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    @Override
    public void displayAccountDetails() {
        System.out.println("Account Type: Cheque Account");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: BWP " + balance);
        System.out.println("Branch: " + branch);
        System.out.println("Company: " + companyName);
        System.out.println("Company Address: " + companyAddress);
    }
}