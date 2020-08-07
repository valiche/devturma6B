package br.valiche.loja.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.valiche.loja.dao.UserDAO;
import br.valiche.loja.model.User;

@RestController
@CrossOrigin("*")
public class UserController {

    @Autowired
    private UserDAO dao;

    @GetMapping("/user/{id}")
    public ResponseEntity<User> buscarPorId(@PathVariable final int id) {
        final User usuario = dao.findById(id).orElse(null);
        if (usuario != null) {
            return ResponseEntity.ok(usuario);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/usuarios")
    public ResponseEntity<ArrayList<User>> buscarTodos() {
        final ArrayList<User> lista = (ArrayList<User>) dao.findAll();

        return ResponseEntity.ok(lista);
    }

    @PostMapping("/login")
    public ResponseEntity<User> login(@RequestBody final User UsuarioFront) {
        final User userlog = dao.findByEmailAndPassword(UsuarioFront.getEmail(), UsuarioFront.getPassword());
        if (userlog != null){
            userlog.setPassword("*****"); //mascara de segurança
            return ResponseEntity.ok(userlog);
        }else{
            return ResponseEntity.status(403).build();
        }
    }
    
    

}