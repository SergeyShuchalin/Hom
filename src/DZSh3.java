import java.util.Scanner;

public class DZSh3 {
    public static void main(String[] args) {
        Scanner scanNumber = new Scanner(System.in);
        Scanner scanText = new Scanner(System.in);
// Знакомство
            System.out.print("Ваше Имя? ");
            String nam = scanText.nextLine();
            System.out.print("Сколько вам лет? ");
            int age = scanNumber.nextInt();
            System.out.print("Где вы живете? ");
            String city = scanText.nextLine();

// Тест

        // Блок переменных
        int sum;
        sum = 0;
        String textByte, textShort, textInt, textLong, textFloat, textDouble;


        // Логика
        System.out.println(nam+ " давай пройдём небольшой тест на знание размера памяти примитивных типов, если ты готов для продолжения нажми \"enter\"");
        String i = scanText.nextLine();
        System.out.print("Вопрос 1: \nСколько переменная типа byte занимает памяти в битах? ");
        byte vByteBit = scanNumber.nextByte();

           if (vByteBit == 8)
           {
               sum += 1;
               textByte = "Ваш ответ " +vByteBit+ ", верно ";
           }
           else
           {
                sum += 0;
                textByte = "Ваш ответ " +vByteBit+ ", НЕ верно, переменной типа byte занимает 8 бит памяти";
           }

        System.out.print("Вопрос: 2 \nСколько переменная типа short занимает памяти в битах? ");
        short vShortBit = scanNumber.nextShort();
             if (vShortBit == 16)
            {
                sum += 1;
                textShort = "Ваш ответ " +vShortBit+ ", верно ";
            }
            else
            {
                sum += 0;
                textShort = "Ваш ответ " +vShortBit+ ", НЕ верно, переменной типа short занимает 16 бит памяти";
            }
        System.out.print("Вопрос 3: \nСколько переменная типа int занимает памяти в битах? ");
        int vIntBit = scanNumber.nextInt();
        if (vIntBit == 32)
        {
            sum += 1;
            textInt = "Ваш ответ " +vIntBit+ ", верно ";
        }
        else
        {
            sum += 0;
            textInt = "Ваш ответ " +vIntBit+ ", НЕ верно, переменной типа int занимает 32 бита памяти";
        }
        System.out.print("Вопрос 4: \nСколько переменная типа long занимает памяти в битах? ");
        long vLongBit = scanNumber.nextLong();
        if (vLongBit == 64)
        {
            sum += 1;
            textLong = "Ваш ответ " +vLongBit+ ", верно ";
        }
        else
        {
            sum += 0;
            textLong = "Ваш ответ " +vLongBit+ ", НЕ верно, переменной типа long занимает 64 бита памяти";
        }
        System.out.print("Вопрос 5: \nСколько переменная типа float занимает памяти в битах? ");
        float vFloatBit = scanNumber.nextFloat();
        if (vFloatBit == 32)
        {
            sum += 1;
            textFloat = "Ваш ответ " +(int)vFloatBit+ ", верно ";
        }
        else
        {
            sum += 0;
            textFloat = "Ваш ответ " +(int)vFloatBit+ ", НЕ верно, переменной типа float занимает 32 бита памяти";
        }
        System.out.print("Вопрос 6: \nСколько переменная типа double занимает памяти в битах? ");
        double vDoubleBit = scanNumber.nextDouble();
        if (vDoubleBit == 64)
        {
            sum += 1;
            textDouble = "Ваш ответ " +(int)vDoubleBit+ ", верно ";
        }
        else
        {
            sum += 0;
            textDouble = "Ваш ответ " +(int)vDoubleBit+ ", НЕ верно, переменной типа double занимает 64 бита памяти";
        }
        // Результат прохождения теста
        System.out.println();
        System.out.println(nam+ " вы ответили верно на " +sum+ " вопросов из 6");
        System.out.println("Для того чтобы увидеть результаты нажми \"enter\"");
        String i2 = scanText.nextLine();
        System.out.printf("Вот ваши ответы:%nВопрос 1: %s%nВопрос 2: %s%nВопрос 3: %s%nВопрос 4: %s%nВопрос 5: %s%n" +
                "Вопрос 6: %s%n", textByte, textShort, textInt, textLong, textFloat, textDouble);

        // Таблица примитивных типов
        System.out.println();
        System.out.printf("|----------------------------------------------------------------------------------------------|%n");
        System.out.printf("| %29s%27s%36s |%n","", "Примитивные типы Java", "");
        System.out.printf("|----------------------------------------------------------------------------------------------|%n");
        System.out.printf("| %-8s | %2s%-16s | %-10s| %20s%-28s | %n", "Тип","", "Размер памяти", "Оболочка", "", "Диапазон");
        System.out.printf("|----------------------------------------------------------------------------------------------|%n");
        System.out.printf("| %-8s | %2d%-7s%d%-8s | %-10s| %4s%-5d%s%-36d | %n", "byte", Byte.BYTES," байт (", Byte.SIZE, " бит)", "Byte", "от ", Byte.MIN_VALUE, "до ", Byte.MAX_VALUE);
        System.out.printf("| %-8s | %2d%-7s%d%-7s | %-10s| %4s%-6d%s%-34d | %n", "short", Short.BYTES," байт (", Short.SIZE, " бит)", "Short", "от ", Short.MIN_VALUE, " до ", Short.MAX_VALUE);
        System.out.printf("| %-8s | %2d%-7s%d%-7s | %-10s| %4s%-11d %s%-29d | %n", "int", Integer.BYTES," байт (", Integer.SIZE, " бит)", "Integer", "от ", Integer.MIN_VALUE, "до ", Integer.MAX_VALUE);
        System.out.printf("| %-8s | %2d%-7s%d%-7s | %-10s| %-3s%-21d%3s%-20d | %n", "long", Long.BYTES," байт (", Long.SIZE, " бит)", "Long", " от ", Long.MIN_VALUE, "до ", Long.MAX_VALUE);
        System.out.printf("| %-8s | %2d%-7s%d%-7s | %-10s| %4s%8.2e%s%-32.2e | %n", "float", Float.BYTES," байт (", Float.SIZE, " бит)", "Float", "от ", Float.MIN_VALUE, " до ", Float.MAX_VALUE);
        System.out.printf("| %-8s | %2d%-7s%d%-7s | %-10s| %4s%9.2e%s%-31.2e | %n", "double", Double.BYTES," байт (", Double.SIZE, " бит)", "Double", "от ", Double.MIN_VALUE, " до ", Double.MAX_VALUE);
        System.out.printf("|----------------------------------------------------------------------------------------------|%n");

        scanNumber.close();
        scanText.close();
    }
}
