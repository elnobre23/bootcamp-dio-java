package AnatomiaDasClasses;

public class AnatomiaDasClasses3 {

public static void main (String [] args) {
	
	String primeiroNome = "Breno";
	String segundoNome = "Cuzzuol";
	
	String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);
	System.out.println(nomeCompleto);
}

public static String nomeCompleto (String primeiroNome, String segundoNome) {

	return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
	
}

}
