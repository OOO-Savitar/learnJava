import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String myName = "Памужак Петр Дмитриевич";

        int[] intArr = new int[] {2, 45, 13, -42, 63, 12, 43, 53, 12, 0, -4};

        System.out.println(myName);

        System.out.println("Исходный массив: " + Arrays.toString(intArr));
        System.out.println("Сумма: " + Arrays.stream(intArr).sum());
        System.out.println("Среднее: " + Arrays.stream(intArr).average().orElse(0));
    }
}