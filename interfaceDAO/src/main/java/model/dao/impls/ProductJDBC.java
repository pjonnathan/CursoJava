package model.dao.impls;

import DB.ConnectionDB;
import model.dao.ProductDAO;
import model.entity.Product;

import java.sql.*;
import java.util.List;

public class ProductJDBC implements ProductDAO {
    @Override
    public void delete(Integer id) {
        String sql = "DELETE FROM product WHERE id = ?";
        PreparedStatement ps = null;

        Connection conn = null;
        conn = ConnectionDB.getConnection();

        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

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
    public void update(Product product, int id) {
        String sql = "UPDATE product SET name = ?, description = ?, price = ? WHERE id = ?";

        PreparedStatement ps = null;
        Connection conn = null;
        conn = ConnectionDB.getConnection();

        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, product.getName());
            ps.setString(2, product.getDescription());
            ps.setDouble(3, product.getPrice());
            ps.setInt(4, id);

            ps.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Product findById(Integer id) {
        String sql = "SELECT name FROM product WHERE id = ?";
        Product product = new Product();
        PreparedStatement ps = null;
        Connection conn = null;
        ResultSet rs = null;

        conn = ConnectionDB.getConnection();
        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                product.setName(rs.getString("name"));
            }
            return product;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}
