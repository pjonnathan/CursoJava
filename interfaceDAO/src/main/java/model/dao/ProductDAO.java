package model.dao;

import model.entity.Product;

public interface ProductDAO {
    void insert(Product product);
    void update(Product product, int id);
    void delete(Integer id);
    Product findById(Integer id);
}
