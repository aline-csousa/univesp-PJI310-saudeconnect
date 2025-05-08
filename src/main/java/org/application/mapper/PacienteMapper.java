package org.application.mapper;

import org.application.dto.PacienteDto;
import org.domain.model.Paciente;
import org.mapstruct.Mapper;

@Mapper
public interface PacienteMapper {
    Paciente toEntity(PacienteDto pacienteDto);
}
