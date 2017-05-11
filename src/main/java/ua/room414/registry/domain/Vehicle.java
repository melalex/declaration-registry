package ua.room414.registry.domain;

import java.util.Date;

/**
 * @author Alexander Melashchenko
 * @version 1.0 11 May 2017
 */
public class Vehicle {
    private long id;

    private String brand;
    private String model;
    private String costDate;
    private VehicleType vehicleType;
    private Date owningDate;

    public enum VehicleType {
        CAR,
        FREIGHT_CAR,
        HELICOPTER,
        PLANE
    }
}
