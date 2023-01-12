package JavaCourse.Seminar6;

// 1. Реализуйте 1 из вариантов класса Cat из предыдущего задания, можно использовать не все придуманные поля и методы. 
// Создайте несколько экземпляров этого класса, выведите их в консоль.
// 2. Добейтесь того, чтобы при выводе в консоль объекта типа Cat, выводилась его кличка, цвет и возраст 
// (или другие параметры на ваше усмотрение).

public class task3 {
    public static void main(String[] args) {
        Cats cat1 = new Cats();
        cat1.age = 7;
        cat1.color = "black";
        cat1.name = "Barsik";

        System.out.println(cat1);
    }
}
