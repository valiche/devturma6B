package br.matos.empresa.services;

import br.matos.empresa.model.Produto;

public interface IProdutoService {
    public Produto buscarProdutoPorCod(int cod);
        
}