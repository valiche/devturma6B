package br.gama.projagenda.dao;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.gama.projagenda.model.Agencia;
import br.gama.projagenda.model.Agendamento;

public interface AgendamentoDAO extends CrudRepository<Agendamento, Integer> {
    public List<Agendamento> findAllByAgencia(Agencia nomeagencia);
    public List<Agendamento> findAllByDataAgendamento(LocalDate dataAgendamento); 
    public List<Agendamento> findAllByNome(String nome);
}