package org.sistemavacinas.infrastructure.repository.jpa;

import org.sistemavacinas.domain.model.Agente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataJpaAgenteRepository extends JpaRepository<Agente, String> {
}
