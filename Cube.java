public class Cube extends ThreeDimShapes implements Calculatable3D {

    double edge;

    public Cube(String nameOfShapes, double edge) {
        super(nameOfShapes);
        this.edge=edge;
    }

    @Override
    public double calculateVolume() {
        return edge*edge*edge;
    }

    public String toString() {
        return "Cube{ volume = " + calculateVolume()
                + "}";
    }
}
