package com.ryszard;

import com.ryszard.config.AppConfig;
import com.ryszard.domain.jdbc.Category;
import com.ryszard.repository.CategoryDao;
import com.ryszard.repository.impl.CategoryDaoImpl;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        CategoryDao categoryDao = (CategoryDao) context.getBean("categoryDaoImpl");

        List<Category> categories = categoryDao.findAll();
        System.out.println(categories);
    }
}
