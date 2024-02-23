public class DzSh22 {
    public static void main(String[] args) {
        Student student = new Student("Виктор", "Вербов", "Gr111", 5, 1000);
        student.info();
        Aspirant aspirant1 = new Aspirant("Александр", "Невзоров", "Gr222", 4, "'Work1'", 2000);
        aspirant1.info();
        Aspirant aspirant2 = new Aspirant("Антон", "Бобров", "Gr333", 5,"'Work2'", 2000);
        aspirant2.info();
    }
}

class Student {
    private String name, lastName, group;
    private double averageRating, scholarship;


    public Student(String name, String lastName, String group, double averageRating, double scholarship) {
        if (averageRating >= 5)
            scholarship = 1000;
        else scholarship = 800;
        this.name = name;
        this.lastName = lastName;
        this.group = group;
        this.averageRating = averageRating;
        this.scholarship = scholarship;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public double getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(double averageRating) {
        this.averageRating = averageRating;
    }

    public double getScholarship() {
        return scholarship;
    }

    public void setScholarship(double scholarship) {
        this.scholarship = scholarship;
    }

    public void info() {
        System.out.print("\n" + this.name + " " + this.lastName + ", группа " + this.group + ", сумма стипендии: " + this.scholarship);

    }
}


class Aspirant extends Student {

    String works;

    public Aspirant(String name, String lastName, String group, double averageRating, String works, double scholarship1) {
        super(name, lastName, group, scholarship1, averageRating);
        if (averageRating >= 5)
            scholarship1 = 2000;
        else scholarship1 = 1800;
        this.works = works;
        this.scholarship1 = scholarship1;
    }

    double scholarship1;


    public void info() {
        System.out.print("\n" + getName() + " " + getLastName() + ", группа " + getGroup() + ", тема работы: " + works + ", сумма стипендии: " + scholarship1);
    }
}
