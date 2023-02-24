package Classwork.task003;

// 3.	Заменить некратные 3 элементы списка, суммой нечетных элементов.
import java.util.Arrays;
import java.util.LinkedList;

public class Task003 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0)
                sum += list.get(i);
        }
        System.out.println("Сумма четных элементов = " + sum);
    }
}