package org.sistemavacinas.infrastructure.messaging;

public interface WhatsappGateway {
    void enviarMensagem(String telefone, String mensagem);
}
