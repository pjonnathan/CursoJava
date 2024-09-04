package model.dao.impls;

import DB.ConnectionDB;
import model.dao.ProductDAO;
import model.entity.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class ProductJDBC implements ProductDAO {
    @Override
    public void delete(Integer id) {

    }

    @Override
    public void insert(Product product) {
        String sql = "INSERT INTO product (name, description, price) VALUES(?,?,?)";
        PreparedStatement ps = null;

        Connection conn = null;

        try {
            conn = ConnectionDB.getConnection();
            ps = conn.prepareStatement(sql);

            ps.setString(1, product.getName());
            ps.setString(2, product.getDescription());
            ps.setDouble(3, product.getPrice());
            ps.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void update(Product product) {

    }

    @Override
    public Product findById(Integer id) {
        return null;
    }

    @Override
    public List<Product> findAll() {
        return List.of();
    }
}
