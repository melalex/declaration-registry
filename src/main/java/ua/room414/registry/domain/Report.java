package ua.room414.registry.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author Alexander Melashchenko
 * @version 1.0 30 May 2017
 */
@Entity
public class Report implements Serializable {
    private static final long serialVersionUID = -232114077621724055L;

    private long id;
    private Date date;
    private Respondent respondent;
    private List<Product> products;
    private List<CostPriceStructure> costPriceStructures;
    private List<Purchase> purchases;
    private List<PlantingBalance> plantingBalances;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Temporal(TemporalType.DATE)
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "respondent_id")
    public Respondent getRespondent() {
        return respondent;
    }

    public void setRespondent(Respondent respondent) {
        this.respondent = respondent;
    }

    @OneToMany(
            fetch = FetchType.EAGER,
            cascade = CascadeType.ALL,
            targetEntity = Product.class
    )
    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @OneToMany(
            fetch = FetchType.EAGER,
            cascade = CascadeType.ALL,
            targetEntity = CostPriceStructure.class
    )
    public List<CostPriceStructure> getCostPriceStructures() {
        return costPriceStructures;
    }

    public void setCostPriceStructures(List<CostPriceStructure> costPriceStructures) {
        this.costPriceStructures = costPriceStructures;
    }

    @OneToMany(
            fetch = FetchType.EAGER,
            cascade = CascadeType.ALL,
            targetEntity = Purchase.class
    )
    public List<Purchase> getPurchases() {
        return purchases;
    }

    public void setPurchases(List<Purchase> purchases) {
        this.purchases = purchases;
    }

    @OneToMany(
            fetch = FetchType.EAGER,
            cascade = CascadeType.ALL,
            targetEntity = PlantingBalance.class
    )
    public List<PlantingBalance> getPlantingBalances() {
        return plantingBalances;
    }

    public void setPlantingBalances(List<PlantingBalance> plantingBalances) {
        this.plantingBalances = plantingBalances;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Report report = (Report) o;

        if (id != report.id) return false;
        if (date != null ? !date.equals(report.date) : report.date != null) return false;
        if (respondent != null ? !respondent.equals(report.respondent) : report.respondent != null) return false;
        if (products != null ? !products.equals(report.products) : report.products != null) return false;
        if (costPriceStructures != null ? !costPriceStructures.equals(report.costPriceStructures) : report.costPriceStructures != null)
            return false;
        if (purchases != null ? !purchases.equals(report.purchases) : report.purchases != null) return false;
        return plantingBalances != null ? plantingBalances.equals(report.plantingBalances) : report.plantingBalances == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (respondent != null ? respondent.hashCode() : 0);
        result = 31 * result + (products != null ? products.hashCode() : 0);
        result = 31 * result + (costPriceStructures != null ? costPriceStructures.hashCode() : 0);
        result = 31 * result + (purchases != null ? purchases.hashCode() : 0);
        result = 31 * result + (plantingBalances != null ? plantingBalances.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Report{" +
                "id=" + id +
                ", date=" + date +
                ", respondent=" + respondent +
                ", products=" + products +
                ", costPriceStructures=" + costPriceStructures +
                ", purchases=" + purchases +
                ", plantingBalances=" + plantingBalances +
                '}';
    }
}
