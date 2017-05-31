package ua.room414.registry.service.impl;

import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.room414.registry.domain.Report;
import ua.room414.registry.repository.ReportRepository;
import ua.room414.registry.service.ReportService;

import java.util.List;

/**
 * @author Alexander Melashchenko
 * @version 1.0 30 May 2017
 */
@Service("defaultReportService")
@Transactional
public class ReportServiceImpl implements ReportService {
    private ReportRepository reportRepository;

    @Autowired
    public ReportServiceImpl(ReportRepository reportRepository) {
        this.reportRepository = reportRepository;
    }

    @Override
    public void create(final Report report) {
        reportRepository.save(report);
    }

    @Override
    @Transactional(readOnly = true)
    public Report find(final long id) {
        return reportRepository.findOne(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Report> findAll() {
        return Lists.newLinkedList(reportRepository.findAll());
    }

    @Override
    public void update(final Report report) {
        reportRepository.save(report);
    }

    @Override
    public void delete(final long id) {
        reportRepository.delete(id);
    }
}
