package com.ryszard.repository.springdata;

import com.ryszard.domain.spring.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface SpringDataProductDao extends JpaRepository<Product,Long>, CrudRepository<Product,Long>, PagingAndSortingRepository<Product,Long> {
    List<Product> findAllByProductId(String productId);

}
