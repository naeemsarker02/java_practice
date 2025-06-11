import java.util.Scanner;
class BankAccount {


    String accountHolder;
    long accountNumber;
    double balance;

    BankAccount(String name, long number, double tk) {
        this.accountHolder = name;
        this.accountNumber = number;
        this.balance = tk;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println(amount + " is successfully deposited!!!");
        } else {
            System.out.println("Invalid amount");
        }
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println(amount + " is successfully withdrawn!!!");
        }else{
            System.out.println("Invalid amount");
        }
    }

    void accountInfo() {
        System.out.println("\naccount holders name : " + accountHolder);
        System.out.println("account number : " + accountNumber);
        System.out.println("current balance : " + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name :");
        String name = sc.nextLine();
        System.out.print("Enter your account number : ");
        long number = sc.nextLong();

        BankAccount obj = new BankAccount( name, number, 10000.0);

        System.out.print("enter amount to deposit :");
        double Damount = sc.nextDouble();
        obj.deposit(Damount);

        // obj.deposit(5000.1);
        System.out.print("enter amount to withdraw :");
        double Wamount = sc.nextDouble();
        obj.withdraw(Wamount);
        // obj.withdraw(500.1);
        obj.accountInfo();
        sc.close();
    }
}