package variaveis;

public class ManipulaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String email = "reGina@gAma.aCadDmy.com.br";
		System.out.println("Original :" + email);
		System.out.println("Minuscula : " + email.toLowerCase());
		System.out.println("Maiuscula: " + email.toUpperCase());
		System.out.println("Qtd de caracteres: " + email.length());
		System.out.println("Posicao do @: " + email.indexOf("@"));
		System.out.println("Exibir do 2 ate 4:" + email.substring(1,4));
		System.out.println("Exibir do 3 em diante:" + email.substring(2));
		System.out.println("Primeira metade:  " + email.substring(0, email.length()/2));
		// Exibir o usuario do email (antes do @)

		System.out.println("usuario :" + email.substring(0,email.indexOf("@")));
		
		// Exibir o usuario do email (depois do @)
		
		System.out.println("servidor :" + email.substring(email.indexOf("@")+1));
		
		System.out.println("primeiro caracter: " + email.charAt(4));
		System.out.println("Comparando com == " + (email=="x@x.com.br"));
		System.out.println("Comparação: " + email.equals("x@xcom.br"));
		System.out.println("Comparação ignorando caixa: " + email.equalsIgnoreCase("x@xcom.br"));
		
	}

}
