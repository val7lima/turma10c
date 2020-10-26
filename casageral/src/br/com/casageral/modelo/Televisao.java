package br.com.casageral.modelo;

public class Televisao {
	
	private String marca ="";
	private float valor;
	private boolean status;
	private int canal;
	private int volume;

	public void preencherMarcar(String pMarca)
	{
		marca=pMarca.toUpperCase();

	}
	
	public String retornarMarca() {
		return marca; // poderia colocar regra na hora retorno, calculo

	}
	
	
	public void preencherValor(float pValor) {
		if (pValor>0) {

			valor = pValor;
		}
	}

	public float retornarValor() {
		return valor;

	}

	
	public String ligar() {
		status=true;
		return "TV Ligado!";
	}

	public String desligar() {
		status=false;
		canal = 0;
		return "TV Desligado!";
	}

	
	public boolean retornarStatus() {
		return status;

	}
	

	public void mudarCanal(int pMudar) {
		if (pMudar>0) {

			canal = pMudar;
		}
	}

	
	public int retornarCanal() {
		return canal;

	}
	
	
	public void aumentarVolume(int pVolume) {
		if (status==true && pVolume>0) {

			volume+= pVolume;
		}
	}

	public void diminuirVolume(int param) {
		if (status==true && param>0) {

			volume-= param;
		}
	}

	
	public int retornarVolume() {
		return volume;

	}
	

	public String retornarTudo() {
	
		
		
		return 
				"Marca: " + marca + "\n" +
				"Valor: " + valor + "\n" +
				"Status: " + status + "\n" +
				"Volume: " + volume + "\n" +
				"Canal: " + canal;
	}

	
	
	
	
	
	
	
	
	
	

	

}
