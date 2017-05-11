package ua.room414.registry.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author Alexander Melashchenko
 * @version 1.0 11 May 2017
 */
@Entity
@Table(name = "declaration")
public class Declaration implements Serializable {
    private static final long serialVersionUID = 984271896772437026L;

    private long id;
    private DocumentType documentType;
    private DeclarationType declarationType;
    private Date declarationDate;

    private Person person;

    private List<Person> relatives;
    private List<Realty> realty;
    private List<Vehicle> vehicle;
    private List<Income> incomes;

    public enum DeclarationType {
        ANNUAL,
        BEFORE_DISMISSAL,
        AFTER_DISMISSAL,
        CANDIDATE_FOR_THE_POSITION
    }

    public enum DocumentType {
        DECLARATION,
        MATERIAL_CHANGES,
        RECTIFIED_DECLARATION,
        RECTIFIED_MATERIAL_CHANGES
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Enumerated
    @Column(name = "document_type")
    public DocumentType getDocumentType() {
        return documentType;
    }

    public void setDocumentType(DocumentType documentType) {
        this.documentType = documentType;
    }

    @Enumerated
    @Column(name = "declaration_type")
    public DeclarationType getDeclarationType() {
        return declarationType;
    }

    public void setDeclarationType(DeclarationType declarationType) {
        this.declarationType = declarationType;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "declaration_date")
    public Date getDeclarationDate() {
        return declarationDate;
    }

    public void setDeclarationDate(Date declarationDate) {
        this.declarationDate = declarationDate;
    }

    public Person getPerson() {
        return person;
    }

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "person_id")
    public void setPerson(Person person) {
        this.person = person;
    }

    public List<Person> getRelatives() {
        return relatives;
    }

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "declaration_relative",
            joinColumns = @JoinColumn(name = "declaration_id"),
            inverseJoinColumns = @JoinColumn(name = "relative_id")
    )
    public void setRelatives(List<Person> relatives) {
        this.relatives = relatives;
    }

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "declaration_realty",
            joinColumns = @JoinColumn(name = "declaration_id"),
            inverseJoinColumns = @JoinColumn(name = "realty_id")
    )
    public List<Realty> getRealty() {
        return realty;
    }

    public void setRealty(List<Realty> realty) {
        this.realty = realty;
    }

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "declaration_vehicle",
            joinColumns = @JoinColumn(name = "declaration_id"),
            inverseJoinColumns = @JoinColumn(name = "vehicle_id")
    )
    public List<Vehicle> getVehicle() {
        return vehicle;
    }

    public void setVehicle(List<Vehicle> vehicle) {
        this.vehicle = vehicle;
    }

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "declaration_income",
            joinColumns = @JoinColumn(name = "declaration_id"),
            inverseJoinColumns = @JoinColumn(name = "income_id")
    )
    public List<Income> getIncomes() {
        return incomes;
    }

    public void setIncomes(List<Income> incomes) {
        this.incomes = incomes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Declaration that = (Declaration) o;

        if (id != that.id) return false;
        if (documentType != that.documentType) return false;
        if (declarationType != that.declarationType) return false;
        if (declarationDate != null ? !declarationDate.equals(that.declarationDate) : that.declarationDate != null)
            return false;
        if (person != null ? !person.equals(that.person) : that.person != null) return false;
        if (relatives != null ? !relatives.equals(that.relatives) : that.relatives != null) return false;
        if (realty != null ? !realty.equals(that.realty) : that.realty != null) return false;
        if (vehicle != null ? !vehicle.equals(that.vehicle) : that.vehicle != null) return false;
        return incomes != null ? incomes.equals(that.incomes) : that.incomes == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (documentType != null ? documentType.hashCode() : 0);
        result = 31 * result + (declarationType != null ? declarationType.hashCode() : 0);
        result = 31 * result + (declarationDate != null ? declarationDate.hashCode() : 0);
        result = 31 * result + (person != null ? person.hashCode() : 0);
        result = 31 * result + (relatives != null ? relatives.hashCode() : 0);
        result = 31 * result + (realty != null ? realty.hashCode() : 0);
        result = 31 * result + (vehicle != null ? vehicle.hashCode() : 0);
        result = 31 * result + (incomes != null ? incomes.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Declaration{" +
                "id=" + id +
                ", documentType=" + documentType +
                ", declarationType=" + declarationType +
                ", declarationDate=" + declarationDate +
                ", person=" + person +
                ", relatives=" + relatives +
                ", realty=" + realty +
                ", vehicle=" + vehicle +
                ", incomes=" + incomes +
                '}';
    }
}