package core.basesyntax.figure;

import core.basesyntax.Figure;

public class Square extends Figure {
    private double side;

    public Square(double side, String name, String color) {
        super(color, name);
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName()
                + ", area: " + getArea()
                + " sq. units, side: " + side
                + " units. color: " + getColor());
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
