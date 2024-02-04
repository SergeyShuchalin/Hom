import java.util.Scanner;

public class DzSh15 {
    public static void main(String[] args) {
        //Задание 1: Переставить два слова записанные через пробел местами.
        Scanner input = new Scanner(System.in);
        System.out.println("Введите два слова через пробел: ");
        String text = input.nextLine();
        String[] str = text.split(" ");
        String res = nevText(text);
        System.out.println(res);
        //Задание 2: Замените в этой строке все появления буквы "о" на букву "О", кроме первого и последнего вхождения
        System.out.println("Введи строку: ");
        String text2 = input.nextLine();
        String res2 = nevText2(text2);
        System.out.println(res2);

    }

    public static String nevText(String text) {
        String[] str = text.split(" ");
        String s = str[0];
        str[0] = str[1];
        str[1] = s;
        String res = String.join(" ", str);
        return res;
    }

    public static String nevText2(String text) {
        String text2 = text.toLowerCase();
        char[] ch = text2.toCharArray();
        int j = 0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 'о') {
                j += 1;
            } else {
                text = ("В строке нет буквы \"о\"");
            }
        }

        for (int l = 0, k = 0; k < ch.length; k++) {
            if (ch[k] == 'о') {
                l += 1;
            }
            if (l > 1 && l < j && ch[k] == 'о') {
                ch[k] = 'О';
                text = new String(ch);
            }

        }
        return text;
    }
}

