package edu.fatec.lp2.exercicio2;

public class Produto {
	private String nome;
	private String descricao;
	private String unidade;
	private double preco;
	private double descontoMaximo;
	private Supermercado supermercado;

	public Produto(String nome, String descricao, String unidade, double preco, double descontoMaximo, Supermercado supermercado) {
		this.nome = nome;
		this.descricao = descricao;
		this.unidade = unidade;
		this.preco = preco;
		this.descontoMaximo = descontoMaximo;
		this.supermercado = supermercado;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getUnidade() {
		return unidade;
	}

	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getDescontoMaximo() {
		return descontoMaximo;
	}

	public void setDescontoMaximo(double descontoMaximo) {
		this.descontoMaximo = descontoMaximo;
	}

	public Supermercado getSupermercado() {
		return supermercado;
	}

	public void setSupermercado(Supermercado supermercado) {
		this.supermercado = supermercado;
	}

	public String toString(String supermercado) {
		return null;
	}
}
