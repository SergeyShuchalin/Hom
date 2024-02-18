package dzSh21;

public class Formulas {
    static int count;

    public static double triangle(int a, int b, int c) {
        double p = (a + b + c) / 2.0;
        count++;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static double triangle(int a, int h) {
        count++;
        return (a * h) / 2.0;
    }

    public static int square(int a) {
        count++;
        return a * a;
    }

    public static int rectangle(int a, int b) {
        count++;
        return a * b;
    }

    public static void setCount(int count) {

        Formulas.count = count;
    }

    public static int getCount() {

        return count;
    }
}

