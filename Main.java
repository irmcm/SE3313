import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle("Cirlce", 10.0);
        Rectangle rectangle1 = new Rectangle("Rectangle", 6.0, 8.0);
        Cube cube1 = new Cube("Cube", 4.0);
        Sphere sphere1 = new Sphere("Sphere", 3.0);

        ArrayList<Shape> shape = new ArrayList<>();
        shape.add(circle1);
        shape.add(rectangle1);
        shape.add(cube1);
        shape.add(sphere1);

        for (int i = 0; i < shape.size(); i++) {
            System.out.println(shape.get(i));
        }
    }
}