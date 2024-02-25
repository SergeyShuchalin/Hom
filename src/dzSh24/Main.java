package dzSh24;

public class Main {
    public static void main(String[] args) {
Figure[] figure = new Figure[3];
figure[0] = new Ball("шар", 4);
figure[1] = new Cylinder("цилиндр", 4, 4);
figure[2] = new Pyramid("пирамида", 10, 10, 10);
        for (int i = 0; i < figure.length; i++) {
            figure[i].info();

        }
    }
}
