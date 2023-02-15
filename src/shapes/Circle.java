package shapes;
public class Circle {

    private int radius;

    public int getRadius(){ return this.radius;}

    public void setRadius(int radius){this.radius = radius;}


    public Circle(int radius){
        this.radius = radius;
    }

    public double getCircumference(){
        return 2 * Math.PI * this.radius;
    }

    public double getArea(){
        return Math.PI * (Math.pow(this.radius,2));
    }


}
