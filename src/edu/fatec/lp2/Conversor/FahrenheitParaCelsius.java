package edu.fatec.lp2.Conversor;

public class FahrenheitParaCelsius implements Convertible {

    @Override
    public Double execute(Double value) {
        return (value - 32) / 1.8;
    }
}
