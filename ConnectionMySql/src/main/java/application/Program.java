package application;

import DAO.ProductDAO;
import entity.Product;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product pd = new Product();
        pd.setName(sc.next());
        pd.setPrice(sc.nextDouble());
        sc.nextLine();
        pd.setDescription(sc.next());

        new ProductDAO().registerProduct(pd);

        new ProductDAO().searchProduct(pd);

        new ProductDAO().updateProduct(pd, 2);

    }
}
