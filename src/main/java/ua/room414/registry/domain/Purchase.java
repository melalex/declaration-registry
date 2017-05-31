package ua.room414.registry.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author Alexander Melashchenko
 * @version 1.0 30 May 2017
 */
@Entity
public class Purchase implements Serializable {
    private static final long serialVersionUID = -210235963884653546L;

    private long id;
    private ProductType productType;
    private int count;
    private BigDecimal price;

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

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Purchase purchase = (Purchase) o;

        if (id != purchase.id) return false;
        if (count != purchase.count) return false;
        if (productType != null ? !productType.equals(purchase.productType) : purchase.productType != null)
            return false;
        return price != null ? price.equals(purchase.price) : purchase.price == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (productType != null ? productType.hashCode() : 0);
        result = 31 * result + count;
        result = 31 * result + (price != null ? price.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "id=" + id +
                ", productType=" + productType +
                ", count=" + count +
                ", price=" + price +
                '}';
    }
}
