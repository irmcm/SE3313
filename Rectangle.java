public class Rectangle extends TwoDimShapes implements Calculatable2D {

    double height;
    double width;

    public Rectangle(String nameOfShapes, double height, double width) {
        super(nameOfShapes);
        this.height=height;
        this.width=width;
    }

    @Override
    public double calculateArea() {
        return height*width;
    }

    @Override
    public double calculatePerimeter() {
        return 2*(height+width);
    }

    public String toString() {
        return "Rectangle{ perimeter = " + calculatePerimeter()
                + " area = " + calculateArea()
                + "}";
    }
}
