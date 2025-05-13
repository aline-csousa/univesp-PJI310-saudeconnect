package org.sistemavacinas.application.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class PacienteDto {
    private String id;
    private String nome;
    private String cpf;
    private LocalDate dataNascimento;
    private String responsavelId; // ID do responsável
    private String contato;
    private LocalDate dataUltimaVisita;

}
