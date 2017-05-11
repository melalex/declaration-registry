package ua.room414.registry.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author Alexander Melashchenko
 * @version 1.0 11 May 2017
 */
@Entity
@Table(name = "vehicle")
public class Vehicle implements Serializable {
    private static final long serialVersionUID = -6567377402828996026L;

    private long id;

    private String brand;
    private String model;
    private Date purchaseDate;
    private Date manufactureDate;
    private VehicleType vehicleType;
    private Date owningDate;

    public enum VehicleType {
        CAR,
        FREIGHT_CAR,
        HELICOPTER,
        PLANE
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "purchase_date")
    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "manufacture_date")
    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Enumerated
    @Column(name = "vehicle_type")
    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public Date getOwningDate() {
        return owningDate;
    }

    public void setOwningDate(Date owningDate) {
        this.owningDate = owningDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vehicle vehicle = (Vehicle) o;

        if (id != vehicle.id) return false;
        if (brand != null ? !brand.equals(vehicle.brand) : vehicle.brand != null) return false;
        if (model != null ? !model.equals(vehicle.model) : vehicle.model != null) return false;
        if (purchaseDate != null ? !purchaseDate.equals(vehicle.purchaseDate) : vehicle.purchaseDate != null)
            return false;
        if (manufactureDate != null ? !manufactureDate.equals(vehicle.manufactureDate) : vehicle.manufactureDate != null)
            return false;
        if (vehicleType != vehicle.vehicleType) return false;
        return owningDate != null ? owningDate.equals(vehicle.owningDate) : vehicle.owningDate == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (brand != null ? brand.hashCode() : 0);
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + (purchaseDate != null ? purchaseDate.hashCode() : 0);
        result = 31 * result + (manufactureDate != null ? manufactureDate.hashCode() : 0);
        result = 31 * result + (vehicleType != null ? vehicleType.hashCode() : 0);
        result = 31 * result + (owningDate != null ? owningDate.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", purchaseDate=" + purchaseDate +
                ", manufactureDate=" + manufactureDate +
                ", vehicleType=" + vehicleType +
                ", owningDate=" + owningDate +
                '}';
    }
}
