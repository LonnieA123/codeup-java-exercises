package shapes;
public class Rectangle extends Quadrilateral{


    @Override
    public double getPerimeter() {
        return length * 2 + width * 2;
    }

    @Override
    public double getArea() {
        return length * width;
    }

   public Rectangle(double length, double width){
        super(length,width);
   }
}
