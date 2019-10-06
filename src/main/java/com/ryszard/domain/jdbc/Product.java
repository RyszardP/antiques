package com.ryszard.domain.jdbc;


import java.util.Objects;


public class Product {
    private Long productId;
    private String productName;
    private String state;
    private Long year;
    private String description;

    public Product() {
    }

    public Product(Long productId, String productName, String state, Long year, String description) {
        this.productId = productId;
        this.productName = productName;
        this.state = state;
        this.year = year;
        this.description = description;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Long getYear() {
        return year;
    }

    public void setYear(Long year) {
        this.year = year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return Objects.equals(productId, product.productId) &&
                Objects.equals(productName, product.productName) &&
                Objects.equals(state, product.state) &&
                Objects.equals(year, product.year) &&
                Objects.equals(description, product.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, productName, state, year, description);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ProductDao{");
        sb.append("productId=").append(productId);
        sb.append(", productName='").append(productName).append('\'');
        sb.append(", state='").append(state).append('\'');
        sb.append(", year=").append(year);
        sb.append(", description='").append(description).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
