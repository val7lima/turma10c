package br.com.projetofinal.dao; // DATA acess object

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.projetofinal.bears.Usuario;

// criar CRUD - create, read,


// generica 2 dados... so recebe classes <Usuario, Integer>
public interface UsuarioDAO extends CrudRepository<Usuario, Integer>{

	
	
	//colocar dentro do atribudo da Classe Usuario
	// seguir o padrao find By Email And Senha
	
	public Usuario findByEmailAndSenha(String email, String senha); 
	
	public List<Usuario> findByNome(String nome);

	public List<Usuario> findByEmail(String email);
	
	
}
