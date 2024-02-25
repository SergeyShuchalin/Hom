package dzSh24;

public class Ball extends Figure {
    public Ball(String title, int radius) {
        super(title, radius);
    }

    @Override
    public double volume() {
        return ((double) 4 / 3) * Math.PI * Math.pow(getRadius(), 3);
    }

    @Override
    public void info() {
        super.info();
    }
}

