package ua.room414.registry.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author Alexander Melashchenko
 * @version 1.0 11 May 2017
 */
@Entity
@Table(name = "realty")
@SecondaryTables({
        @SecondaryTable(name = "city", pkJoinColumns = @PrimaryKeyJoinColumn(name = "city_id")),
        @SecondaryTable(name = "region", pkJoinColumns = @PrimaryKeyJoinColumn(name = "region_id")),
        @SecondaryTable(name = "country", pkJoinColumns = @PrimaryKeyJoinColumn(name = "country_id")),
})
public class Realty implements Serializable {
    private static final long serialVersionUID = 3181749959908929863L;

    private long id;

    private long cityId;

    private String country;
    private String region;
    private String city;
    private String district;
    private String street;
    private String streetNumber;
    private String apartmentNumber;

    private String totalArea;
    private RealtyType realtyType;
    private Date owningDate;

    private String costAssessment;

    private enum RealtyType {
        APARTMENT,
        HOUSE,
        LAND_PLOT,
        PREMISE,
        BUILDING
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "city_id")
    public long getCityId() {
        return cityId;
    }

    public void setCityId(long cityId) {
        this.cityId = cityId;
    }

    @Column(table = "country", name = "name")
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Column(table = "region", name = "name")
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Column(table = "city", name = "name")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
    @Column(name = "street_number")
    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    @Column(name = "apartment_number")
    public String getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(String apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    @Column(name = "total_area")
    public String getTotalArea() {
        return totalArea;
    }

    public void setTotalArea(String totalArea) {
        this.totalArea = totalArea;
    }

    @Enumerated
    @Column(name = "realty_type")
    public RealtyType getRealtyType() {
        return realtyType;
    }

    public void setRealtyType(RealtyType realtyType) {
        this.realtyType = realtyType;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "owning_date")
    public Date getOwningDate() {
        return owningDate;
    }

    public void setOwningDate(Date owningDate) {
        this.owningDate = owningDate;
    }

    @Column(name = "cost_assessment")
    public String getCostAssessment() {
        return costAssessment;
    }

    public void setCostAssessment(String costAssessment) {
        this.costAssessment = costAssessment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Realty realty = (Realty) o;

        if (id != realty.id) return false;
        if (cityId != realty.cityId) return false;
        if (district != null ? !district.equals(realty.district) : realty.district != null) return false;
        if (street != null ? !street.equals(realty.street) : realty.street != null) return false;
        if (streetNumber != null ? !streetNumber.equals(realty.streetNumber) : realty.streetNumber != null)
            return false;
        if (apartmentNumber != null ? !apartmentNumber.equals(realty.apartmentNumber) : realty.apartmentNumber != null)
            return false;
        if (totalArea != null ? !totalArea.equals(realty.totalArea) : realty.totalArea != null) return false;
        if (realtyType != realty.realtyType) return false;
        if (owningDate != null ? !owningDate.equals(realty.owningDate) : realty.owningDate != null) return false;
        return costAssessment != null ? costAssessment.equals(realty.costAssessment) : realty.costAssessment == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (int) (cityId ^ (cityId >>> 32));
        result = 31 * result + (district != null ? district.hashCode() : 0);
        result = 31 * result + (street != null ? street.hashCode() : 0);
        result = 31 * result + (streetNumber != null ? streetNumber.hashCode() : 0);
        result = 31 * result + (apartmentNumber != null ? apartmentNumber.hashCode() : 0);
        result = 31 * result + (totalArea != null ? totalArea.hashCode() : 0);
        result = 31 * result + (realtyType != null ? realtyType.hashCode() : 0);
        result = 31 * result + (owningDate != null ? owningDate.hashCode() : 0);
        result = 31 * result + (costAssessment != null ? costAssessment.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Realty{" +
                "id=" + id +
                ", cityId=" + cityId +
                ", country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", district='" + district + '\'' +
                ", street='" + street + '\'' +
                ", streetNumber='" + streetNumber + '\'' +
                ", apartmentNumber='" + apartmentNumber + '\'' +
                ", totalArea='" + totalArea + '\'' +
                ", realtyType=" + realtyType +
                ", owningDate=" + owningDate +
                ", costAssessment='" + costAssessment + '\'' +
                '}';
    }
}
