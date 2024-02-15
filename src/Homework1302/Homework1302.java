package Homework1302;

import java.util.*;

public class Homework1302 {

    public void run() {
//        List<String> list = new ArrayList<String>();
//        Scanner scanner = new Scanner(System.in);
//
//        while (true) {
//            String string = scanner.nextLine();
//            if (string.equalsIgnoreCase("end")) break;
//            else list.add(string);
//        }
//        System.out.println(list);

        Map<String, Cat> cats = new HashMap<>();

        Cat cat1 = new Cat("Барсик", "Рыжий");
        Cat cat2 = new Cat("Кузя", "Черный");
        Cat cat3 = new Cat("Вася", "Белый");
        Cat cat4 = new Cat("Бобик", "Рыжий");
        Cat cat5 = new Cat("Пушок", "Серый");
        Cat cat6 = new Cat("Лапка", "Черный");
        Cat cat7 = new Cat("Аркадий", "Рыжий");
        Cat cat8 = new Cat("Шарик", "Белый");
        Cat cat9 = new Cat("Борбоска", "Белый");
        Cat cat10 = new Cat("Зяблик", "Черный");

        cats.put(cat1.getName(), cat1);
        cats.put(cat2.getName(), cat2);
        cats.put(cat3.getName(), cat3);
        cats.put(cat4.getName(), cat4);
        cats.put(cat5.getName(), cat5);
        cats.put(cat6.getName(), cat6);
        cats.put(cat7.getName(), cat7);
        cats.put(cat8.getName(), cat8);
        cats.put(cat9.getName(), cat9);
        cats.put(cat10.getName(), cat10);

        System.out.println(cats.keySet());
        System.out.println();
        cats.values().forEach(System.out::println);
    }
}
