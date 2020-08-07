package br.valiche.loja.dao;

import org.springframework.data.repository.CrudRepository;

import br.valiche.loja.model.Pedido;

public interface PedidoDAO extends CrudRepository<Pedido, Integer>{

    
}