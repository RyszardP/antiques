package com.ryszard.domain.jdbc;

import java.util.Objects;

public class ProductCategory {
    private Long productCategoryId;
    private Long productId;
    private Long categoryId;

    public ProductCategory() {
    }

    public ProductCategory(Long productCategoryId, Long productId, Long categoryId) {
        this.productCategoryId = productCategoryId;
        this.productId = productId;
        this.categoryId = categoryId;
    }

    public Long getProductCategoyId() {
        return productCategoryId;
    }

    public void setProductCategoyId(Long productCategoyId) {
        this.productCategoryId = productCategoyId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProductCategory)) return false;
        ProductCategory that = (ProductCategory) o;
        return Objects.equals(productCategoryId, that.productCategoryId) &&
                Objects.equals(productId, that.productId) &&
                Objects.equals(categoryId, that.categoryId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productCategoryId, productId, categoryId);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ProductCategory{");
        sb.append("productCategoryId=").append(productCategoryId);
        sb.append(", productId=").append(productId);
        sb.append(", categoryId=").append(categoryId);
        sb.append('}');
        return sb.toString();
    }
}
