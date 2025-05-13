package org.sistemavacinas.application.dto;

import lombok.Data;

import java.util.UUID;

@Data
public class AgenteDto {
    private UUID id;
    private String nome;
    private String telefone;
}
