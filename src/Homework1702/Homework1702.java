package Homework1702;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Homework1702 {
    public void run() {
        List<Cat> catList = Arrays.asList(
                new Cat("Барсик"),
                new Cat("Рыжик", "белый"),
                new Cat("Кузя", "черный", 1),
                new Cat("Вася", "оранжевый"),
                new Cat("Бобик"),
                new Cat("Пушок", "серо-буро-малиновый"),
                new Cat("Лапка"),
                new Cat("Аркадий", "черный", 3),
                new Cat("Шарик", "серый", 5),
                new Cat("Зяблик", "белый")
        );

        System.out.printf("Всего котов: %s\n", Cat.getAllCatsCount());
        System.out.println("\nВсе коты: \n" + catList);

        System.out.println("\nОтсортировано по имени: \n" + catList.stream()
                .sorted(Comparator.comparing(cat -> cat.getName()))
                .toList());

        System.out.println("\nОтсортировано по возрасту: \n" + catList.stream()
                .sorted(Comparator.comparing(cat -> cat.getAge()))
                .toList());
    }
}
