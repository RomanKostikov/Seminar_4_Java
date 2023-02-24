package Homework.task001;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * Вывести список на экран в перевернутом виде (без массивов и ArrayList)
 * Пример:
 * 1 -> 2->3->4
 * Вывод:
 * 4->3->2->1
 */
public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1, 2, 3, 4));
        for (int i = 0; i < list.size() - 1; i++) {
            int temp = list.pollLast();
            list.add(i, temp);
        }
        System.out.println(list);
    }
}
