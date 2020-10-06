package ecommerce.entidades;

import java.util.ArrayList;
import java.util.List;

public class Produto {
	private static int nextProduto = 0;
	private String nome;
	private List<Cliente> clientes;
	private List<Produto> produtos;
	private double valor;

	public Produto(String nome, double valor) {
		this.nome = nome;
		this.valor = valor;
		this.clientes = new ArrayList<>();
		this.produtos = new ArrayList<>();
		nextProduto++;
	}

	public Produto getQuantasUnidadesVendidas(Produto p) {
//		TODO - Implementar
		Produto produtoMaisVendido = null;
		for (Cliente cliente : clientes) {
			for (Compra compra : cliente.getCompras()) {
				for (Produto produto : produtos) {
					
				}
			}
		}
		if (nextProduto > nextProduto) {

		}
		return produtoMaisVendido;
	}

	// getter's / setter's
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public static int getNextProduto() {
		return nextProduto;
	}

	public static void setNextProduto(int nextProduto) {
		Produto.nextProduto = nextProduto;
	}

}
