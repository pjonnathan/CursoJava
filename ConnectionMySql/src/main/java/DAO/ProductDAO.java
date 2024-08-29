package DAO;

import connection.Connection;
import entity.Product;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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

    public void searchProduct(Product product) {
        String sql = "select * from product";
        Statement statement = null;
        ResultSet rs = null;
        try {
            statement = Connection.getConnection().createStatement();

            rs = statement.executeQuery(sql);
            while (rs.next()) {
                System.out.println(rs.getString("name") + " " + rs.getString("description") + " " + rs.getDouble("price"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void updateProduct(Product product, int id){
        String sql = "update product set name=?, description=?, price=? where id=?";
        PreparedStatement statement = null;
        try {

            statement = Connection.getConnection().prepareStatement(sql);
            statement.setInt(4, id);
            statement.setString(1, product.getName());
            statement.setString(2, product.getDescription());
            statement.setDouble(3, product.getPrice());

            int rownsAfet = statement.executeUpdate();

            System.out.println("Number of line updated: " + rownsAfet);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }





    }


}
