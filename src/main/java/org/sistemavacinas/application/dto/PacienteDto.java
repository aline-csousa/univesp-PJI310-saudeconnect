package org.sistemavacinas.application.dto;

import lombok.Data;

import java.time.LocalDate;
import java.util.UUID;

@Data
public class PacienteDto {
    private UUID id;
    private String nome;
    private String cpf;
    private LocalDate dataNascimento;
    private UUID responsavelId; // ID do responsável
    private String contato;
    private LocalDate dataUltimaVisita;
}
