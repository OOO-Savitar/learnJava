package Homework1302;

public class Cat {

    private String name;
    private String color;

    public Cat(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Cat() {

    }

    public String getName() {
        return name;
    }

    public Cat setName(String name) {
        this.name = name;
        return this;
    }

    public String getColor() {
        return color;
    }

    public Cat setColor(String color) {
        this.color = color;
        return this;
    }

    @Override
    public String toString() {
        return String.format("Имя кота: %s; Цвет кота: %s", this.name, this.color);
    }
}
