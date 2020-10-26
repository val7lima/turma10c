package br.com.excesoes.implementacao;

public class TesteExcecao {

	public static void main(String[] args) {

		//Excecoes: nao sao controladas pelo programador.
		//Existem dois tipos: ERROS
		// A-) Checked: o Java verifica antes da compilacao
		// B-) Unchecked: s� ocorre ap�s a compila��o
		// o try - catch depois que conclui o sistema		


		try {


			int numero = Integer.parseInt("7");
			System.out.println("Resultado: " + (numero *10));

			
			String email=null;
			if(email==null) {
				throw new RuntimeException("Dado corrompido");
				
			}
			
			System.out.println("Usuario: " + email.substring(0, email.indexOf("@")));

			//		java.lang.StringIndexOutOfBoundsException: String index out of range: -1
			//		at java.lang.String.substring(Unknown Source)
			//		at br.com.excesoes.implementacao.TesteExcecao.main(TesteExcecao.java:21)
		// EXCEPTION sempre ficar por ultimo
		//java.lang.   StringIndexOutOfBoundsException:		

		}catch(StringIndexOutOfBoundsException erro) {

			System.out.println("coordenada invalida");

		}catch(NumberFormatException erro) {

			System.out.println("Numero invalido!!");


			
			
			
// sempre ficar por ultimo, pq primeiro as excesoes...
			
			
		}catch(Exception e) { // excesao erro para nao mostrar o codigo
			System.out.println("OPS erro!!");
			// aparece o erro, depois de ir para producao comentar ou retirar
			e.printStackTrace();



		}finally { // executado de qlqr forma... msg para usuario ok

			System.out.println("At� logo!!!");
		}









	}

}
