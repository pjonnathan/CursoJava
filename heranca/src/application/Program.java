package application;

import entities.Account;
import entities.BusinessAccount;

public class Program {
    public static void main(String[] args) {
        Account account1 = new Account(123, "Alex", 1200.0);

        BusinessAccount ba1 = new BusinessAccount(234, "Leo", 1233.0, 2.0);

        account1.deposit(234.0);

    }
}
