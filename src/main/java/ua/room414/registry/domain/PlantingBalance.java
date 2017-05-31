package ua.room414.registry.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Alexander Melashchenko
 * @version 1.0 30 May 2017
 */
@Entity
public class PlantingBalance implements Serializable {
    private static final long serialVersionUID = -3796161749494507082L;

    private long id;
    private ProductType productType;
    private int sold;
    private int forFeed;
    private int forSeeds;
    private int toRecycle;
    private int lost;

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

    public int getSold() {
        return sold;
    }

    public void setSold(int sold) {
        this.sold = sold;
    }

    public int getForFeed() {
        return forFeed;
    }

    public void setForFeed(int forFeed) {
        this.forFeed = forFeed;
    }

    public int getForSeeds() {
        return forSeeds;
    }

    public void setForSeeds(int forSeeds) {
        this.forSeeds = forSeeds;
    }

    public int getToRecycle() {
        return toRecycle;
    }

    public void setToRecycle(int toRecycle) {
        this.toRecycle = toRecycle;
    }

    public int getLost() {
        return lost;
    }

    public void setLost(int lost) {
        this.lost = lost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PlantingBalance that = (PlantingBalance) o;

        if (id != that.id) return false;
        if (sold != that.sold) return false;
        if (forFeed != that.forFeed) return false;
        if (forSeeds != that.forSeeds) return false;
        if (toRecycle != that.toRecycle) return false;
        if (lost != that.lost) return false;
        return productType != null ? productType.equals(that.productType) : that.productType == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (productType != null ? productType.hashCode() : 0);
        result = 31 * result + sold;
        result = 31 * result + forFeed;
        result = 31 * result + forSeeds;
        result = 31 * result + toRecycle;
        result = 31 * result + lost;
        return result;
    }

    @Override
    public String toString() {
        return "PlantingBalance{" +
                "id=" + id +
                ", productType=" + productType +
                ", sold=" + sold +
                ", forFeed=" + forFeed +
                ", forSeeds=" + forSeeds +
                ", toRecycle=" + toRecycle +
                ", lost=" + lost +
                '}';
    }
}
