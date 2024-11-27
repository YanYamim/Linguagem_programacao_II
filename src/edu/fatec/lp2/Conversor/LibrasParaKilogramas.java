package edu.fatec.lp2.Conversor;

public class LibrasParaKilogramas implements Convertible{
    private double ConversorTemp = 0.453592;

    @Override
    public Double execute(Double value) {
        return value * ConversorTemp;
    }
}
