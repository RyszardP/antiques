package com.ryszard.domain.spring;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import java.util.Objects;

public class Owner {
    private Long ownerId;
    private String ownerName;
    private String ownerSurname;
    private String ownerAddress;
    private String ownerEmail;
    private String ownerPhone;

    public Owner() {
    }

    public Owner(Long ownerId, String ownerName, String ownerSurname, String ownerAddress, String ownerEmail, String ownerPhone) {
        this.ownerId = ownerId;
        this.ownerName = ownerName;
        this.ownerSurname = ownerSurname;
        this.ownerAddress = ownerAddress;
        this.ownerEmail = ownerEmail;
        this.ownerPhone = ownerPhone;
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOwnerSurname() {
        return ownerSurname;
    }

    public void setOwnerSurname(String ownerSurname) {
        this.ownerSurname = ownerSurname;
    }

    public String getOwnerAddress() {
        return ownerAddress;
    }

    public void setOwnerAddress(String ownerAddress) {
        this.ownerAddress = ownerAddress;
    }

    public String getOwnerEmail() {
        return ownerEmail;
    }

    public void setOwnerEmail(String ownerEmail) {
        this.ownerEmail = ownerEmail;
    }

    public String getOwnerPhone() {
        return ownerPhone;
    }

    public void setOwnerPhone(String ownerPhone) {
        this.ownerPhone = ownerPhone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Owner)) return false;
        Owner owner = (Owner) o;
        return Objects.equals(ownerId, owner.ownerId) &&
                Objects.equals(ownerName, owner.ownerName) &&
                Objects.equals(ownerSurname, owner.ownerSurname) &&
                Objects.equals(ownerAddress, owner.ownerAddress) &&
                Objects.equals(ownerEmail, owner.ownerEmail) &&
                Objects.equals(ownerPhone, owner.ownerPhone);
    }


    @Override
    public int hashCode() {
        return Objects.hash(ownerId, ownerName, ownerSurname, ownerAddress, ownerEmail, ownerPhone);
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
    }
}
