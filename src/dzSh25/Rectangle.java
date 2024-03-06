package dzSh25;

public class Rectangle implements Resize {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }


    @Override
    public void width(int resize) {
        if (resize > 0 && resize < 1000) {
            this.width = resize;
        } else System.out.println(" Введи значение в диапазоне от 0 до 1000");
    }

    @Override
    public void height(int resize) {
        if (resize > 0 && resize < 1000) {
            this.height = resize;
        } else System.out.println(" Введи значение в диапазоне от 0 до 1000");
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }


}
