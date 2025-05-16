package org.sistemavacinas.domain.repository;

import org.sistemavacinas.domain.model.Paciente;

import java.util.List;
import java.util.Optional;

public interface PacienteRepository {

    Paciente salvar(Paciente paciente);

    Optional<Paciente> buscarPorId(String id);

    List<Paciente> listar();

    void deletar(String id);
}
