package ecommerce.service;

import java.util.ArrayList;

import ecommerce.entidades.Cliente;
import ecommerce.entidades.Loja;
import ecommerce.entidades.Produto;
import ecommerce.entidades.Sessao;
import ecommerce.exceptions.SenhaIncorretaException;
import ecommerce.exceptions.UsuarioDesconhecidoException;

public class Servico {
	public static void main(String[] args) throws UsuarioDesconhecidoException, SenhaIncorretaException {
		// iniciei a loja
		Loja loja = new Loja();

		// cadastrei alguns cientes
		Cliente c1 = new Cliente("Cliente 1", "teste0@gmail.com", "1234", "Rua Jose Precipicio");
		loja.cadastrarCliente(c1);
		Cliente c2 = new Cliente("Cliente 2", "teste1@gmail.com", "12345", "Rua Rita Pereira");
		loja.cadastrarCliente(c2);
		Cliente c3 = new Cliente("Cliente 3", "teste2@gmail.com", "123456", "Rua Campo Sales");
		loja.cadastrarCliente(c3);

		// cadastrei alguns produtos
		Produto p1 = new Produto("Pendrive", 13.50);
		loja.cadastrarProduto(p1);
		Produto p2 = new Produto("SSD", 150.25);
		loja.cadastrarProduto(p2);
		Produto p3 = new Produto("HD externo", 300.05);
		loja.cadastrarProduto(p3);

		// tente o seguinte
		try {
			// se esse cara existir no "banco de dados" faca login
			loja.fazerLogin("teste0@gmail.com", "1234");
			System.out.println("Login realizado");
		} catch (UsuarioDesconhecidoException e) {
			// se nao existir lance uma Exception
			System.err.print("Usuario nao cadastrado");
		}

		// teste valor total
		Sessao s = new Sessao();
		s.adicionarAoCarrinho(p1);
		s.adicionarAoCarrinho(p2);
		s.adicionarAoCarrinho(p3);
		s.finalizarCompra();
		System.out.println(s.getValorTotalDoCarrinho());
		System.out.println(s.getCompras()); // este metodo retorna um valor null, mas pq se inicializei
		// no construtor da class Sessao ?
	}
	
	
	
	
	
	
	
	
	
}
