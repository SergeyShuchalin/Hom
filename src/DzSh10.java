import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class DzSh10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = 6, b = 6;
        int[][] mas = new int[a][b];
        int[] mas1 = new int[a];

        System.out.println("Двумерный массив:");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                mas[i][j] = (int) (Math.random() * 11);
                System.out.print(mas[i][j] + " ");
                if (mas[i][j] < 10) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println("Одномерный массив:");
        for (int i = 0; i < a; i++) {
            mas1[i] = (int) (Math.random() * 11);
            System.out.print(mas1[i] + " ");
            if (mas1[i] < 10) {
                System.out.print(" ");
            }
        }
        System.out.println();
        System.out.println();

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if (i % 2 == 1) {
                    mas[i][j] = mas1[j];
                }
                System.out.print(mas[i][j] + " ");
                if (mas[i][j] < 10) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


        input.close();
    }
}
