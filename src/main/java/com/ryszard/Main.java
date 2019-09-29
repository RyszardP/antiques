package com.ryszard;

import com.ryszard.config.AppConfig;
import com.ryszard.domain.jdbc.Category;
import com.ryszard.domain.jdbc.Owner;
import com.ryszard.domain.jdbc.Product;
import com.ryszard.repository.CategoryDao;
import com.ryszard.repository.OwnerDao;
import com.ryszard.repository.ProductDao;
import com.ryszard.repository.impl.CategoryDaoImpl;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        CategoryDao categoryDao = (CategoryDao) context.getBean("categoryDaoImpl");
        OwnerDao ownerDao = (OwnerDao) context.getBean("ownerDaoImpl");
        ProductDao productDao = (ProductDao) context.getBean("productDaoImpl");

        List<Category> categories = categoryDao.findAll();
        //System.out.println(categories);

        List<Owner> owners = ownerDao.findAll();
        System.out.println(owners);

        List<Product> products = productDao.findAll();
        System.out.println(products);

    }
}
