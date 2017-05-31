package ua.room414.registry.web.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import ua.room414.registry.facade.ReportFacade;

/**
 * @author Alexander Melashchenko
 * @version 1.0 30 May 2017
 */
@Controller
public class ReportController {
    private ReportFacade reportFacade;

    @Autowired
    public ReportController(ReportFacade reportFacade) {
        this.reportFacade = reportFacade;
    }
}
