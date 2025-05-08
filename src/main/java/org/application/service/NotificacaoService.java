package org.application.service;

import org.domain.model.Paciente;
import lombok.RequiredArgsConstructor;
import org.infrastructure.messaging.WhatsappGateway;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@Service
@RequiredArgsConstructor
public class NotificacaoService {
    private final AgenteService agenteService;
    private final PacienteService pacienteService;
    private final WhatsappGateway whatsappGateway;

    @Scheduled(cron = "0 0 8 * * ?") // Roda todos os dias às 8h da manhã
    public void notificarVisitasPendentes() {
        LocalDate hoje = LocalDate.now();

        for (Paciente paciente : pacienteService.listarTodos()) {
            if (paciente.getDataUltimaVisita() != null) {
                long meses = ChronoUnit.MONTHS.between(paciente.getDataUltimaVisita(), hoje);
                if (meses >= 6) {
                    agenteService.listarTodos().stream()
                            .filter(a -> a.getId().equals(paciente.getResponsavelId()))
                            .findFirst()
                            .ifPresent(agente -> {
                                String mensagem = "Lembrete: Visitar paciente " + paciente.getNome() + ". Última visita há " + meses + " meses.";
                                whatsappGateway.enviarMensagem(agente.getTelefone(), mensagem);
                            });
                }
            }
        }
    }
}

