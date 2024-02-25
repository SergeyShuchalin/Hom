package dzSh23;

public class Triangle extends Figure {
    public Triangle(int width, int height) {
        super(width, height);
    }

    @Override
    public double getAria() {
        return (getHeight() * (double) getWidth()) / 2;
    }

    @Override
    void info() {
        System.out.println("Площадь треугольника: " + getAria());
    }
}
