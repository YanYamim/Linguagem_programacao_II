package edu.fatec.lp2.AreaChecker;


public class Main {
    public static void main(String[] args) {
        ShapeFactoryImpl factory = new ShapeFactoryImpl();

        Calculable triangulo = factory.getShape(ShapeType.TRIANGULO, new Double[]{10.0, 20.0});
        System.out.println(triangulo.calcularArea());

        Calculable quadrado = factory.getShape(ShapeType.QUADRADO, new Double[]{10.0});
        System.out.println(quadrado.calcularArea());

        Calculable retangulo = factory.getShape(ShapeType.RETANGULO, new Double[]{10.0, 20.0});
        System.out.println(retangulo.calcularArea());

        Calculable paralelogramo = factory.getShape(ShapeType.PARALELOGRAMO, new Double[]{10.0, 30.0});
        System.out.println(paralelogramo.calcularArea());

        Calculable cubo = factory.getShape(ShapeType.CUBO, new Double[]{5.0});
        System.out.println(cubo.calcularArea());

        Calculable circulo = factory.getShape(ShapeType.CIRCULO, new Double[]{30.0});
        System.out.println(circulo.calcularArea());

        Calculable hexagono = factory.getShape(ShapeType.HEXAGONO, new Double[]{20.0});
        System.out.println(hexagono.calcularArea());

        Calculable trapezio = factory.getShape(ShapeType.TRAPEZIO, new Double[]{10.0, 20.0, 5.0});
        System.out.println(trapezio.calcularArea());

        Calculable losango = factory.getShape(ShapeType.LOSANGO, new Double[]{10.0, 20.0});
        System.out.println(losango.calcularArea());

    }
}
