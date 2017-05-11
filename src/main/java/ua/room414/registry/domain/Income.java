package ua.room414.registry.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author Alexander Melashchenko
 * @version 1.0 11 May 2017
 */
@Entity
@Table(name = "income")
public class Income implements Serializable {
    private static final long serialVersionUID = -5769595079880088877L;

    private long id;

    private IncomeType incomeType;
    private String incomeSize;
    private String incomeSource;

    public enum IncomeType {
        MAIN_SALARY,
        SECONDARY_SALARY,
        GIFT,
        PENSION,
        INTEREST,
        BUSINESS_ACTIVITY,
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "income_type")
    public IncomeType getIncomeType() {
        return incomeType;
    }

    public void setIncomeType(IncomeType incomeType) {
        this.incomeType = incomeType;
    }

    @Column(name = "income_size")
    public String getIncomeSize() {
        return incomeSize;
    }

    public void setIncomeSize(String incomeSize) {
        this.incomeSize = incomeSize;
    }

    @Column(name = "income_source")
    public String getIncomeSource() {
        return incomeSource;
    }

    public void setIncomeSource(String incomeSource) {
        this.incomeSource = incomeSource;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Income income = (Income) o;

        if (id != income.id) return false;
        if (incomeType != income.incomeType) return false;
        if (incomeSize != null ? !incomeSize.equals(income.incomeSize) : income.incomeSize != null) return false;
        return incomeSource != null ? incomeSource.equals(income.incomeSource) : income.incomeSource == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (incomeType != null ? incomeType.hashCode() : 0);
        result = 31 * result + (incomeSize != null ? incomeSize.hashCode() : 0);
        result = 31 * result + (incomeSource != null ? incomeSource.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Income{" +
                "id=" + id +
                ", incomeType=" + incomeType +
                ", incomeSize='" + incomeSize + '\'' +
                ", incomeSource='" + incomeSource + '\'' +
                '}';
    }
}