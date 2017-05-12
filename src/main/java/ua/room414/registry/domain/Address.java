package ua.room414.registry.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Alexander Melashchenko
 * @version 1.0 12 May 2017
 */
@Embeddable
public class Address implements Serializable {
    private static final long serialVersionUID = 5831342676196981281L;

    private long countryId;
    private long regionId;
    private long cityId;

    private String country;
    private String region;
    private String city;
    private String district;
    private String street;
    private String streetNumber;
    private String apartmentNumber;

    @Column(name = "country_id")
    public long getCountryId() {
        return countryId;
    }

    public void setCountryId(long countryId) {
        this.countryId = countryId;
    }

    @Column(name = "region_id")
    public long getRegionId() {
        return regionId;
    }

    public void setRegionId(long regionId) {
        this.regionId = regionId;
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

    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(String apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Address address = (Address) o;

        if (countryId != address.countryId) return false;
        if (regionId != address.regionId) return false;
        if (cityId != address.cityId) return false;
        if (district != null ? !district.equals(address.district) : address.district != null) return false;
        if (street != null ? !street.equals(address.street) : address.street != null) return false;
        if (streetNumber != null ? !streetNumber.equals(address.streetNumber) : address.streetNumber != null)
            return false;
        return apartmentNumber != null ? apartmentNumber.equals(address.apartmentNumber) : address.apartmentNumber == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (countryId ^ (countryId >>> 32));
        result = 31 * result + (int) (regionId ^ (regionId >>> 32));
        result = 31 * result + (int) (cityId ^ (cityId >>> 32));
        result = 31 * result + (district != null ? district.hashCode() : 0);
        result = 31 * result + (street != null ? street.hashCode() : 0);
        result = 31 * result + (streetNumber != null ? streetNumber.hashCode() : 0);
        result = 31 * result + (apartmentNumber != null ? apartmentNumber.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", district='" + district + '\'' +
                ", street='" + street + '\'' +
                ", streetNumber='" + streetNumber + '\'' +
                ", apartmentNumber='" + apartmentNumber + '\'' +
                '}';
    }
}
