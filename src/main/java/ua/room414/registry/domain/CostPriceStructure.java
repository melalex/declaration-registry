package ua.room414.registry.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author Alexander Melashchenko
 * @version 1.0 30 May 2017
 */
@Entity
public class CostPriceStructure implements Serializable {
    private static final long serialVersionUID = 4114540908580738763L;

    private long id;
    private ProductType productType;
    private BigDecimal seedsOrFood;
    private BigDecimal fertilizer;
    private BigDecimal fuel;
    private BigDecimal orgPayment;
    private BigDecimal materialOther;
    private BigDecimal payment;
    private BigDecimal depreciation;
    private BigDecimal socialActivities;
    private BigDecimal other;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "product_type_id")
    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public BigDecimal getSeedsOrFood() {
        return seedsOrFood;
    }

    public void setSeedsOrFood(BigDecimal seedsOrFood) {
        this.seedsOrFood = seedsOrFood;
    }

    public BigDecimal getFertilizer() {
        return fertilizer;
    }

    public void setFertilizer(BigDecimal fertilizer) {
        this.fertilizer = fertilizer;
    }

    public BigDecimal getFuel() {
        return fuel;
    }

    public void setFuel(BigDecimal fuel) {
        this.fuel = fuel;
    }

    public BigDecimal getOrgPayment() {
        return orgPayment;
    }

    public void setOrgPayment(BigDecimal orgPayment) {
        this.orgPayment = orgPayment;
    }

    public BigDecimal getMaterialOther() {
        return materialOther;
    }

    public void setMaterialOther(BigDecimal materialOther) {
        this.materialOther = materialOther;
    }

    public BigDecimal getPayment() {
        return payment;
    }

    public void setPayment(BigDecimal payment) {
        this.payment = payment;
    }

    public BigDecimal getDepreciation() {
        return depreciation;
    }

    public void setDepreciation(BigDecimal depreciation) {
        this.depreciation = depreciation;
    }

    public BigDecimal getSocialActivities() {
        return socialActivities;
    }

    public void setSocialActivities(BigDecimal socialActivities) {
        this.socialActivities = socialActivities;
    }

    public BigDecimal getOther() {
        return other;
    }

    public void setOther(BigDecimal other) {
        this.other = other;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CostPriceStructure that = (CostPriceStructure) o;

        if (id != that.id) return false;
        if (productType != null ? !productType.equals(that.productType) : that.productType != null) return false;
        if (seedsOrFood != null ? !seedsOrFood.equals(that.seedsOrFood) : that.seedsOrFood != null) return false;
        if (fertilizer != null ? !fertilizer.equals(that.fertilizer) : that.fertilizer != null) return false;
        if (fuel != null ? !fuel.equals(that.fuel) : that.fuel != null) return false;
        if (orgPayment != null ? !orgPayment.equals(that.orgPayment) : that.orgPayment != null) return false;
        if (materialOther != null ? !materialOther.equals(that.materialOther) : that.materialOther != null)
            return false;
        if (payment != null ? !payment.equals(that.payment) : that.payment != null) return false;
        if (depreciation != null ? !depreciation.equals(that.depreciation) : that.depreciation != null) return false;
        if (socialActivities != null ? !socialActivities.equals(that.socialActivities) : that.socialActivities != null)
            return false;
        return other != null ? other.equals(that.other) : that.other == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (productType != null ? productType.hashCode() : 0);
        result = 31 * result + (seedsOrFood != null ? seedsOrFood.hashCode() : 0);
        result = 31 * result + (fertilizer != null ? fertilizer.hashCode() : 0);
        result = 31 * result + (fuel != null ? fuel.hashCode() : 0);
        result = 31 * result + (orgPayment != null ? orgPayment.hashCode() : 0);
        result = 31 * result + (materialOther != null ? materialOther.hashCode() : 0);
        result = 31 * result + (payment != null ? payment.hashCode() : 0);
        result = 31 * result + (depreciation != null ? depreciation.hashCode() : 0);
        result = 31 * result + (socialActivities != null ? socialActivities.hashCode() : 0);
        result = 31 * result + (other != null ? other.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "CostPriceStructure{" +
                "id=" + id +
                ", productType=" + productType +
                ", seedsOrFood=" + seedsOrFood +
                ", fertilizer=" + fertilizer +
                ", fuel=" + fuel +
                ", orgPayment=" + orgPayment +
                ", materialOther=" + materialOther +
                ", payment=" + payment +
                ", depreciation=" + depreciation +
                ", socialActivities=" + socialActivities +
                ", other=" + other +
                '}';
    }
}
