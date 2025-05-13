package org.sistemavacinas.infrastructure.repository;

import org.sistemavacinas.domain.model.Agente;
import org.sistemavacinas.domain.repository.AgenteRepository;
import org.sistemavacinas.infrastructure.repository.jpa.SpringDataJpaAgenteRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class AgenteRepositoryImpl implements AgenteRepository {

    private final SpringDataJpaAgenteRepository jpaRepository;

    public AgenteRepositoryImpl(SpringDataJpaAgenteRepository jpaRepository) {
        this.jpaRepository = jpaRepository;
    }

    @Override
    public Agente salvar(Agente agente) {
        return jpaRepository.save(agente);
    }

    @Override
    public Optional<Agente> buscarPorId(String id) {
        return jpaRepository.findById(id);
    }

    @Override
    public List<Agente> listar() {
        return jpaRepository.findAll();
    }
}
