package edu.fatec.lp2.AreaChecker;


public class Hexagono implements Calculable {
    private double ladoHex;

    public Hexagono(double ladoHex) {
        this.ladoHex = ladoHex;
    }

    public double calcularArea() {
        return (6 * (Math.pow(ladoHex, 2) * (Math.sqrt(3)))) / 2;
    }
}
