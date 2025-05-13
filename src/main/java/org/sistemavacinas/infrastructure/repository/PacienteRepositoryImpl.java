package org.sistemavacinas.infrastructure.repository;

import org.sistemavacinas.domain.model.Paciente;
import org.sistemavacinas.domain.repository.PacienteRepository;
import org.sistemavacinas.infrastructure.repository.jpa.SpringDataJpaAgenteRepository;
import org.sistemavacinas.infrastructure.repository.jpa.SpringDataJpaPacienteRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class PacienteRepositoryImpl implements PacienteRepository  {

    private final SpringDataJpaPacienteRepository jpaRepository;

    public PacienteRepositoryImpl(SpringDataJpaPacienteRepository jpaRepository) {
        this.jpaRepository = jpaRepository;
    }

    @Override
    public Paciente salvar(Paciente paciente) {
        return jpaRepository.save(paciente);
    }

    @Override
    public Optional<Paciente> buscarPorId(String id) {
        return jpaRepository.findById(id);
    }

    @Override
    public List<Paciente> listarTodos() {
        return jpaRepository.findAll();
    }

    @Override
    public void deletar(String id) {
    }
}
