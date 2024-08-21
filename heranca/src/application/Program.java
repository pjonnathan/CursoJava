package application;

import entities.Account;
import entities.BusinessAccount;

public class Program {
    public static void main(String[] args) {
        Account account1 = new Account(123, "Alex", 1200.0);

        Account account2 = new BusinessAccount(134, "Jhon", 0.0, 1234.98 );

        System.out.println("Account 2: " + account2.getBalance());
        System.out.println("Account 1: " + account1.getBalance());
        System.out.println("------------------------------------------");

        account2.deposit(120000.0);
        System.out.println("Account 2: " + account2.getBalance());
        account2.withdraw(10000.0);
        account1.withdraw(200.0);

        System.out.println("-------------------------------------------");

        System.out.println("Account 1: " + account1.getBalance());
        System.out.println("Account 2: " + account2.getBalance());

    }
}
