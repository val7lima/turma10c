package br.com.unixyz.modelo;

import br.com.unixyz.padroes.PadraoFormacao;

public class Tecnologo extends Formacao implements PadraoFormacao {
	
	private boolean planoEstendido;
	private double mensalidade;
	
	
	public void calcMensalidade (double fator) {
		
		super.setMensalidade(super.getMensalidade() *(float) fator* 600);
		
	}
	
	public String getAll() {
	
		String minha = "";
		if(planoEstendido == true) {
			minha = "Sim";
		} else {
			minha = "N�o";
		}
		
		return 
				super.getAll() + "\n" + 
				"Plano Estendido: " + planoEstendido + minha;
				
	}
	
	
	
	
	public void setAll(String descricao, int duracao, float mensalidade, boolean planoEstendido) {
		super.setAll(descricao, duracao, mensalidade);
		this.planoEstendido = planoEstendido;
	}
	
	
	
	

	public Tecnologo() {
		super();
	}

	public Tecnologo(String descricao, int duracao, float mensalidade, boolean planoEstendido) {
		super(descricao, duracao, mensalidade);
		this.planoEstendido = planoEstendido;
	}

	public boolean isPlanoEstendido() {
		return planoEstendido;
	}

	public void setPlanoEstendido(boolean planoEstendido) {
		this.planoEstendido = planoEstendido;
	}
	
	
	
	
	
	

}
