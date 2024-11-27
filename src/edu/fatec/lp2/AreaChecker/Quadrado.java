package edu.fatec.lp2.AreaChecker;


public class Quadrado implements Calculable{
    private double ladoQua;

    public Quadrado(double ladoQua) {
        this.ladoQua = ladoQua;
    }

    public double calcularArea(){
        return Math.pow(ladoQua, 2);
    }
}
