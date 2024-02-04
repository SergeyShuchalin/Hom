import java.util.Scanner;

public class DzSh6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 0, a, b, c, sum = 0;

        System.out.print("Введи числа, для выхода нажми 0: ");
        a = input.nextInt();
        if (a != 0) {
            b = a;
            c = a;
            if (a >= 1){
                i++;
            sum +=a;}
            do {
                System.out.print("Введи числа, для выхода нажми 0: ");
                a = input.nextInt();
                if (a > b) {
                    b = a;
                }
                if (a < c && a !=0) {
                    c = a;
                }
                if (a >= 1){
                    sum += a;
                    i++;
                }
            } while (a != 0);
            System.out.printf("Сумма целых положительных чисел = %d%nСреднее арифметическое = %.2f%nМинимальное значение = %d%nМаксимальное значение = %d", sum, (double)sum/i, c, b);

        }
        input.close();
    }
}