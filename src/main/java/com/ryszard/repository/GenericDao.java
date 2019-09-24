package com.ryszard.repository;

import java.util.List;

public interface GenericDao<T,K> {
    List<T> findAll();

    T findById(K id);

    void delete(K id);

    T save(T entity);

    T update(T entity);

    List<T> search (T entity);
}
