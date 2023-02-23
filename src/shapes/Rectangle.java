package shapes;
public class Rectangle extends Quadrilateral{
    @Override
    protected void setLength(double length) {
        this.length = length;
    }
    @Override
    protected void setWidth(double width) {
        this.width = width;
    }

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
