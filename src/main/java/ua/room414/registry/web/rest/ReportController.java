package ua.room414.registry.web.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import ua.room414.registry.domain.Report;
import ua.room414.registry.facade.ReportFacade;
import ua.room414.registry.facade.dto.ReportDto;
import ua.room414.registry.service.ReportService;

import java.util.List;

/**
 * @author Alexander Melashchenko
 * @version 1.0 30 May 2017
 */
@RestController
@RequestMapping(value = "/v1/reports", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
public class ReportController {
    private ReportFacade reportFacade;

    @Autowired
    public ReportController(ReportFacade reportFacade) {
        this.reportFacade = reportFacade;
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody final ReportDto report) {
        reportFacade.create(report);
    }

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ReportDto find(@PathVariable("id") final long id) {
        return reportFacade.find(id);
    }

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(method = RequestMethod.GET)
    public List<ReportDto> findAll() {
        return reportFacade.findAll();
    }

    @ResponseStatus(HttpStatus.ACCEPTED)
    @RequestMapping(method = RequestMethod.PUT)
    public void update(final ReportDto report) {
        reportFacade.update(report);
    }

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void remove(@PathVariable("id") final long id) {
        reportFacade.delete(id);
    }
}
