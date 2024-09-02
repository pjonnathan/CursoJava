package model.dao;

import model.dao.impls.ProductJDBC;

public class DaoFactory {
    public static ProductDAO createProductDAO() {
        return new ProductJDBC();
    }
}
