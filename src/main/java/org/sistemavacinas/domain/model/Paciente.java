package org.sistemavacinas.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;


import java.time.LocalDate;
import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Paciente {
    @Id
    private UUID id;
    private String nome;
    private String cpf;
    private LocalDate dataNascimento;
    private String responsavelId; // ID do responsável
    private String contato;
    private LocalDate dataUltimaVisita;

}
