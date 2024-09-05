package application;

import model.dao.ProductDAO;
import model.dao.impls.ProductJDBC;
import model.entity.Product;

public class Program {
    public static void main(String[] args) {

        Product product = new Product("Joca", "bolo", 12.9);
        ProductDAO productDAO = new ProductJDBC();
        productDAO.insert(product);

        ProductDAO productDAO2 = new ProductJDBC();
        System.out.println(productDAO2.findById(2).getName());
    }
}
