package shapes;
public class Rectangle {

    protected int length;
    protected int width;

    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }


    public double area(){
        return length * width;
    }

    public double perimeter(){
        return (Math.pow(length, 2) + Math.pow(width, 2));
    }

}
