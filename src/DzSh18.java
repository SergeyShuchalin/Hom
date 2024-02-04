import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DzSh18 {
    public static void main(String[] args) {

        String s = "+7 499 456-45-78, +74994564578, 7 (499) 456 45 78, 7(499)456-45-78";
        String pattern = "[+?7\\d{10}\\s-()]+";
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(s);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }

        Scanner input = new Scanner(System.in);
        System.out.print("Введи количество символов: ");
        int k = input.nextInt();
        for (int i = 1; i <= k; i++) {
            for (int j = 1 +i; j <= k+i; j++) {
                if ((j & 1) == 0) {
                    System.out.print("X  ");
                } if ((j & 1) == 1){
                    System.out.print("O  ");
                }

            }
            System.out.println();
        }


    }
}

