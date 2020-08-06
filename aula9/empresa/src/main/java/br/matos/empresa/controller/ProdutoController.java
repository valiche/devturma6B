package br.matos.empresa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.matos.empresa.model.Produto;
import br.matos.empresa.services.IProdutoService;

@RestController
@CrossOrigin("*") //acesso de qualquer origem
public class ProdutoController {
    @Autowired
    private IProdutoService servico;
    
    @GetMapping("/produto/{cod}")
    public ResponseEntity<Produto> buscarProdutoPorCod(@PathVariable int cod){
Produto produto = servico.buscarProdutoPorCod(cod);
        if(produto != null){
return ResponseEntity.ok(produto);
        }else{
            return ResponseEntity.notFound().build();
        }

    }
}