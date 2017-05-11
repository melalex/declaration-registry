package ua.room414.registry.domain;

import java.util.Date;

/**
 * @author Alexander Melashchenko
 * @version 1.0 11 May 2017
 */
public class Realty {
    private long id;

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
}
