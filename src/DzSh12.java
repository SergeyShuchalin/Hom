import java.util.Scanner;

public class DzSh12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        double c = 0.0;
        String text = "a";
        System.out.println("Вычисление площади фигур");
        System.out.print("Выберите тип фигуры:\n1 - треугольник\n2 - прямоугольник\n3 - круг\n0 - для завершения\nвведите № фигуры: ");
        n = input.nextInt();
        while (n != 0 && n != 1 && n != 2 && n != 3) {
            System.out.print("Введена не существующая фигура, введите верный № фигуры: ");
            n = input.nextInt();
        }
        while (true) {
            if (n == 1) {
                text = "треугольника = ";
                c = triangle(n);
            } else if (n == 2) {
                text = "прямоугольника = ";
                c = rectangle(n);
            } else if (n == 3) {
                text = "круга = ";
                c = circle(n);
            } else if (n == 0) {
                break;
            }
            System.out.printf("Площадь %s%.2f", text, c);
            System.out.print("\n\nВыбери тип фигуры:\n1 - треугольник\n2 - прямоугольник\n3 - круг\n0 - для завершения\nвведите № фигуры: ");
            n = input.nextInt();
        }
    }

    public static double triangle(double s) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите сторону a: ");
        double a = input.nextDouble();
        System.out.print("Введите сторону b: ");
        double b = input.nextDouble();
        System.out.print("Введите сторону c: ");
        double c = input.nextDouble();
        double p1 = (double) (a + b + c) / 2;
        s = Math.sqrt(p1 * (p1 - a) * (p1 - b) * (p1 - c));
        return s;
    }

    public static double rectangle(double s) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите сторону a: ");
        double a = input.nextDouble();
        System.out.print("Введите сторону b: ");
        double b = input.nextDouble();
        s = a * b;
        return s;
    }

    public static double circle(double s) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите радиус: ");
        double r = input.nextDouble();
        s = Math.pow(r, 2) * Math.PI;
        return s;
    }


}
