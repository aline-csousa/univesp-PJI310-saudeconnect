package org.sistemavacinas.domain.repository;

import org.sistemavacinas.domain.model.Agente;

import java.util.List;
import java.util.Optional;

public interface AgenteRepository {

    Agente salvar(Agente agente);

    Optional<Agente> buscarPorId(String id);

    List<Agente> listar();
}
