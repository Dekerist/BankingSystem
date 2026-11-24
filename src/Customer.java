import java.util.ArrayList;

public class Customer {

    private int customerID;
    private String firstName;
    private String surname;
    private String address;

    private String username;
    private String password;
    private String pin;

    private ArrayList<Account> accounts;

    public Customer(int customerID, String firstName,
                    String surname, String address) {

        this(customerID, firstName, surname, address,
             "kgosi", "12345", "1234");
    }

    public Customer(int customerID, String firstName,
                    String surname, String address,
                    String username, String password, String pin) {

        this.customerID = customerID;
        this.firstName = firstName;
        this.surname = surname;
        this.address = address;

        this.username = username;
        this.password = password;
        this.pin = pin;

        accounts = new ArrayList<>();
    }

    // Customer login
    public boolean login(String username, String password) {

        if (this.username.equals(username)
                && this.password.equals(password)) {

            System.out.println("Login successful. Welcome "
                    + firstName + "!");
            return true;

        } else {

            System.out.println("Invalid username or password.");
            return false;
        }
    }

    // Change customer PIN
    public boolean changePin(String currentPin, String newPin) {

        if (!this.pin.equals(currentPin)) {
            System.out.println("Incorrect current PIN.");
            return false;
        }

        if (newPin == null || !newPin.matches("[0-9]{4}")) {
            System.out.println("New PIN must contain exactly 4 digits.");
            return false;
        }

        this.pin = newPin;

        System.out.println("PIN changed successfully!");
        return true;
    }

    // Open Savings Account
    public void openSavingsAccount(int accountNumber,
                                   double initialBalance,
                                   String branch) {

        SavingsAccount savings = new SavingsAccount(
                accountNumber, initialBalance, branch);

        accounts.add(savings);

        System.out.println("Savings account opened successfully!");
    }

    // Open Investment Account
    public void openInvestmentAccount(int accountNumber,
                                      double initialBalance,
                                      String branch) {

        InvestmentAccount investment = new InvestmentAccount(
                accountNumber, initialBalance, branch);

        accounts.add(investment);

        System.out.println("Investment account opened successfully!");
    }

    // Open Cheque Account
    public void openChequeAccount(int accountNumber,
                                  double initialBalance,
                                  String branch,
                                  String companyName,
                                  String companyAddress) {

        ChequeAccount cheque = new ChequeAccount(
                accountNumber, initialBalance, branch,
                companyName, companyAddress);

        accounts.add(cheque);

        System.out.println("Cheque account opened successfully!");
    }

    // Add an existing account
    public void addAccount(Account account) {
        accounts.add(account);
    }

    public int getCustomerID() {
        return customerID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    public String getAddress() {
        return address;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    // Display customer details
    public void displayCustomer() {

        System.out.println("Customer ID: " + customerID);
        System.out.println("First Name: " + firstName);
        System.out.println("Surname: " + surname);
        System.out.println("Address: " + address);
        System.out.println("Number of Accounts: " + accounts.size());
    }
}