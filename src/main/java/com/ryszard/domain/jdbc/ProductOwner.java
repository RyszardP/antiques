package com.ryszard.domain.jdbc;

import java.util.Objects;

public class ProductOwner {
    private Long productOwnerId;
    private Long productId;
    private Long ownerId;

    public ProductOwner() {
    }

    public ProductOwner(Long productOwnerId, Long productId, Long ownerId) {
        this.productOwnerId = productOwnerId;
        this.productId = productId;
        this.ownerId = ownerId;
    }

    public Long getProductOwnerId() {
        return productOwnerId;
    }

    public void setProductOwnerId(Long productOwnerId) {
        this.productOwnerId = productOwnerId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProductOwner)) return false;
        ProductOwner that = (ProductOwner) o;
        return Objects.equals(productOwnerId, that.productOwnerId) &&
                Objects.equals(productId, that.productId) &&
                Objects.equals(ownerId, that.ownerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productOwnerId, productId, ownerId);
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ProductOwner{");
        sb.append("productOwnerId=").append(productOwnerId);
        sb.append(", productId=").append(productId);
        sb.append(", ownerId=").append(ownerId);
        sb.append('}');
        return sb.toString();
    }
}
