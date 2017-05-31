package ua.room414.registry.repository;

import org.springframework.data.repository.CrudRepository;
import ua.room414.registry.domain.Report;

/**
 * @author Alexander Melashchenko
 * @version 1.0 30 May 2017
 */
public interface ReportRepository extends CrudRepository<Report, Long> {
}
