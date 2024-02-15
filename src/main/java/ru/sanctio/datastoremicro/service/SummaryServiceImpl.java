package ru.sanctio.datastoremicro.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.sanctio.datastoremicro.model.MeasurementType;
import ru.sanctio.datastoremicro.model.Summary;
import ru.sanctio.datastoremicro.model.SummaryType;
import ru.sanctio.datastoremicro.model.exception.SensorNotFoundException;
import ru.sanctio.datastoremicro.repository.SummaryRepository;

import java.util.Set;

@Service
@RequiredArgsConstructor
public class SummaryServiceImpl implements SummaryService {

    private final SummaryRepository summaryRepository;

    @Override
    public Summary get(long sensorId, Set<MeasurementType> measurementTypes, Set<SummaryType> summaryTypes) {
        return summaryRepository.findBySensorId(sensorId,
                        measurementTypes == null ? Set.of(MeasurementType.values()) : measurementTypes,
                        summaryTypes == null ? Set.of(SummaryType.values()) : summaryTypes)
                .orElseThrow(SensorNotFoundException::new);
    }
}
