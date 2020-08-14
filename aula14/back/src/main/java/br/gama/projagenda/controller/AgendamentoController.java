package br.gama.projagenda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.gama.projagenda.dao.AgendamentoDAO;
import br.gama.projagenda.model.Agendamento;

@RestController
@CrossOrigin(origins = "*")
public class AgendamentoController {

    @Autowired
    private AgendamentoDAO dao;

    @PostMapping("/agendamento/novo")
    public ResponseEntity<Agendamento> novoAgendamento(@RequestBody Agendamento agenda) {
        try {
            Agendamento novo = dao.save(agenda);
            return ResponseEntity.ok(novo);
        } catch (Exception e) {
            return ResponseEntity.status(400).build();
        }
    }

}