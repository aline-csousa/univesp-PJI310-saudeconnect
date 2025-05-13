package org.sistemavacinas.infrastructure.repository.jpa;

import org.sistemavacinas.domain.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataJpaPacienteRepository extends JpaRepository<Paciente, String> {
}
