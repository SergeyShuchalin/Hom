package dzSh23;

public class Figure {
    private int width;
    private int height;


    public Figure(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public double getAria() {
        return 0.0;
    }


    void info() {
        System.out.println("Площадь фигуры не определена: " + getAria());
    }
}
