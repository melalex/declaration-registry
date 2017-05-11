package ua.room414.registry.domain;

/**
 * @author Alexander Melashchenko
 * @version 1.0 11 May 2017
 */
public class Income {
    private long id;

    private IncomeType incomeType;
    private String sizeIncome;
    private String incomeSource;

    public enum IncomeType {
        MAIN_SALARY,
        SECONDARY_SALARY,
        GIFT,
        PENSION,
        INTEREST,
        BUSINESS_ACTIVITY,
    }
}