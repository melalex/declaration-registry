package ua.room414.registry.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author Alexander Melashchenko
 * @version 1.0 30 May 2017
 */
@Entity
public class Product implements Serializable {
    private static final long serialVersionUID = -5552925677834983251L;

    private long id;
    private ProductType productType;
    private double area;
    private double manufacturedWeight;
    private BigDecimal manufacturedCostPrice;

    private double saleWeight;
    private BigDecimal saleCostPrice;
    private BigDecimal completePrice;
    private BigDecimal income;

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

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getManufacturedWeight() {
        return manufacturedWeight;
    }

    public void setManufacturedWeight(double manufacturedWeight) {
        this.manufacturedWeight = manufacturedWeight;
    }

    public BigDecimal getManufacturedCostPrice() {
        return manufacturedCostPrice;
    }

    public void setManufacturedCostPrice(BigDecimal manufacturedCostPrice) {
        this.manufacturedCostPrice = manufacturedCostPrice;
    }

    public double getSaleWeight() {
        return saleWeight;
    }

    public void setSaleWeight(double saleWeight) {
        this.saleWeight = saleWeight;
    }

    public BigDecimal getSaleCostPrice() {
        return saleCostPrice;
    }

    public void setSaleCostPrice(BigDecimal saleCostPrice) {
        this.saleCostPrice = saleCostPrice;
    }

    public BigDecimal getCompletePrice() {
        return completePrice;
    }

    public void setCompletePrice(BigDecimal completePrice) {
        this.completePrice = completePrice;
    }

    public BigDecimal getIncome() {
        return income;
    }

    public void setIncome(BigDecimal income) {
        this.income = income;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (id != product.id) return false;
        if (Double.compare(product.area, area) != 0) return false;
        if (Double.compare(product.manufacturedWeight, manufacturedWeight) != 0) return false;
        if (Double.compare(product.saleWeight, saleWeight) != 0) return false;
        if (productType != null ? !productType.equals(product.productType) : product.productType != null) return false;
        if (manufacturedCostPrice != null ? !manufacturedCostPrice.equals(product.manufacturedCostPrice) : product.manufacturedCostPrice != null)
            return false;
        if (saleCostPrice != null ? !saleCostPrice.equals(product.saleCostPrice) : product.saleCostPrice != null)
            return false;
        if (completePrice != null ? !completePrice.equals(product.completePrice) : product.completePrice != null)
            return false;
        return income != null ? income.equals(product.income) : product.income == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = (int) (id ^ (id >>> 32));
        result = 31 * result + (productType != null ? productType.hashCode() : 0);
        temp = Double.doubleToLongBits(area);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(manufacturedWeight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (manufacturedCostPrice != null ? manufacturedCostPrice.hashCode() : 0);
        temp = Double.doubleToLongBits(saleWeight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (saleCostPrice != null ? saleCostPrice.hashCode() : 0);
        result = 31 * result + (completePrice != null ? completePrice.hashCode() : 0);
        result = 31 * result + (income != null ? income.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productType=" + productType +
                ", area=" + area +
                ", manufacturedWeight=" + manufacturedWeight +
                ", manufacturedCostPrice=" + manufacturedCostPrice +
                ", saleWeight=" + saleWeight +
                ", saleCostPrice=" + saleCostPrice +
                ", completePrice=" + completePrice +
                ", income=" + income +
                '}';
    }
}
