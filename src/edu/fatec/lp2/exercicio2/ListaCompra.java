package edu.fatec.lp2.exercicio2;

public class ListaCompra implements Calculavel {
	private ItemCompra[] itensCompra;
	private int qtdMax;

	public ListaCompra(int qtdMax) {
		this.qtdMax = qtdMax;
		this.itensCompra = new ItemCompra[qtdMax];
	}

	public ItemCompra[] getItensCompra() {
		return itensCompra;
	}

	public void setItensCompra(ItemCompra[] itensCompra) {
		this.itensCompra = itensCompra;
	}

	public int getQtdMax() {
		return qtdMax;
	}

	public void setQtdMax(int qtdMax) {
		this.qtdMax = qtdMax;
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



