public class DzSh16 {
    public static void main(String[] args) {
        String text = "Java";
        System.out.println("Исходная строка - \"" + text + "\"");
        String tx = text.replace("a", "a!");
        System.out.println("Измененная строка - \"" + tx + "\"");

        System.out.println();

        System.out.println("Исходная строка - \"" + text + "\"");
        StringBuilder tx2 = new StringBuilder(text.replace("a", "a!"));
        System.out.println("Измененная строка - \"" + tx2 + "\"");


    }
}
