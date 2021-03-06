package br.com.ecommerce.beans;


//Pessoafisica � uma classe filha da classe pai Cliente

// tem que ser simples, PessoaFisica **�** Cliente --- heran�a
// tem composi��o, Cliente **tem** Endere�o

// Cliente � Endere�o ... errado, nao tem heran�a

// interface vai orientar sobre classe filha

// se contrustor ficar aparecendo Object esqueceu extends
// se o construstor nao aparecer o cliente com atributos, vc nao colocou na classe Pai

public class PessoaFisica extends Cliente {
	
	private String cpf;
	private String rg;
	
	
	
	
	public String getAll() {
		return
				super.getAll() + "\n" + // super.getAll para chamar os atributos da classe Pai
				"CPF...." + cpf +  "\n" +
				"RG....." + rg;
		
	}
	
	
	public void setAll(int id, String nome, String fone, Endereco endereco, String cpf, String rg) {
		super.setAll(id, nome, fone, endereco); // super.getAll para alterar os atributos da classe Pai
		this.cpf = cpf;
		this.rg = rg;
	}

	public PessoaFisica() {
		super();
	}
	
	public PessoaFisica(int id, String nome, String fone, Endereco endereco, String cpf, String rg) {
		super(id, nome, fone, endereco); // passa para classe Pai, super Classe
		this.cpf = cpf;
		this.rg = rg;
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	
	
	

}
