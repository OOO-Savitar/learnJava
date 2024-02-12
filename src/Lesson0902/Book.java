package Lesson0902;

public class Book implements Printable{
    private String name;
    private String author;


    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public Book() {

    }

    @Override
    public void print() {
        System.out.printf("Автор: %s; Кника: %s", author, name);
    }
}
