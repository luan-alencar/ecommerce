package ecommerce.exceptions;

public class SenhaIncorretaException extends Exception {

	public SenhaIncorretaException(String senha) {
		super("A senha " + senha + " esta incorreta. Por favor, digite uma senha valida");
	}
}
