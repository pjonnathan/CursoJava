package application;

import entities.PrintService;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        PrintService<Integer> ps = new PrintService<>();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            ps.addValue(sc.nextInt());
        }

        ps.print();
        System.out.println();
        System.out.println("First: " + ps.first());
        sc.close();
    }
}
