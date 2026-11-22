import java.util.ArrayList;

public class Customer {

    private int customerID;
    private String firstName;
    private String surname;
    private String address;

    private ArrayList<Account> accounts;

    public Customer(int customerID, String firstName,
                    String surname, String address) {

        this.customerID = customerID;
        this.firstName = firstName;
        this.surname = surname;
        this.address = address;

        accounts = new ArrayList<>();
    }

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

    public void displayCustomer() {
        System.out.println("Customer ID: " + customerID);
        System.out.println("First Name: " + firstName);
        System.out.println("Surname: " + surname);
        System.out.println("Address: " + address);
        System.out.println("Number of Accounts: " + accounts.size());
    }
}