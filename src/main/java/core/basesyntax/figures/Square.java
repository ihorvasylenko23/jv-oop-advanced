package core.basesyntax.figures;

public class Square extends Figures {
    private int side;

    public Square(int side, String color) {
        setColor(color);
        this.side = side;
    }

    public Square() {

    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.pow(side,2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + getArea()
                           + " sq.units, side: " + side
                           + " " + unitOrUnits(side) + ", color: " + getColor());
    }
}