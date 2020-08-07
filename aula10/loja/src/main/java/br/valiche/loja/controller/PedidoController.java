package br.valiche.loja.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.valiche.loja.dao.PedidoDAO;
import br.valiche.loja.model.Pedido;

@RestController
@CrossOrigin("*")
public class PedidoController {

    @Autowired
    private PedidoDAO dao;

    @GetMapping ("/pedido/{id}")
    public ResponseEntity<Pedido> buscarPorId(@PathVariable int id){
Pedido pedido = dao.findById(id).orElse(null);
if(pedido != null){
    pedido.getSolicitante().setPassword("***");
    return ResponseEntity.ok(pedido);
}else{
    return ResponseEntity.notFound().build();
}

    }

    
}