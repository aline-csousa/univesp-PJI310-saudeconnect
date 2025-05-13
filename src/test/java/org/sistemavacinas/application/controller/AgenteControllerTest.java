package org.sistemavacinas.application.controller;

import org.sistemavacinas.application.service.AgenteService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;

class AgenteControllerTest {

    @Mock
    private AgenteService agenteService;

    @InjectMocks
    private AgenteController agenteController;

    public AgenteControllerTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void deveCadastrarAgenteComSucesso() {
        //AgenteDto dto = new AgenteDto();
        //dto.setId(UUID.randomUUID());
        //dto.setNome("Maria Agente");
        //dto.setTelefone("11999999999");

        //ResponseEntity<Void> resposta = agenteController.cadastrar(dto);

        //assertEquals(HttpStatus.CREATED, resposta.getStatusCode());
        //verify(agenteService, times(1)).cadastrarAgente(any());
    }

//    @Test
//    void deveListarAgentesComSucesso() {
//        AgenteDto agente = new AgenteDto();
//        agente.setId(UUID.randomUUID());
//        agente.setNome("João Agente");
//        agente.setTelefone("11888888888");
//
//        when(agenteService.listarTodos()).thenReturn(List.of(agente));
//
//        ResponseEntity<List<AgenteDTO>> resposta = agenteController.listar();
//
//        assertEquals(HttpStatus.OK, resposta.getStatusCode());
//        assertFalse(resposta.getBody().isEmpty());
//        assertEquals("João Agente", resposta.getBody().get(0).getNome());
//    }
}
