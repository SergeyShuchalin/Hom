package dzSh24;

public class Cylinder extends Figure{
    public Cylinder(String title, int radius, int height) {
        super(title, radius, height);
    }

    @Override
    public double volume() {
        return Math.PI * Math.pow(getRadius(), 2)*getHeight();
    }

    @Override
    public void info() {
        super.info();
    }
}
