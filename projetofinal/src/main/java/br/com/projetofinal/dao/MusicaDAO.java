package br.com.projetofinal.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.projetofinal.bears.Musica;

public interface MusicaDAO extends CrudRepository<Musica, Integer> {

}
