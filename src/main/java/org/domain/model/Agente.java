package org.domain.model;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;

@RequiredArgsConstructor
@Data
@Entity
public class Agente {
    @Id
    private String id;
    private String nome;
    private String telefone;
}