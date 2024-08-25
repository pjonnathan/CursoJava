package application;

import model.entities.Account;
import model.exeption.DomainException;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter account data");
            System.out.println("Number:" );
            Integer number = sc.nextInt();
            System.out.println("Holder: ");
            String holder = sc.next();
            sc.nextLine();
            System.out.println("Initial balance: ");
            Double initialBalance = sc.nextDouble();
            System.out.println("Withdraw limit: ");
            Double withdrawLimit = sc.nextDouble();
            Account account = new Account(number, holder, initialBalance, withdrawLimit);

            System.out.println("Enter amount for withdraw: ");
            Double withdrawAmount = sc.nextDouble();
            account.withdraw(withdrawAmount);

            System.out.println("Withdraw successful! ");
            System.out.println("Balance: " + account.getBalance());
        }
        catch (DomainException e){
            System.out.println(e.getMessage());
        }



    }
}