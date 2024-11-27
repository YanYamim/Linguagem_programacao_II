package edu.fatec.lp2.exercicio2;

public class ListaCompra implements Calculavel {
	private ItemCompra[] itensCompra;
	private int qtdeMax;

	public ListaCompra(int qtdeMax) {
		this.itensCompra = new ItemCompra[qtdeMax];
		this.qtdeMax = qtdeMax;
	}

	public ItemCompra[] gItensCompra() {
		return itensCompra;
	}

	public void setItensCompra(ItemCompra[] itensCompra) {
		this.itensCompra = itensCompra;
	}

	public int getQtdeMax() {
		return qtdeMax;
	}

	public void setQtdeMax(int qtdeMax) {
		this.qtdeMax = qtdeMax;
	}

	public void incluirItem(ItemCompra item) {
		for(int i = 0; i < itensCompra.length; i++) {
			if(itensCompra[i] == null) {
				itensCompra[i] = item;
				break;
			}
		}
	}

	@Override
	public double calcularPreco() {
		double preco = 0;
		for(ItemCompra item : itensCompra) {
			if(item != null) {
				preco += item.calcularPreco();
			}
		}
		return preco;
	}
}



