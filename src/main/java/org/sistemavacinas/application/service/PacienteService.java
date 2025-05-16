package org.sistemavacinas.application.service;

import lombok.RequiredArgsConstructor;
import org.sistemavacinas.domain.model.Paciente;
import org.sistemavacinas.domain.repository.PacienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PacienteService {
    private final PacienteRepository pacienteRepository;

    public Paciente cadastrarPaciente(Paciente paciente) {
        return pacienteRepository.salvar(paciente);
    }

    public Optional<Paciente> buscarPorId(String id) {
        return pacienteRepository.buscarPorId(id);
    }

    public List<Paciente> listarTodos() {
        return pacienteRepository.listar();
    }

    public void deletarPaciente(String id) {
        pacienteRepository.deletar(id);
    }
}
