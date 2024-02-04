import java.util.Scanner;
import java.util.Arrays;

public class DzSh8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, a;
        int[] arrey;
        System.out.print("Введите длину массива: ");
        n = input.nextInt();

        arrey = new int[n];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < arrey.length; i++) {
            System.out.print("-> ");
            arrey[i] = input.nextInt();
        }
        a = arrey[0];
        for (int i = 0; i < arrey.length; i++) {
            if (arrey[i] > a) {
                a = arrey[i];
                System.out.print(a+ " ");
            } else {
                a = arrey[i];
            }

        }
        System.out.println();
        System.out.println(Arrays.toString(arrey));


        input.close();
    }
}
