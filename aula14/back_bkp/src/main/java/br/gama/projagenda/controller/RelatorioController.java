package br.gama.projagenda.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gama.projagenda.dao.AgendamentoDAO;
import br.gama.projagenda.model.Agendamento;

@RestController
@CrossOrigin(origins = "*")
public class RelatorioController {
    @Autowired
    private AgendamentoDAO dao;

    @GetMapping("/relatorio")
    public List<Agendamento> getAgendamentos() {
        List<Agendamento> lista = (List<Agendamento>) dao.findAll();
        return lista;
    }
}