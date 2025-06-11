import pkg.BankAccount;
public class Main {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.setBalance(5000); // set balance safely
        System.out.println("Balance: " + acc.getBalance()); // access balance safely
    }
}
