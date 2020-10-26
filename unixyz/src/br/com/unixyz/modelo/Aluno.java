package br.com.unixyz.modelo;
// implementacao = principal = teste (camada onde tem main())
// modelo = beans = javabeans = dto = to (desing pattern)





/*
 * Desing Patterns => DTO (Data Transfer Object
 *  - Todo atributo (variavel) DEVE ser privado
 *  - CADA atributo DEVE possuir UM método de input de UM método de output
 *  - PREENCHER INPUT entrada (SETTER) setter 
 *  - EXIBIR OUTPUT saida   (GETTER) getter imprimir valor get
 *  - this.nome referencia nessa classe, isso é parametro e isso é atributo(variavel)
 *  - new Aluno() construtor, nao é classe e nem metodo
 *  - Cada Classe deve possuir no minimo 2 construtores ( um vazio e outro cheio com todos atributos, variaveis)
 *  - vou usar o construtor quando instancio
 *  - vou usar o setall depois que instancio
 *  
 *  
 *  
 */

public class Aluno {

	private int rm;
	private String nome;
	private String email;


	public Aluno() //construtor vazio
	{
		super(); // herança de Classe
	}


	public Aluno(int rm, String nome, String email) {
		super();
		this.rm = rm;
		this.nome = nome;
		this.email = email;
	}
	
	
	public void setAll(int rm, String nome, String email) {
		this.rm = rm;
		this.nome = nome;
		this.email = email;

	}
	public String getAll() {
		return
				"RM: " + rm + "\n" +
				"Nome: " + nome + "\n" +
				"Email: " + email;

	}



	public int getRm() {
		return rm;
	}
	public void setRm(int rm) {
		this.rm = rm;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}














} // fecha chave
