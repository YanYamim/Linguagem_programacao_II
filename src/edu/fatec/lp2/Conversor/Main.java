package edu.fatec.lp2.Conversor;

import java.util.List;

public class Main {
     public static void main(String[] args) {
        Convertible dollarToReal = new DolarParaReal();
        Convertible fahrenheitToCelsius = new FahrenheitParaCelsius();
        Convertible poundsToKilograms = new LibrasParaKilogramas();

        List<Convertible> instructions = List.of(dollarToReal, fahrenheitToCelsius, poundsToKilograms);
        List<Double> values = List.of(10.0, 98.6, 150.0);

        InstructionBatchConverter batchConvertible = new InstructionBatchConverter();
        List<Double> results = batchConvertible.executeBatchConversion(instructions, values);

        results.forEach(System.out::println);
    }
}
