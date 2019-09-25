package com.ryszard.repository.impl;

import com.ryszard.domain.jdbc.Owner;
import com.ryszard.repository.OwnerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
@Transactional
public class OwnerDaoImpl implements OwnerDao {

    public static final String OWNER_ID = "owner_id";
    public static final String OWNER_NAME = "owner_name";
    public static final String OWNER_SURNAME = "owner_surname";
    public static final String OWNER_ADDRESS = "owner_address";
    public static final String OWNER_EMAIL = "owner_email";
    public static final String OWNER_PHONE = "owner_phone";

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    private Owner getOwnerRowMapper (ResultSet resultSet, int i) throws SQLException{
        Owner owner = new Owner();
        owner.setOwnerId(resultSet.getLong(OWNER_ID));
        owner.setOwnerName(resultSet.getString(OWNER_NAME));
        owner.setOwnerSurname(resultSet.getString(OWNER_SURNAME));
        owner.setOwnerAddress(resultSet.getString(OWNER_ADDRESS));
        owner.setOwnerEmail(resultSet.getString(OWNER_EMAIL));
        owner.setOwnerPhone(resultSet.getString(OWNER_PHONE));
        return owner;
    }

    @Override
    public List<Owner> findAll() {
        final String findallQuerry = "select * from owner";
                return namedParameterJdbcTemplate.query(findallQuerry, this::getOwnerRowMapper);
    }

    @Override
    public Owner findById(Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Owner save(Owner entity) {
        return null;
    }

    @Override
    public Owner update(Owner entity) {
        return null;
    }

    @Override
    public List<Owner> search(Owner entity) {
        return null;
    }
}
