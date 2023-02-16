package shapes;

import java.util.Scanner;

public class Circle {

    private final Scanner scanner = new Scanner(System.in);

    private int radius;

    public int getRadius(){ return this.radius;}

    public void setRadius(int radius){this.radius = radius;}


    public Circle(){
        System.out.println("enter a number");
        this.radius = scanner.nextInt();

    }

    public double getCircumference(){
        return 2 * Math.PI * this.radius;
    }

    public double getArea(){
        return Math.PI * (Math.pow(this.radius,2));
    }


}
