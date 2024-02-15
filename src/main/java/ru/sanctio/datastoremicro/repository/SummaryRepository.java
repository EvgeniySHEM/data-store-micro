package ru.sanctio.datastoremicro.repository;

import ru.sanctio.datastoremicro.model.MeasurementType;
import ru.sanctio.datastoremicro.model.Summary;
import ru.sanctio.datastoremicro.model.SummaryType;

import java.util.Optional;
import java.util.Set;

public interface SummaryRepository {

    Optional<Summary> findBySensorId(long sensorId,
                                     Set<MeasurementType> measurementTypes,
                                     Set<SummaryType> summaryTypes);
}
