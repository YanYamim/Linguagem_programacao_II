package edu.fatec.lp2.AreaChecker;


public class Trapezio implements Calculable {
    private double baseMaior;
    private double baseMenor;
    private double alturaTrap;

    public Trapezio(double baseMaior, double baseMenor, double alturaTrap) {
        this.baseMaior = baseMaior;
        this.baseMenor = baseMenor;
        this.alturaTrap = alturaTrap;
    }

    @Override
    public double calcularArea() {
        return ((baseMaior + baseMenor) * alturaTrap) / 2;
    }
}
