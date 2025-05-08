package org.application.service;

import lombok.RequiredArgsConstructor;
import org.domain.model.Agente;
import org.domain.repository.AgenteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class  AgenteService {
    private final AgenteRepository agenteRepository;

    public Agente cadastrarAgente(Agente agente) {
        return agenteRepository.salvar(agente);
    }

    public Optional<Agente> buscarPorId(String id) {
        return agenteRepository.buscarPorId(id);
    }

    public List<Agente> listarTodos() {
        return agenteRepository.listar();
    }
}
