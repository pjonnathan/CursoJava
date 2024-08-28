package application;

import DAO.ProductDAO;
import entity.Product;

public class Program {
    public static void main(String[] args) {
        Product pd = new Product();
        pd.setName("Arroz");
        pd.setPrice(15.0);
        pd.setDescription("Arroz é o melhor");

        new ProductDAO().registerProduct(pd);
    }
}
