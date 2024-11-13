package assignment;

public class Bank {

    private static int TotalAccounts = 0;

    public Bank() {
        TotalAccounts++;
    }

    public static int getTotalAccounts() {
        return TotalAccounts;
    }

    public static void main(String[] args) {
    
        Bank account1 = new Bank();
        Bank account2 = new Bank();
        Bank account3 = new Bank();

        System.out.println("Total Accounts: " + Bank.getTotalAccounts());
}
}

