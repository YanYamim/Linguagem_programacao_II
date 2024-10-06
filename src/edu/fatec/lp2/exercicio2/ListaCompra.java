package edu.fatec.lp2.exercicio2;

import java.util.ArrayList;
import java.util.List;

public class ListaCompra implements Calculavel {
	private List<ItemCompra> itensCompra;
	private int quantidadeMax;

	public ListaCompra(int quantidadeMax) {
		this.itensCompra = new ArrayList<>();
		this.quantidadeMax = quantidadeMax;
	}

	public List<ItemCompra> getItensCompra() {
		return itensCompra;
	}

	public void setItensCompra(List<ItemCompra> itensCompra) {
		this.itensCompra = itensCompra;
	}

	public int getQuantidadeMax() {
		return quantidadeMax;
	}

	public void setQuantidadeMax(int quantidadeMax) {
		this.quantidadeMax = quantidadeMax;
	}

	public void incluirItem(ItemCompra item) {
		if(itensCompra.size() < quantidadeMax) {
			itensCompra.add(item);
		} else {
			System.out.println("Limite atingido");
		}
	}

	@Override
	public double calcularPreco() {
		double total = 0;
		for(ItemCompra item : itensCompra) {
			total += item.calcularPreco();
		}
		return total;
	}
}


