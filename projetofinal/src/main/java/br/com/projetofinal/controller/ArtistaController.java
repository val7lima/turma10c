package br.com.projetofinal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetofinal.bears.Artista;
import br.com.projetofinal.dao.ArtistaDAO;




@RestController // protocolo HTTP
@CrossOrigin("*")
public class ArtistaController  {
	
	@Autowired // para spring ter controle da instancia objeto
	private ArtistaDAO dao;
	
	@PostMapping("/novoartista")
	public ResponseEntity<Artista> metodogravar(@RequestBody Artista s) {
		
		try {
		Artista resposta = dao.save(s);
		return ResponseEntity.ok(resposta);
		}catch(Exception e)
		{
			
			e.printStackTrace();
			return ResponseEntity.status(403).build();
		}
		
	}
	//GET na URL
	@GetMapping("/pesqnacionalidade/{nac}") // nac mesmo nome do metodo nac
	public ResponseEntity<List<Artista>> getNacionalidade(@PathVariable String nac){

			List<Artista> lista = dao.findByNacionalidade(nac);
			if(lista.size()==0) {
				
				return ResponseEntity.status(404).build();
				
			}
			
			return ResponseEntity.ok(lista);
	}
	

	@PostMapping("/setnacionalidade") // corpo do email
	public ResponseEntity<List<Artista>> setNacionalidade(@RequestBody Artista objeto) {
		List<Artista> lista = dao.findByNacionalidade(objeto.getNacionalidade());

		if(lista.size()==0) {
			return ResponseEntity.status(404).build();
			
		}
		
		return ResponseEntity.ok(lista);
	}
	
	
	@GetMapping("/todosartista")
	public ResponseEntity<List<Artista>> getAll(){

		List<Artista> lista = (List<Artista>)dao.findAll();
		if(lista.size()==0) {
			
			return ResponseEntity.status(404).build();
			
		}
		
		
		return ResponseEntity.ok(lista);
		
		
	}
	
	@GetMapping("/artista/{cod}")
	public ResponseEntity<Artista> pesquisarArtista(@PathVariable int cod) {
	
		Artista objeto = dao.findById(cod).orElse(null);
		if(objeto==null) {
			return ResponseEntity.status(404).build();
			
		}
		return ResponseEntity.ok(objeto);
	}
	
	
	@GetMapping("/artista/apagar/{cod}")
	public void apagarId(@PathVariable int cod) {
		
	 dao.deleteById(cod);
		
	 
	}
	

	
	
	
	
	
	
}
