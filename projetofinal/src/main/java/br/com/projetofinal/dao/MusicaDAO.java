package br.com.projetofinal.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.projetofinal.bears.Musica;

public interface MusicaDAO extends CrudRepository<Musica, Integer> {

	List<Musica> findByLancamento(int lancamento);
	// pode fazer a data por aqui, pesquisa de data com esse opção
}
