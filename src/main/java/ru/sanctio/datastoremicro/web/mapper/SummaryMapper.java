package ru.sanctio.datastoremicro.web.mapper;

import org.mapstruct.Mapper;
import ru.sanctio.datastoremicro.model.Summary;
import ru.sanctio.datastoremicro.web.dto.SummaryDto;

@Mapper(componentModel = "spring")
public interface SummaryMapper extends Mappable<Summary, SummaryDto> {
}
