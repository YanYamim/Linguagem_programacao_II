package edu.fatec.lp2.AreaChecker;


public class Retangulo implements Calculable {
    private double baseRet;
    private double alturaRet;

    public Retangulo(double baseRet, double alturaRet) {
        this.baseRet = baseRet;
        this.alturaRet = alturaRet;
    }

    @Override
    public double calcularArea() {
        return baseRet * alturaRet;
    }
}
