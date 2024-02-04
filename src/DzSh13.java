import java.util.Scanner;

public class DzSh13 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        mas (3, 8, 9, 4, 1, 2, 5);
        mas (1, 2, 5);

    }

    public static void mas(int... n) {
        int max = Integer.MIN_VALUE;
        for (int i : n) {
            if (i > max) {
                max = i;
            }
        }
        System.out.println(max);
    }
}
