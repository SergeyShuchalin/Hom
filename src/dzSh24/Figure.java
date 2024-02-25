package dzSh24;

public class Figure {
    private String title;
    private int radius;
    private int height;
    private int a;
    private int b;

    public String getTitle() {
        return title;
    }

    public int getRadius() {
        return radius;
    }

    public int getHeight() {
        return height;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public Figure(String title, int radius, int height) {
        this.title = title;
        this.radius = radius;
        this.height = height;
    }

    public Figure(String title, int height, int a, int b) {
        this.title = title;
        this.height = height;
        this.a = a;
        this.b = b;
    }

    public Figure(String title, int radius) {
        this.title = title;
        this.radius = radius;
    }

    public double volume() {
        return volume();
    }
    public void info(){
        System.out.printf("Фигура: %-9s| Объем фигуры: %.2f%n", this.title, volume());
    }
}

