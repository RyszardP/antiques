package com.ryszard.domain.jdbc;

import java.util.Objects;

public class Category {
 private Long categoryId;
 private String categoryName;
 private String categoryDescription;

    public Category() {
    }

    public Category(Long categoryId, String categoryName, String categoryDescription) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.categoryDescription = categoryDescription;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryDescription() {
        return categoryDescription;
    }

    public void setCategoryDescription(String categoryDescription) {
        this.categoryDescription = categoryDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Category)) return false;
        Category category = (Category) o;
        return Objects.equals(categoryId, category.categoryId) &&
                Objects.equals(categoryName, category.categoryName) &&
                Objects.equals(categoryDescription, category.categoryDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(categoryId, categoryName, categoryDescription);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Category{");
        sb.append("categoryId=").append(categoryId);
        sb.append(", categoryName='").append(categoryName).append('\'');
        sb.append(", categoryDescription='").append(categoryDescription).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
