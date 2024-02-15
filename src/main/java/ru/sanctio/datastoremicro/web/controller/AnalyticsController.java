package ru.sanctio.datastoremicro.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.sanctio.datastoremicro.model.MeasurementType;
import ru.sanctio.datastoremicro.model.Summary;
import ru.sanctio.datastoremicro.model.SummaryType;
import ru.sanctio.datastoremicro.service.SummaryService;
import ru.sanctio.datastoremicro.web.dto.SummaryDto;
import ru.sanctio.datastoremicro.web.mapper.SummaryMapper;

import java.util.Set;

@RestController
@RequestMapping("/api/v1/analytics")
@RequiredArgsConstructor
public class AnalyticsController {

    private final SummaryService summaryService;
    private final SummaryMapper summaryMapper;

    @GetMapping("/summary/{sensorId}")
    public SummaryDto getSummary(@PathVariable long sensorId,
                                 @RequestParam(value = "mt", required = false)
                                 Set<MeasurementType> measurementTypes,
                                 @RequestParam(value = "st", required = false)
                                 Set<SummaryType> summaryTypes) {
        Summary summary = summaryService.get(sensorId, measurementTypes, summaryTypes);
        return summaryMapper.toDto(summary);
    }

}
