package ua.room414.registry.facade;

import ua.room414.registry.facade.dto.ReportDto;

import java.util.List;

/**
 * @author Alexander Melashchenko
 * @version 1.0 30 May 2017
 */
public interface ReportFacade {
    void create(final ReportDto report);
    ReportDto find(final long id);
    List<ReportDto> findAll();
    void update(final ReportDto report);
    void delete(final long id);
}
