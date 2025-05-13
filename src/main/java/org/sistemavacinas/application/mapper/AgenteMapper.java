package org.sistemavacinas.application.mapper;

import org.sistemavacinas.application.dto.AgenteDto;
import org.sistemavacinas.domain.model.Agente;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
public interface AgenteMapper {

    Agente toEntity(AgenteDto agenteDto);
}
