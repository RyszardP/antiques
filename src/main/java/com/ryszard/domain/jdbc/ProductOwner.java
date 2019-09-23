package com.ryszard.domain.jdbc;

import java.util.Objects;

public class ProductOwner {
    public Long ProductOwnerId;

    public Long ProductId;

    public Long OwnerId;

    public ProductOwner(Long productOwnerId, Long productId, Long ownerId) {
        ProductOwnerId = productOwnerId;
        ProductId = productId;
        OwnerId = ownerId;
    }

    public Long getProductOwnerId() {
        return ProductOwnerId;
    }

    public void setProductOwnerId(Long productOwnerId) {
        ProductOwnerId = productOwnerId;
    }

    public Long getProductId() {
        return ProductId;
    }

    public void setProductId(Long productId) {
        ProductId = productId;
    }

    public Long getOwnerId() {
        return OwnerId;
    }

    public void setOwnerId(Long ownerId) {
        OwnerId = ownerId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProductOwner)) return false;
        ProductOwner that = (ProductOwner) o;
        return Objects.equals(ProductOwnerId, that.ProductOwnerId) &&
                Objects.equals(ProductId, that.ProductId) &&
                Objects.equals(OwnerId, that.OwnerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ProductOwnerId, ProductId, OwnerId);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ProductOwner{");
        sb.append("ProductOwnerId=").append(ProductOwnerId);
        sb.append(", ProductId=").append(ProductId);
        sb.append(", OwnerId=").append(OwnerId);
        sb.append('}');
        return sb.toString();
    }
}
