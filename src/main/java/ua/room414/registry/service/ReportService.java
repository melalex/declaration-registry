package ua.room414.registry.service;

import ua.room414.registry.domain.Report;

import java.util.List;

/**
 * @author Alexander Melashchenko
 * @version 1.0 30 May 2017
 */
public interface ReportService {
    void create(final Report report);
    Report find(final long id);
    List<Report> findAll();
    void update(final Report report);
    void delete(final long id);
}
