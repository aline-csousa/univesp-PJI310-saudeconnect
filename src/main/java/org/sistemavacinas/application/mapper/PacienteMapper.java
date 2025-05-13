package org.sistemavacinas.application.mapper;

import org.sistemavacinas.application.dto.PacienteDto;
import org.sistemavacinas.domain.model.Paciente;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PacienteMapper {
    Paciente toEntity(PacienteDto pacienteDto);
}
