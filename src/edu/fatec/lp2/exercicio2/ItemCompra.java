package edu.fatec.lp2.exercicio2;

public class ItemCompra implements Calculavel {
    private int quantidade;
    private double desconto;
    private Produto produto;

    public ItemCompra(int quantidade, double desconto, Produto produto) {
        this.quantidade = quantidade;
        this.produto = produto;
        this.desconto = desconto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
       if(desconto > produto.getDescontoMaximo()) {
           this.desconto = produto.getDescontoMaximo();
       } else {
           this.desconto = Math.max(desconto, 0);
       }
    }

    @Override
    public double calcularPreco() {
        return (produto.getPreco() - desconto) * quantidade;
    }
}
