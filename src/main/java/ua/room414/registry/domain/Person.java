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
        @SecondaryTable(name = "city", pkJoinColumns = @PrimaryKeyJoinColumn(name = "id", referencedColumnName = "city_id")),
        @SecondaryTable(name = "region", pkJoinColumns = @PrimaryKeyJoinColumn(name = "id", referencedColumnName = "region_id")),
        @SecondaryTable(name = "country", pkJoinColumns = @PrimaryKeyJoinColumn(name = "id", referencedColumnName = "country_id")),
})
public class Person implements Serializable {
    private static final long serialVersionUID = -2331529055008543054L;

    private long id;

    @Embedded
    // TODO: config this
    private Address address;

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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
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
        if (address != null ? !address.equals(person.address) : person.address != null) return false;
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
        result = 31 * result + (address != null ? address.hashCode() : 0);
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
                ", address=" + address +
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
