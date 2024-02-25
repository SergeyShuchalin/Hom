package dzSh23;

public class Rectangle extends Figure {
    public Rectangle(int width, int height) {
        super(width, height);
    }

    @Override
    public double getAria() {
        return getHeight() * (double) getWidth();
    }

    @Override
    void info() {
        System.out.println("Площадь прямоугольника: " + getAria());
    }
}
