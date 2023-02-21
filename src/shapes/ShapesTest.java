package shapes;
public class ShapesTest {

    public static void main(String[] args) {
    Measurable sqr = new Square(5);
    Measurable rec = new Rectangle(4,5);


        System.out.println(sqr.getPerimeter());
        System.out.println(rec.getPerimeter());

        System.out.println(sqr.getArea());
        System.out.println(rec.getArea());
    }
}
