package ecommerce.entidades;

import java.util.ArrayList;
import java.util.List;

import ecommerce.exceptions.ProdutoNaoEncontradoException;
import ecommerce.exceptions.SenhaIncorretaException;
import ecommerce.exceptions.UsuarioDesconhecidoException;

public class Loja {

	private List<Cliente> clientes;
	private List<Produto> produtos;

	public Loja() {
		this.clientes = new ArrayList<>();
		this.produtos = new ArrayList<>();
	}

	public void cadastrarCliente(Cliente cliente) {
		clientes.add(cliente);
	}

	public Sessao fazerLogin(String email, String senha) throws UsuarioDesconhecidoException, SenhaIncorretaException {
//		TODO - Implementar
		Sessao sessao = null;
		for (Cliente c : clientes) {
			if (c.getEmail().equals(email) && c.getSenha().equals(senha)) {
				Sessao sessao1 = new Sessao();
				sessao = sessao1;
			} else if (!c.getEmail().equals(email) && c.getSenha().equals(senha)) {
				throw new UsuarioDesconhecidoException(email);
			}
		}
		return sessao;
	}

	public void cadastrarProduto(Produto produto) {
		produtos.add(produto);
	}

	// getter
	public List<Produto> getProdutos() throws ProdutoNaoEncontradoException {
		List<Produto> pro = null;
		for (Produto p : produtos) {
			if (!produtos.contains(p)) {
				throw new ProdutoNaoEncontradoException(p.getNome());
			} else if (produtos.contains(p))
				pro = produtos;
		}
		return pro;
	}

	public Produto getProdutoMaisVendido() {
		Produto maisVendido = produtos.get(0);
		int maxVezesVendido = getQuantasUnidadesVendidas(maisVendido);
		for (Produto p : produtos) {
			int qtd = getQuantasUnidadesVendidas(p);
			if (qtd > maxVezesVendido) {
				maxVezesVendido = qtd;
				maisVendido = p;
			}
		}
		return maisVendido;
	}

	public double getValorVendidoTotal() {
		double total = 0.0;
		for (Cliente c : clientes) {
			total += c.getValorGastoTotal();
		}

		return total;
	}

	public int getQuantasUnidadesVendidas(Produto produto) {
		int quantidade = 0;
		// para cada cliente da loja
		for (Cliente c : clientes) {
			// eu devo olhar cada compra dele
			for (Compra compra : c.getCompras()) {
				// em cada compra eu olho os produtos
				for (Produto p : compra.getProdutos()) {
					// se o produto e igual ao p (parametro do metodo), eu conto
					if (p.equals(produto)) {
						quantidade++;
					}
				}
			}
		}
		return quantidade;
	}

}
