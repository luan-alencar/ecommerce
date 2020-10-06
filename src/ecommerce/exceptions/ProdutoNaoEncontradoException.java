package ecommerce.exceptions;

public class ProdutoNaoEncontradoException extends Exception {

	public ProdutoNaoEncontradoException(String produto) {
		super("O produto " + produto + " esta em falta");
	}
}
