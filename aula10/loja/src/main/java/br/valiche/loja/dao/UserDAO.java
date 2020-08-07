package br.valiche.loja.dao;

import org.springframework.data.repository.CrudRepository;

import br.valiche.loja.model.User;

/**
 * UserDAO
 */
public interface UserDAO extends CrudRepository<User, Integer> {
public User findByEmailAndPassword (String email, String password);
    
}