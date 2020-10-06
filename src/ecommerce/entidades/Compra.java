package ecommerce.entidades;

import java.util.ArrayList;
import java.util.List;

public class Compra {

	private List<Produto> produtos;

	public Compra() {
		this.produtos = new ArrayList<Produto>();
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public double getValorTotal() {
		double total = 0;
		for (Produto p : produtos) {
			total += p.getValor();
		}
		return total;
	}

}
