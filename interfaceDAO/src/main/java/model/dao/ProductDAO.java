package model.dao;

import model.entity.Product;

import java.util.List;

public interface ProductDAO {
    void insert(Product product);
    void update(Product product);
    void delete(Integer id);
    Product findById(Integer id);
    List<Product> findAll();
}
