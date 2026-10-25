import java.util.Scanner;

public class BankAccount {
    double balance = 0;

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void display() {
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount();

        System.out.print("Enter deposit amount: ");
        double d = sc.nextDouble();
        account.deposit(d);

        System.out.print("Enter withdrawal amount: ");
        double w = sc.nextDouble();
        account.withdraw(w);

        account.display();

        sc.close();
    }
}