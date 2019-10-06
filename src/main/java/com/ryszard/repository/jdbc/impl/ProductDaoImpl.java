package com.ryszard.repository.jdbc.impl;

import com.ryszard.domain.jdbc.Product;
import com.ryszard.repository.jdbc.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class ProductDaoImpl implements ProductDao {

    public static final String PRODUCT_ID = "product_id";
    public static final String PRODUCT_NAME = "product_name";
    public static final String PRODUCT_STATE = "state";
    public static final String PRODUCT_YEAR = "year";
    public static final String PRODUCT_DESCRIPTION = "description";
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    private Product getProductRowMapper(ResultSet resultSet, int i) throws SQLException {
        Product product = new Product();
        product.setProductId(resultSet.getLong(PRODUCT_ID));
        product.setProductName(resultSet.getString(PRODUCT_NAME));
        product.setState(resultSet.getString(PRODUCT_STATE));
        product.setYear(resultSet.getLong(PRODUCT_YEAR));
        product.setDescription(resultSet.getString(PRODUCT_DESCRIPTION));
           return product;
    }


    @Override
    public List<Product> findAll() {
        final String findAllQuery = "select * from product";
        return namedParameterJdbcTemplate.query(findAllQuery, this::getProductRowMapper);
    }

    @Override
    public Product findById(Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Product save(Product entity) {
        return null;
    }

    @Override
    public Product update(Product entity) {
        return null;
    }

    @Override
    public List<Product> search(Product entity) {
        return null;
    }
}
