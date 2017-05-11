package ua.room414.registry.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author Alexander Melashchenko
 * @version 1.0 11 May 2017
 */
@Entity
@Table(name = "person")
@SecondaryTables({
        @SecondaryTable(name = "city", pkJoinColumns = @PrimaryKeyJoinColumn(name = "city_id")),
        @SecondaryTable(name = "region", pkJoinColumns = @PrimaryKeyJoinColumn(name = "region_id")),
        @SecondaryTable(name = "country", pkJoinColumns = @PrimaryKeyJoinColumn(name = "country_id")),
})
public class Person implements Serializable {
    private static final long serialVersionUID = -2331529055008543054L;

    private long id;

    private long cityId;

    private String country;
    private String region;
    private String city;
    private String district;
    private String street;
    private String streetNumber;
    private String apartmentNumber;

    private String firstName;
    private String middleName;
    private String lastName;

    private Date birthday;

    private String workPosition;
    private String workPlace;
    private WorkPositionType workPositionType;
    private WorkPositionCategory workPositionCategory;

    public enum WorkPositionType {
        CIVIL_SERVICE,
        LACAL_GOVERNMENT,
        PUBLIC_LAW
    }

    public enum WorkPositionCategory {
        FIRST_CATEGORY,
        SECOND_CATEGORY,
        THIRD_CATEGORY,
        FOURTH_CATEGORY,
        FIFTH_CATEGORY,
        SIXTH_CATEGORY,
        SEVENTH_CATEGORY,
        A,
        B,
        C
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

    @Column(name = "first_name")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(name = "middle_name")
    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    @Column(name = "last_name")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Temporal(TemporalType.DATE)
    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Column(name = "work_position")
    public String getWorkPosition() {
        return workPosition;
    }

    public void setWorkPosition(String workPosition) {
        this.workPosition = workPosition;
    }

    @Column(name = "work_place")
    public String getWorkPlace() {
        return workPlace;
    }

    public void setWorkPlace(String workPlace) {
        this.workPlace = workPlace;
    }

    @Enumerated
    @Column(name = "work_position_type")
    public WorkPositionType getWorkPositionType() {
        return workPositionType;
    }

    public void setWorkPositionType(WorkPositionType workPositionType) {
        this.workPositionType = workPositionType;
    }

    @Enumerated
    @Column(name = "work_position_category")
    public WorkPositionCategory getWorkPositionCategory() {
        return workPositionCategory;
    }

    public void setWorkPositionCategory(WorkPositionCategory workPositionCategory) {
        this.workPositionCategory = workPositionCategory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (id != person.id) return false;
        if (cityId != person.cityId) return false;
        if (country != null ? !country.equals(person.country) : person.country != null) return false;
        if (region != null ? !region.equals(person.region) : person.region != null) return false;
        if (city != null ? !city.equals(person.city) : person.city != null) return false;
        if (district != null ? !district.equals(person.district) : person.district != null) return false;
        if (street != null ? !street.equals(person.street) : person.street != null) return false;
        if (streetNumber != null ? !streetNumber.equals(person.streetNumber) : person.streetNumber != null)
            return false;
        if (apartmentNumber != null ? !apartmentNumber.equals(person.apartmentNumber) : person.apartmentNumber != null)
            return false;
        if (firstName != null ? !firstName.equals(person.firstName) : person.firstName != null) return false;
        if (middleName != null ? !middleName.equals(person.middleName) : person.middleName != null) return false;
        if (lastName != null ? !lastName.equals(person.lastName) : person.lastName != null) return false;
        if (birthday != null ? !birthday.equals(person.birthday) : person.birthday != null) return false;
        if (workPosition != null ? !workPosition.equals(person.workPosition) : person.workPosition != null)
            return false;
        if (workPlace != null ? !workPlace.equals(person.workPlace) : person.workPlace != null) return false;
        if (workPositionType != person.workPositionType) return false;
        return workPositionCategory == person.workPositionCategory;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (int) (cityId ^ (cityId >>> 32));
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + (region != null ? region.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (district != null ? district.hashCode() : 0);
        result = 31 * result + (street != null ? street.hashCode() : 0);
        result = 31 * result + (streetNumber != null ? streetNumber.hashCode() : 0);
        result = 31 * result + (apartmentNumber != null ? apartmentNumber.hashCode() : 0);
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (middleName != null ? middleName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (birthday != null ? birthday.hashCode() : 0);
        result = 31 * result + (workPosition != null ? workPosition.hashCode() : 0);
        result = 31 * result + (workPlace != null ? workPlace.hashCode() : 0);
        result = 31 * result + (workPositionType != null ? workPositionType.hashCode() : 0);
        result = 31 * result + (workPositionCategory != null ? workPositionCategory.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", cityId=" + cityId +
                ", country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", district='" + district + '\'' +
                ", street='" + street + '\'' +
                ", streetNumber='" + streetNumber + '\'' +
                ", apartmentNumber='" + apartmentNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthday=" + birthday +
                ", workPosition='" + workPosition + '\'' +
                ", workPlace='" + workPlace + '\'' +
                ", workPositionType=" + workPositionType +
                ", workPositionCategory=" + workPositionCategory +
                '}';
    }
}
