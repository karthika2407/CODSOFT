// Task - 3

import java.util.*;

class Bankaccount {

    double balance = 0;
}

class ATMInterface {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Bankaccount account = new Bankaccount();

        boolean isrunning = true;
        int choice;

        while (isrunning) {
            System.out.println("-------------------------");
            System.out.println("ATM INTERFACE");
            System.out.println("-------------------------");
            System.out.println("1. Check balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            System.out.print("Enter your choice(1-4): ");
            choice = scan.nextInt();

            switch (choice) {
                case 1 ->
                    checkbalance(account);
                case 2 ->
                    deposit(account);
                case 3 ->
                    withdraw(account);
                case 4 ->
                    isrunning = false;
                default ->
                    System.out.println("Invalid choice");
            }
        }

        System.out.println("--------------------------");
        System.out.println("Thankyou! Have a nice day.");
        System.out.println("--------------------------");

    }

    static void checkbalance(Bankaccount account) {
        System.out.print("Balance:" + account.balance);
        System.out.println("\n");
    }

    static void deposit(Bankaccount account) {
        System.out.println("Enter the amount to deposit:");
        double amount = scan.nextDouble();

        if (amount < 0) {
            System.out.println("Amount cannot be negative");
        } else {
            account.balance += amount;
            System.out.println("Amount deposited successfully");
        }

    }

    static void withdraw(Bankaccount account) {
        System.out.println("Enter the amount to withdraw:");
        double amount = scan.nextDouble();

        if (amount < 0) {
            System.out.println("Amount cannot be negative");
        } else if (amount > account.balance) {
            System.out.println("Insufficient balance");

        } else {
            account.balance -= amount;
            System.out.println("Amount withdraw successful");
        }

    }
}
