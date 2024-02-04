import java.util.Scanner;

public class DZSh5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, c = 0;
        System.out.print("Который час? ");
        a = input.nextInt();

// Вариант 1
        if (a >= 0 && a <= 5 || a == 24) {
            c = 1;}
        else if (a >= 6 && a <= 12) {
            c = 2;
        }
        else if (a >= 13 && a <= 16) {
            c = 3;
                    }
        else if (a >= 17 && a <= 23) {
            c = 4;
        }
        String b = switch (c) {
            case 1 -> "Доброй ночи!";
            case 2 -> "Доброе утро!";
            case 3 -> "Добрый день!";
            case 4 -> "Добрый вечер!";
            default -> "Вы ввели неверное значение в сутках 24 часа";
        };
        System.out.println("Вариант 1:");
        System.out.println(b+ "\n");

//Вариант 2
        String d = switch (a) {
            case 24, 0, 1, 2, 3, 4, 5 -> "Доброй ночи!";
            case 6, 7, 8, 9, 10, 11, 12 -> "Доброе утро!";
            case 13, 14, 15, 16 -> "Добрый день!";
            case 17, 18, 19, 20, 21, 22, 23 -> "Добрый вечер!";
            default -> "Вы ввели неверное значение в сутках 24 часа";
        };
        System.out.println("Вариант 2:");
        System.out.println(d+ "\n");
//Вариант 3
        String e = switch (a >= 0 && a <= 5 || a == 24 ? 1 :
                           a >= 6 && a <= 12 ? 2 :
                           a >= 13 && a <= 16? 3 :
                           a >= 17 && a <= 23 ? 4 : 0) {
            case 1 -> "Доброй ночи!";
            case 2 -> "Доброе утро!";
            case 3 -> "Добрый день!";
            case 4 -> "Добрый вечер!";
            default -> "Вы ввели неверное значение в сутках 24 часа";
        };
        System.out.println("Вариант 3:");
        System.out.println(e);



input.close();
    }
}
