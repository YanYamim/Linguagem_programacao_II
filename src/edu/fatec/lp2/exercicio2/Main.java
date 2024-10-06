package edu.fatec.lp2.exercicio2;

public class Main {
	public static void main(String[] args) {
		Supermercado supermercado = new Supermercado("Ibralândia");

		Produto produto1 = new Produto("Arroz", "Kg", "Arroz Branco", 20.0, 5.0, supermercado);
		Produto produto2 = new Produto("Feijão", "Kg", "Feijão Preto", 10.0, 3.0, supermercado);

		ItemCompra item1 = new ItemCompra(2, produto1, 2.0);  // 2 unidades com desconto de 2
		ItemCompra item2 = new ItemCompra(3, produto2, 1.0);  // 3 unidades com desconto de 1

		ListaCompra listaCompra = new ListaCompra(5);
		listaCompra.incluirItem(item1);
		listaCompra.incluirItem(item2);

		double total = listaCompra.calcularPreco();
		System.out.println("Total da compra: R$ " + total);
	}
}
