package org.sistemavacinas.application.controller;

import lombok.RequiredArgsConstructor;
import org.sistemavacinas.application.service.NotificacaoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/visitas")
public class VisitasController {

    private final NotificacaoService notificacaoService;

    @PostMapping("/notificar")
    public ResponseEntity<Void> notificarVisitasPendentes() {
        try {
            notificacaoService.notificarVisitasPendentes();
            return ResponseEntity.ok().build();
        } catch (RuntimeException e) {
            System.out.println("Houve um erro ao enviar sua notificacao");
            throw new RuntimeException(e.getMessage(), e.getCause());
        }
    }
}
