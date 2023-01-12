package JavaCourse.Seminar6;

public class Cats {
    int id;
    String name;
    String breed;
    String color;
    String owner;
    int age;

    @Override
    public String toString() {
        return String.format("Кличка: %s, цвет: %s, возраст: %d", name, color, age);
    }
}
