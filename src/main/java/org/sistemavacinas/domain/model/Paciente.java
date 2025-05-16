package org.sistemavacinas.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;


import java.time.LocalDate;
import java.util.UUID;

@Entity
@Data
@RequiredArgsConstructor
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String nome;
    private String cpf;
    private LocalDate dataNascimento;
    private UUID responsavelId; // ID do responsável
    private String contato;
    private LocalDate dataUltimaVisita;

}
