package org.domain.model;

import jakarta.persistence.Entity;
import lombok.*;
import org.springframework.data.annotation.Id;

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
