package ru.sanctio.datastoremicro.service;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import ru.sanctio.datastoremicro.model.MeasurementType;
import ru.sanctio.datastoremicro.model.Summary;
import ru.sanctio.datastoremicro.model.SummaryType;

import java.util.Set;

public interface SummaryService {

    Summary get(long sensorId,
                Set<MeasurementType> measurementTypes,
                Set<SummaryType> summaryTypes);

}
