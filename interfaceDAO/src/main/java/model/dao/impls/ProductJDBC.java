package model.dao.impls;

import model.dao.ProductDAO;
import model.entity.Product;

import java.util.List;

public class ProductJDBC implements ProductDAO {
    @Override
    public void delete(Integer id) {

    }

    @Override
    public void insert(Product product) {

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
