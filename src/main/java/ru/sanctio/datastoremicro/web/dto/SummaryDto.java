package ru.sanctio.datastoremicro.web.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import ru.sanctio.datastoremicro.model.MeasurementType;
import ru.sanctio.datastoremicro.model.Summary;

import java.util.List;
import java.util.Map;

@Getter
@Setter
@ToString
public class SummaryDto {

    private long sensorId;
    private Map<MeasurementType, List<Summary.SummaryEntry>> values;

}

