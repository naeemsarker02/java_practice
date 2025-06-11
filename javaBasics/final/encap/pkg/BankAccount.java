package pkg;
public class BankAccount {
    private double balance; // private variable = data hidden

    // public method to set balance
    public void setBalance(double amount) {
        if (amount >= 0) {
            balance = amount;
        }
    }

    // public method to get balance
    public double getBalance() {
        return balance;
    }
}
