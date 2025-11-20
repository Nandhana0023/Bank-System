import java.util.Scanner;
class BankAccount {
    private String accountHolder;
    private long accountNumber;
    private double balance;
    BankAccount(String accountHolder, long accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount Deposited Successfully!");
    }

    public void withdraw(double amount) {
        if(amount > balance) {
            System.out.println("Insufficient Balance!");
        } else {
            balance -= amount;
            System.out.println("Amount Withdrawn Successfully!");
        }
    }

    public void checkBalance() {
        System.out.println("Account Balance: ₹" + balance);
    }

    public void displayDetails() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: ₹" + balance);
    }
}

public class BankSystem {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        BankAccount acc = new BankAccount("Nandu", 1234567890, 5000.0);
        while(true) {
            System.out.println("\n--- Bank Menu ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Account Details");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int choice = z.nextInt();
            switch(choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double dep = z.nextDouble();
                    acc.deposit(dep);
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double w = z.nextDouble();
                    acc.withdraw(w);
                    break;

                case 3:
                    acc.checkBalance();
                    break;

                case 4:
                    acc.displayDetails();
                    break;

                case 5:
                    System.out.println("Thank you! Visit again.");
                    z.close();
                    return;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}
