public class Circle extends TwoDimShapes implements Calculatable2D {

    double radius;
    final double pi = 3.14;

    public Circle(String nameOfShapes, double radius) {
        super(nameOfShapes);
        this.radius = radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2*pi*radius;
    }

    @Override
    public double calculateArea() {
        return pi*radius*radius;
    }

    @Override
    public String toString() {
        return "Circle{ perimeter = " + calculatePerimeter()
                + " area = " + calculateArea()
                + "}";
    }
}
