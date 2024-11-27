package edu.fatec.lp2.Calculadora;

class Calculadora {
    public static Double calculate(String operation, Double... numbers) {
        if (numbers.length < 2) {
            throw new IllegalArgumentException("Pelo menos dois números devem ser fornecidos.");
        }

        Double result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            switch (operation) {
                case "+":
                    result += numbers[i];
                    break;
                case "-":
                    result -= numbers[i];
                    break;
                case "*":
                    result *= numbers[i];
                    break;
                case "/":
                    result /= numbers[i];
                    break;
                default:
                    throw new IllegalArgumentException("Operação inválida: " + operation);
            }
        }
        return result;
    }
}

