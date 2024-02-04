import javax.swing.*;

public class DZSh2 {
    public static void main(String[] args) {

    String vvod;
    final int numf;

       vvod = JOptionPane.showInputDialog("Введите пятизначное число:");
       numf = Integer.parseInt(vvod);

    int num = numf;
    int a, b, c, d, e, sum, srar, pr; // sum - сумма цифр числа, srar - средне арифметическое, pr - произведение цифр числа

          System.out.printf("Введено число: %d %n", num);

      a = num%10;
       num /= 10;
      b = num%10;
       num /= 10;
      c = num%10;
        num /= 10;
      d = num%10;
        num /= 10;
      e = num%10;

        /*System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);*/

   pr = e * d * c * b * a;

   sum = e + d + c + b + a;

   srar = sum/5;

   // Вывод в окно
        JOptionPane.showMessageDialog(null,"Произведение цифр числа "+numf+ " = " +pr+
                "\n Сумма цифр числа " +numf+ " = " +sum+ "\n Средне арифметическое числа " +numf+ " = " +srar);

   // Вывод в консоль
        System.out.printf("Произведение цифр числа %d = %d %n", numf, pr);
        System.out.printf("Сумма цифр числа %d = %d %n", numf, sum);
        System.out.printf("Средне арифметическое числа %d = %d %n", numf, srar);

    }
}
