public class DZSh {
    public static void main (String[] args){
//Смена переменных местами без ввода дополнительной переменной
        //Вариант 1:
        int a = 7, b = 2;

        a = a + b;  //3
        b = a - b;  //1
        a = a - b;  // 2
        System.out.println("Вариант 1");
        System.out.println("a: " +a+ "\n" +"b: " +b);

        //Вариант 2:
        a = 7;
        b = 2;
        a += b - (b = a);
        System.out.println("Вариант 2");
        System.out.println("a: " +a+ "\n" +"b: " +b);

        //Вариант 3:
        a = 7;
        b = 2;
        a = (a + b) - (b = a);
        System.out.println("Вариант 3");
        System.out.println("a: " +a+ "\n" +"b: " +b);


//Смена переменных местами с помощью ввода дополнительной переменной:
        a = 7;
        b = 2;
        int c;
        c = a;
        a = b;
        b = c;
        System.out.println("Через дополнительную переменную");
        System.out.println("a: " +a+ "\n" +"b: " +b);

        int d = 15;
        int z;
        z = d << 1;
        System.out.println(z);





    }

}
