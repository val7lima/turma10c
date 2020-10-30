package br.com.projetofinal.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetofinal.bears.Usuario;
import br.com.projetofinal.dao.UsuarioDAO;

//padrao MVC model view controllers 
//beans gerar set e get


//model(beans) faz parte da minha arquietura, regra de negocio
//controller vai vim de fora, recepção... exposto com mundo exterior, se comunicar protocolo HTTP


//recepcionista 

@RestController // indica que classe irá responder metodos protocolos HTTP (GET/POST)
@CrossOrigin("*")
public class UsuarioController {

	@Autowired // atributo feito pelo Spring boot
	private UsuarioDAO dao; // criado objeto
	
	
	//Collection uma lista de usuario
	
	@PostMapping("/gravausuario")
	public ResponseEntity<Usuario> gravaUsuario(@RequestBody Usuario s) {
		
		try {
			if(s.getNome().length()<5) {
				
				return ResponseEntity.status(403).build();
				}
			
		Usuario resposta = dao.save(s);
		return ResponseEntity.ok(resposta);
		}catch(Exception e)
		{
			
			e.printStackTrace();
			return ResponseEntity.status(403).build();
		}
		
	}
	
	
	
	@GetMapping("/pesqnome/{nome}") 
	public ResponseEntity<List<Usuario>> pesqNome(@PathVariable String nome) {
		List<Usuario> lista = dao.findByNome(nome);

		if(lista.size()==0) {
			return ResponseEntity.status(404).build();
			
		}
		
		return ResponseEntity.ok(lista);
	}

	
	@GetMapping("/pesqitau") // nac mesmo nome do metodo nac
	public ResponseEntity<List<Usuario>> pesqItau(){

			List<Usuario> lista = (List<Usuario>)dao.findAll();
			List<Usuario> resposta = new ArrayList<Usuario>();

			for (Usuario objeto : lista)
			{
				if(objeto.getEmail().indexOf("itau-unibanco.com.br")>-1)
				{
					resposta.add(objeto);
				}
			}
			
			if(resposta.size()==0) {
				
				return ResponseEntity.status(404).build();
				
			}
			
		
			
			return ResponseEntity.ok(resposta);
		
	}
	
	
	@GetMapping("/todousuarios")
	public ResponseEntity<List<Usuario>> getAll(){
		List<Usuario> lista = (List<Usuario>)dao.findAll(); 
	
		if(lista.size()==0) {
			
			return ResponseEntity.status(404).build();
			
			
		}
		
		return ResponseEntity.ok(lista);
		
	}
	
	
	
	
	@GetMapping("/usuario/{cod}") // protocolo HTTP GET consultando na base de dados, entre {} é variavel
	public ResponseEntity<Usuario> pesquisarUsuario(@PathVariable int cod) // precisa colocar @PathVariable é tirado na rota URL 
	{
		
		Usuario objeto = dao.findById(cod).orElse(null);
		
		if(objeto==null) {
			
			return ResponseEntity.status(404).build();
			
			
		}
		
		
		return ResponseEntity.ok(objeto);
		
		
	}
	
	
	@PostMapping("/login")
	public ResponseEntity<Usuario> logar(@RequestBody Usuario objeto) 
	{
		Usuario resposta = dao.findByEmailAndSenha(objeto.getEmail(), objeto.getSenha());
	
		if(resposta==null) {
			
			return ResponseEntity.status(404).build();
		}
	
		return ResponseEntity.ok(resposta);
	}
	
	
	
	
	
	
	
}
