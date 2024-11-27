package edu.fatec.lp2.AreaChecker;


public interface ShapeFactory {
    Calculable getShape(ShapeType type, Double[] values);
}
