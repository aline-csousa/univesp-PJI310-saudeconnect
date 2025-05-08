package org.application.mapper;

import org.application.dto.AgenteDto;
import org.domain.model.Agente;
import org.mapstruct.Mapper;

@Mapper
public interface AgenteMapper {

    Agente toEntity(AgenteDto agenteDto);
}
