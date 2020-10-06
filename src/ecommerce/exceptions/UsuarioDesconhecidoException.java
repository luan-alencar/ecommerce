package ecommerce.exceptions;

public class UsuarioDesconhecidoException extends Exception {
	public UsuarioDesconhecidoException(String email) {
		super("O email " + email + " esta incorrente. Por favor, digite um email valido");
	}
}
