package ua.room414.registry.domain;

import java.util.Date;

/**
 * @author Alexander Melashchenko
 * @version 1.0 11 May 2017
 */
public class Person {
    private long id;

    private String country;
    private String region;
    private String city;
    private String district;
    private String street;
    private String streetNumber;

    private String firstname;
    private String middlename;
    private String lastname;

    private Date birthday;

    private String workPost;
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
}
