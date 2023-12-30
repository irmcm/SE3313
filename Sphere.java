public class Sphere extends ThreeDimShapes implements Calculatable2D, Calculatable3D {

    double radius;
    final double pi=3.14;

    public Sphere(String nameOfShapes, double radius) {
        super(nameOfShapes);
        this.radius=radius;
    }

    @Override
    public double calculateVolume() {
        return (4/3)*pi*radius*radius*radius;
    }

    @Override
    public double calculateArea() {
        return 4*pi*radius*radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2*pi*radius;
    }

    public String toString() {
        return "Sphere{ perimeter = " + calculatePerimeter()
                + " area = " + calculateArea()
                + " volume= "+ calculateVolume()
                + "}";
    }
}
