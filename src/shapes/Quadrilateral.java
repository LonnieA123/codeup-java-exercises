package shapes;

abstract public class Quadrilateral extends Shape implements Measurable{

    protected double length;

    public double getLength() {
        return length;
    }
   abstract protected void setLength(double length);


    protected double width;

    public double getWidth() {
        return width;
    }
   abstract protected void setWidth(double width);


    public Quadrilateral(double length, double width){
        this.length = length;
        this.width = width;
    }
}
