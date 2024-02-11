package auto;

public class Input {
    private String manufacturer;
    private String model;
    private int year;
    private int power;
    private String colour;
    private int price;

    Input (){
        {
manufacturer = "BMW";
model = "X7 M50i";
year = 2021;
power = 530;
colour = "White";
price = 10790000;
        }
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getPower() {
        return power;
    }

    public String getColour() {
        return colour;
    }

    public int getPrice() {
        return price;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    void printInfo() {
        System.out.println("************* Персональные данные *************");
        System.out.printf("Производитель: %s%n", this.manufacturer);
        System.out.printf("Название модели: %s%n", this.model);
        System.out.printf("Год выпуска: %d%n", this.year);
        System.out.printf("Мощность двигателя: %d л.с. %n", this.power);
        System.out.printf("Цвет машины: %s%n", this.colour);
        System.out.printf("Цена: %d%n", this.price);
        System.out.println("===============================================");
    }
}
