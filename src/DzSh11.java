import java.util.Scanner;

public class DzSh11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        double s;
        System.out.println("Вычисление площади фигур \n");
        System.out.print("Выбери тип фигуры:\n1 - треугольник\n2 - прямоугольник\n3 - круг\n0 - для завершения\nвведите № фигуры: ");
        n = input.nextInt();
        while (n != 0 && n != 1 && n != 2 && n != 3) {
            System.out.print("Введена не существующая фигура, введите верный № фигуры: ");
            n = input.nextInt();
        }
        while (true) {
            if (n == 1) {
                System.out.print("Введи сторону a: ");
                double a = input.nextDouble();
                System.out.print("Введи сторону b: ");
                double b = input.nextDouble();
                System.out.print("Введи сторону c: ");
                double c = input.nextDouble();
                double p1 = (double) (a + b + c) / 2;
                s = Math.sqrt(p1 * (p1 - a) * (p1 - b) * (p1 - c));
                System.out.printf("Площадь треугольника = %.2f", s);
            } else if (n == 2) {
                System.out.print("Введи сторону a: ");
                double a = input.nextDouble();
                System.out.print("Введи сторону b: ");
                double b = input.nextDouble();
                s = a * b;
                System.out.printf("Площадь прямоугольника = %.2f", s);
            } else if (n == 3) {
                System.out.print("Введи радиус окружности: ");
                double r = input.nextDouble();
                s = Math.pow(r, 2) * Math.PI;
                System.out.printf("Площадь окружности = %.2f", s);
            } else if (n == 0) {
                break;
            }
            System.out.print("\n\nВыбери тип фигуры:\n1 - треугольник\n2 - прямоугольник\n3 - круг\n0 - для завершения\nвведите № фигуры: ");
            n = input.nextInt();


        }


    }
}
