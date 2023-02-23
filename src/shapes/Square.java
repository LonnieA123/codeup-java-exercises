package shapes;
public class Square extends Quadrilateral{



    @Override
    protected void setWidth(double width) {
        this.width = width;
        setLength(width);
    }
    @Override
    protected void setLength(double length) {
        this.length = length;
        setWidth(length);
    }

    public Square(double side) {
        super(side, side);
        this.length = side;
    }


    @Override
    public double getPerimeter() {
        return length * 4;
    }

    @Override
    public double getArea() {
        return length * length;
    }
}
