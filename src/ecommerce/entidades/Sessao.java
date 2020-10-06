package ecommerce.entidades;

import java.util.ArrayList;
import java.util.List;

public class Sessao extends Cliente {

	private Cliente cliente;
	private List<Produto> carrinhoDeCompras;

	public Sessao() {
		this.carrinhoDeCompras = new ArrayList<>();
	}

	public void adicionarAoCarrinho(Produto produto) {
		carrinhoDeCompras.add(produto);
	}

	public void finalizarCompra() {
//		TODO - Implemetar,
		Compra novaCompra = new Compra();
		// adiciona novos produtos ao carrinho
		for (Produto p : carrinhoDeCompras) {
			novaCompra.getProdutos().addAll(carrinhoDeCompras);
		}
		// adiciona ao cliente anova compra
		Cliente.getCompras().add(novaCompra);
	}

	public double getValorTotalDoCarrinho() {
		double total = 0;
		for (Produto p : carrinhoDeCompras) {
			total += p.getValor();
		}
		return total;
	}

	// getter's / setter's
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Produto> getcarrinhoDeCompras() {
		return carrinhoDeCompras;
	}

	public void setcarrinhoDeCompras(List<Produto> carrinhoDeCompras) {
		this.carrinhoDeCompras = carrinhoDeCompras;
	}

}
