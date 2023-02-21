package shapes;

abstract public class Quadrilateral extends Shape implements Measurable{

    protected double length;

    public double getLength() {
        return length;
    }
    protected void setLength(double length) {
        this.length = length;
    }

    protected double width;

    public double getWidth() {
        return width;
    }
    protected void setWidth(double width) {
        this.width = width;
    }


    public Quadrilateral(double length, double width){
        this.length = length;
        this.width = width;
    }
}
