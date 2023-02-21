package shapes;
public class Square extends Quadrilateral{

    protected double side;

    public double getSide() {
        return side;
    }

    public Square(double side) {
        super(side, side);
        this.side = side;
    }


    @Override
    public double getPerimeter() {
        return getSide() * 4;
    }

    @Override
    public double getArea() {
        return getSide() * getSide();
    }
}
