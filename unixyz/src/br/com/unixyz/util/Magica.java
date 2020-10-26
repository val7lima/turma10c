package br.com.unixyz.util;

import javax.swing.JOptionPane;

public class Magica {
	
	
	//metodo criado para usar a janela para digitar
	public static String s(String msg) {
		return JOptionPane.showInputDialog(msg).toUpperCase();
		}
	//metodo para converter entrada da janela string para inteiro e utilizar metodo S para chamar a janela
	public static int i(String msg) {
		return Integer.parseInt(s(msg));
		
	}
	
	// metodo para converter entrada da janela string para converter para inteiro e usar metodo S
	public static float f(String msg) {
		return Float.parseFloat(s(msg));
	}
	
	
	public static double d(String msg) {
		return Float.parseFloat(s(msg));
	}
	
	
	
	

}
