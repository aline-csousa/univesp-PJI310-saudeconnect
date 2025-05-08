package org.domain.repository;

import org.domain.model.Paciente;

import java.util.List;
import java.util.Optional;

public interface PacienteRepository {

    Paciente salvar(Paciente paciente);

    Optional<Paciente> buscarPorId(String id);

    List<Paciente> listarTodos();

    void deletar(String id);
}
