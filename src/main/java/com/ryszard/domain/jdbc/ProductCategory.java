package com.ryszard.domain.jdbc;

import java.util.Objects;

public class ProductCategory {
    private Long productCategoyId;

    private Long productId;

    private Long categoryId;

    public ProductCategory(Long productCategoyId, Long productId, Long categoryId) {
        this.productCategoyId = productCategoyId;
        this.productId = productId;
        this.categoryId = categoryId;
    }

    public Long getProductCategoyId() {
        return productCategoyId;
    }

    public void setProductCategoyId(Long productCategoyId) {
        this.productCategoyId = productCategoyId;
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
        return Objects.equals(productCategoyId, that.productCategoyId) &&
                Objects.equals(productId, that.productId) &&
                Objects.equals(categoryId, that.categoryId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productCategoyId, productId, categoryId);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ProductCategory{");
        sb.append("productCategoyId=").append(productCategoyId);
        sb.append(", productId=").append(productId);
        sb.append(", categoryId=").append(categoryId);
        sb.append('}');
        return sb.toString();
    }
}
