package br.matos.empresa.dao;

import org.springframework.data.repository.CrudRepository;

import br.matos.empresa.model.Produto;

public interface ProdutoDAO extends CrudRepository<Produto, Integer>{

}
