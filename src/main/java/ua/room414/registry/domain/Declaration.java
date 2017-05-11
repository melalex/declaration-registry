package ua.room414.registry.domain;

import java.util.Date;
import java.util.List;

/**
 * @author Alexander Melashchenko
 * @version 1.0 11 May 2017
 */
public class Declaration {
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
}