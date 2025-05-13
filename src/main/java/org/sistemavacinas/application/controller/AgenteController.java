package org.sistemavacinas.application.controller;

import lombok.RequiredArgsConstructor;
import org.sistemavacinas.application.dto.AgenteDto;
import org.sistemavacinas.application.mapper.AgenteMapper;
import org.sistemavacinas.application.service.AgenteService;
import org.sistemavacinas.domain.model.Agente;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/agentes")
public class AgenteController {

    private final AgenteService agenteService;
    private final AgenteMapper agenteMapper;

    @PostMapping
    public ResponseEntity<Void> cadastrar(@RequestBody AgenteDto agenteDto) {
        agenteService.cadastrarAgente(agenteMapper.toEntity(agenteDto));
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping
    public ResponseEntity<List<Agente>> listar() {
        return ResponseEntity.ok(agenteService.listarTodos());
    }
}
