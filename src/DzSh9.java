import java.util.Scanner;
import java.util.Arrays;

public class DzSh9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int[] array = new int[10];
        int j, c;
        for (int i = 0; i < array.length; i++) {
            c = (int) (Math.random() * 10);
            for (j = 0; j < i; ) {
                if (c != array[j]) {
                    j++;
                } else {
                    c = (int) (Math.random() * 10);
                    j = 0;
                }
            }
            array[i] = c;
        }
        System.out.println(Arrays.toString(array));


        input.close();
    }
}
