package dzSh21;

public class Main {
    public static void main(String[] args) {
        System.out.println("Площадь треугольника по формуле Герона (3,4,5): " + Formulas.triangle(3,4,5));
        System.out.println("Площадь треугольника через основание и высоту (6,7): " + Formulas.triangle(6,7));
        System.out.println("Площадь квадрата(7): " + Formulas.square(7));
        System.out.println("Площадь прямоугольника (2,6): " + Formulas.rectangle(2,6));
        System.out.println("Количество подсчётов площади: " + Formulas.getCount());



    }
}
