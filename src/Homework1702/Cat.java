package Homework1702;

public class Cat {
    private String name;
    private String color = "серый";
    private int age = 0;
    private static int catCount;

    public Cat(String name) {
        this.name = name;
        catCount++;
    }

    public Cat(String name, String color) {
        this.name = name;
        this.color = color;
        catCount++;
    }

    public Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
        catCount++;
    }

    public static int getAllCatsCount() {
        return catCount;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Кличка='" + name + "' " +
                "Цвет='" + color + "' " +
                "Возраст=" + age + "\n";
    }
}
