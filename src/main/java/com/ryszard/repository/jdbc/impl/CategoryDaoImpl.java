package com.ryszard.repository.jdbc.impl;

import com.ryszard.domain.jdbc.Category;
import com.ryszard.repository.jdbc.CategoryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Objects;

@Repository
@Transactional
public class CategoryDaoImpl implements CategoryDao {

    public static final String CATEGORY_ID = "category_id";
    public static final String CATEGORY_NAME = "category_name";
    public static final String CATEGORY_DESCRIPTION = "category_description";

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    private Category getCategoryRowMapper(ResultSet resultSet, int i) throws SQLException {
        Category category = new Category();
        category.setCategoryId(resultSet.getLong(CATEGORY_ID));
        category.setCategoryName(resultSet.getString(CATEGORY_NAME));
        category.setCategoryDescription(resultSet.getString(CATEGORY_DESCRIPTION));
        return category;
    }

    @Override
    public List<Category> findAll() {
        final String findAllQuery = "select * from category";
        return namedParameterJdbcTemplate.query(findAllQuery, this::getCategoryRowMapper);
    }

    @Override
    public Category findById(Long id) {
        final String findById = "select * from category where category_id = :categoryId";
        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("categoryId", id);
        return namedParameterJdbcTemplate.queryForObject(findById, params, this::getCategoryRowMapper);
    }

    @Override
    public void delete(Long id) {
        final String delete = "delete * from category where category_id = :categoryId";
        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("categoryId", id);
        namedParameterJdbcTemplate.update(delete, params);
    }

    @Override
    public Category save(Category entity) {
        final String createQuery = "INSERT INTO category(category_id, category_name, category_description)" +
                "VALUES (:categoryId, :categoryName, :categoryDescription);";
        KeyHolder keyHolder = new GeneratedKeyHolder();

        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("categoryId", entity.getCategoryId());
        params.addValue("categoryName", entity.getCategoryName());
        params.addValue("categoryDescription", entity.getCategoryDescription());
        namedParameterJdbcTemplate.update(createQuery,params,keyHolder);
        long createdCategoryId= Objects.requireNonNull(keyHolder.getKey()).longValue();
        return findById(createdCategoryId);
    }

    @Override
    public Category update(Category entity) {
        final String createQuery = "UPDATE category set category_name = :categoryName, category_description =:categoryDescription";

        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("categoryName", entity.getCategoryName());
        params.addValue("categoryDescription", entity.getCategoryDescription());
        namedParameterJdbcTemplate.update(createQuery, params);
        return findById(entity.getCategoryId());
    }

    @Override
    public List<Category> search(Category entity) {

        return null;
    }


}
