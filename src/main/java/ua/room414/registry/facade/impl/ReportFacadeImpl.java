package ua.room414.registry.facade.impl;

import org.springframework.beans.factory.annotation.Autowired;
import ua.room414.registry.anotation.Facade;
import ua.room414.registry.facade.ReportFacade;
import ua.room414.registry.facade.dto.ReportDto;
import ua.room414.registry.service.ReportService;

import java.util.List;

/**
 * @author Alexander Melashchenko
 * @version 1.0 31 May 2017
 */
@Facade("defaultReportFacade")
public class ReportFacadeImpl implements ReportFacade {
    private ReportService reportService;

    @Autowired
    public ReportFacadeImpl(ReportService reportService) {
        this.reportService = reportService;
    }

    @Override
    public void create(final ReportDto report) {

    }

    @Override
    public ReportDto find(final long id) {
        return null;
    }

    @Override
    public List<ReportDto> findAll() {
        return null;
    }

    @Override
    public void update(final ReportDto report) {

    }

    @Override
    public void delete(final long id) {

    }
}
