package org.infrastructure.messaging;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Component
public class WhatsappGatewayImpl implements WhatsappGateway {

    @Value("${zapi.url}")
    private String zapiUrl;

    @Value("${zapi.token}")
    private String zapiToken;

    private final RestTemplate restTemplate = new RestTemplate();

    @Override
    public void enviarMensagem(String telefone, String mensagem) {
        String url = zapiUrl + "/instances/YOUR_INSTANCE_TOKEN/token/" + zapiToken + "/send-message";

        Map<String, String> payload = new HashMap<>();
        payload.put("phone", telefone);
        payload.put("message", mensagem);

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<Map<String, String>> request = new HttpEntity<>(payload, headers);

        try {
            restTemplate.postForEntity(url, request, String.class);
        } catch (Exception e) {
            System.err.println("Erro ao enviar mensagem via WhatsApp: " + e.getMessage());
        }
    }
}
