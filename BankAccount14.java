class AccountHolder {
    private String name;
    private int id;

    // Fields for Individual account
    private String nominee;

    // Fields for Joint account
    private String coHolderName;
    private String operatingMode;

    // Constructor for Individual account
    public AccountHolder(String name, int id, String nominee) {
        this.name = name;
        this.id = id;
        this.nominee = nominee;
    }

    // Constructor for Joint account
    public AccountHolder(String name, int id, String coHolderName, String operatingMode) {
        this.name = name;
        this.id = id;
        this.coHolderName = coHolderName;
        this.operatingMode = operatingMode;
    }

    // Display details
    public void showDetails() {
        System.out.println("Account Holder Name: " + name);
        System.out.println("Account ID: " + id);

        if (nominee != null) {
            System.out.println("Type: Individual Account");
            System.out.println("Nominee: " + nominee);
        } else {
            System.out.println("Type: Joint Account");
            System.out.println("Co-Holder: " + coHolderName);
            System.out.println("Operating Mode: " + operatingMode);
        }
        System.out.println("-----------------------------");
    }
}

public class BankAccount14 {
    public static void main(String[] args) {
        // Create Individual account
        AccountHolder a1 = new AccountHolder("Chakri", 1001, "Ramesh");

        // Create Joint account
        AccountHolder a2 = new AccountHolder("Meena", 1002, "Suresh", "Either or Survivor");

        // Display details
        a1.showDetails();
        a2.showDetails();
    }
}
