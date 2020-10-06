package ecommerce.entidades;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	private String nome;
	private String email;
	private String senha;
	private String endereco;
	private static List<Compra> compras;

	public Cliente(String nome, String email, String senha, String endereco) {
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.endereco = endereco;
		this.compras = new ArrayList<>();
	}

	public Cliente() {
	}

	public double getValorGastoTotal() {
		double total = 0.0;
		for (Compra c : compras) {
			total += c.getValorTotal();
		}
		return total;
	}

	// getter's / setter's
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public static List<Compra> getCompras() {
		return compras;
	}

	public void setCompras(List<Compra> compras) {
		this.compras = compras;
	}

}
