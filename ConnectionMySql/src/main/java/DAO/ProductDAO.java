package DAO;

import connection.Connection;
import entity.Product;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProductDAO {
    public void registerProduct(Product product) {
        String sql = "INSERT INTO product (name, description, price) VALUE(?,?,?)";

        PreparedStatement ps = null;

        try {
            ps = Connection.getConnection().prepareStatement(sql);
            ps.setString(1, product.getName());
            ps.setString(2, product.getDescription());
            ps.setDouble(3, product.getPrice());
            ps.execute();
            ps.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
