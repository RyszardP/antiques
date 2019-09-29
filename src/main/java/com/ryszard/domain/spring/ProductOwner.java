package com.ryszard.domain.spring;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Objects;

public class ProductOwner {
    private Long ProductOwnerId;
    private Long ProductId;
    private Long OwnerId;

    public ProductOwner() {
    }

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
        return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
    }
}
