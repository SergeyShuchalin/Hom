package dzSh23;

public class Main {
    public static void main(String[] args) {
        Figure[] arr = new Figure[3];
        arr[0] = new Figure(10, 20);
        arr[1] = new Rectangle(10, 20);
        arr[2] = new Triangle(10, 20);
        for (int i = 0; i < arr.length; i++) {
            arr[i].info();

        }

    }
}

