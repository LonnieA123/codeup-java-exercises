package shapes;
public class Square extends Rectangle{

    protected int side;

    public Square(int side){
       super(side,side);
       this.side = side;
    }


    public double area() {
        return Math.pow(side, 2);
    }


    public double perimeter() {
        return 4 * side;
    }

}
