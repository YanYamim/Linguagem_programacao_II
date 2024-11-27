package edu.fatec.lp2.Conversor;

public class DolarParaReal implements Convertible {
    private static final double ConversorDol = 3.78;

    @Override
    public Double execute(Double value) {
        return value * ConversorDol;
    }
}
