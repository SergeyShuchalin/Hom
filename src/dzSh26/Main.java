package dzSh26;

public class Main {
    public static void main(String[] args) {
        System.out.println("Скорость самолета составляет " + Speed.AIRPLANE.getD() + " миль в час.\n");
        System.out.println("Скорости транспортных средств:\n");
        for (Speed s : Speed.values()) {
            System.out.println(s + " типичная скорость составляет " + s.getD() + " миль в час.");
        }

    }
}

enum Speed {
    Car(65), TRUCK(55), AIRPLANE(600), TRAIN(70), BOAT(22);

    private int d;

    Speed(int d) {
        this.d = d;
    }

    public int getD() {
        return d;
    }


}
