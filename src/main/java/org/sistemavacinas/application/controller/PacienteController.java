package org.sistemavacinas.application.controller;

import lombok.RequiredArgsConstructor;
import org.sistemavacinas.application.dto.PacienteDto;
import org.sistemavacinas.application.mapper.PacienteMapper;
import org.sistemavacinas.application.service.PacienteService;
import org.sistemavacinas.domain.model.Paciente;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/pessoas")
public class PacienteController {

    private final PacienteService cadastroPacienteService;
    private final PacienteMapper pacienteMapper;

    @PostMapping
    public ResponseEntity<Void> cadastrar(@RequestBody PacienteDto paciente) {
        cadastroPacienteService.cadastrarPaciente(pacienteMapper.toEntity(paciente));
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping
    public ResponseEntity<List<Paciente>> listar() {
        return ResponseEntity.ok(cadastroPacienteService.listarTodos());
    }
}
