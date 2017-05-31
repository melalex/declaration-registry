package ua.room414.registry.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @author Alexander Melashchenko
 * @version 1.0 30 May 2017
 */
@Entity
public class Respondent implements Serializable {
    private static final long serialVersionUID = -3309271753970812745L;

    private long id;
    private String name;
    private String legalAddress;
    private String actualAddress;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLegalAddress() {
        return legalAddress;
    }

    public void setLegalAddress(String legalAddress) {
        this.legalAddress = legalAddress;
    }

    public String getActualAddress() {
        return actualAddress;
    }

    public void setActualAddress(String actualAddress) {
        this.actualAddress = actualAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Respondent that = (Respondent) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (legalAddress != null ? !legalAddress.equals(that.legalAddress) : that.legalAddress != null) return false;
        return actualAddress != null ? actualAddress.equals(that.actualAddress) : that.actualAddress == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (legalAddress != null ? legalAddress.hashCode() : 0);
        result = 31 * result + (actualAddress != null ? actualAddress.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Respondent{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", legalAddress='" + legalAddress + '\'' +
                ", actualAddress='" + actualAddress + '\'' +
                '}';
    }
}
