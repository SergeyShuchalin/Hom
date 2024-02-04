import java.util.Scanner;

public class DzSh7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введи размер треугольника: ");
        int c = input.nextInt();
        int i = 0;
        while (i < c - 1) {
            int j = 0;
            while (j < i) {
                if (j == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                j++;
            }
            System.out.println("*");
            i++;
        }
        while (i < c * 2 - 1) {
            System.out.print("*");
            i++;
        }
    }
}

