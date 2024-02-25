package dzSh24;

public class Pyramid extends Figure {
    public Pyramid(String title, int height, int a, int b) {
        super(title, height, a, b);
    }

    @Override
    public double volume() {
        return ((double) 1 / 3) * (double) getA() * getB() * getHeight();
    }

    @Override
    public void info() {
        super.info();
    }
}
