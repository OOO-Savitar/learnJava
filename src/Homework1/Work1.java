package Homework1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Work1 {
    public static void print() {
        String myName = "Памужак Петр Дмитриевич";

        int[] intArr = new int[]{2, 45, 13, -42, 63, 12, 43, 53, 12, 0, -4};
        List<Integer> intList = IntStream.rangeClosed(1, 10).boxed().collect(ArrayList::new, ArrayList::add, ArrayList::addAll);

        System.out.println("Работа с array:");
        System.out.println("Исходный массив: " + Arrays.toString(intArr));
        System.out.println("Сумма: " + Arrays.stream(intArr).sum());
        System.out.println("Среднее: " + Arrays.stream(intArr).average().orElse(0));
        System.out.println("\nРабота с List:");
        System.out.println("Исходный лист: " + intList);
        System.out.println("Сумма: " + intList.stream().mapToInt(Integer::intValue).sum());
        System.out.println("Среднее: " + intList.stream().mapToInt(Integer::intValue).average().orElse(0));
        System.out.println();

        System.out.println(myName);
    }
}
