package edu.fatec.lp2.AreaChecker;


public class ShapeFactoryImpl {
    public Calculable getShape(ShapeType type, Double[] values) {
        switch (type) {
            case TRIANGULO:
                double baseTri = values[0];
                double alturaTri = values[1];
                return new Triangulo(baseTri, alturaTri);

            case CUBO:
                double ladoCub = values[0];
                return new Cubo(ladoCub);

            case CIRCULO:
                double raio = values[0];
                return new Circulo(raio);

            case LOSANGO:
                double diagonalMaior = values[0];
                double diagonalMenor = values[1];
                return new Losango(diagonalMaior, diagonalMenor);

            case HEXAGONO:
                double ladoHex = values[0];
                return new Hexagono(ladoHex);

            case QUADRADO:
                double ladoQua = values[0];
                return new Quadrado(ladoQua);

            case TRAPEZIO:
                double baseMaior = values[0];
                double baseMenor = values[1];
                double alturaTrap = values[2];
                return new Trapezio(baseMaior, baseMenor, alturaTrap);

            case RETANGULO:
                double ladoRet = values[0];
                double alturaRet = values[1];
                return new Retangulo(ladoRet, alturaRet);

            case PARALELOGRAMO:
                double basePara = values[0];
                double alturaPara = values[1];
                return new Paralelogramo(basePara, alturaPara);

            default:
                return null;
        }
    }
}
