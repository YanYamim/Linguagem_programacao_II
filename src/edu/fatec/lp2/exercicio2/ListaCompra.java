package edu.fatec.lp2.exercicio2;

public class ListaCompra implements Calculavel {
	private ItemCompra[] itensCompra;
	private int quantidadeMax;

	public ListaCompra(int quantidadeMax) {
		this.quantidadeMax = quantidadeMax;
		this.itensCompra = new ItemCompra[quantidadeMax];
	}

	public ItemCompra[] getItensCompra() {
		return itensCompra;
	}

	public void setItensCompra(ItemCompra[] itensCompra) {
		this.itensCompra = itensCompra;
	}

	public int getQuantidadeMax() {
		return quantidadeMax;
	}

	public void setQuantidadeMax(int quantidadeMax) {
		this.quantidadeMax = quantidadeMax;
	}

	public void incluirItem(ItemCompra item) {
		boolean inserido = false;
		for (int i = 0; i < itensCompra.length; i++) {
			if (itensCompra[i] == null) {
				itensCompra[i] = item;
				break;
			}
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


