package lesson3;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        /*
        Заполнить список десятью случайными числами.
        Отсортировать список методом sort() и вывести его на экран.
         */
        ArrayList<Integer> arr1 = new ArrayList<>(10);
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            arr1.add(random.nextInt(10, 100));
        }
        System.out.println("Начальный список: "+arr1);
        Collections.sort(arr1);
        System.out.println("Отсортированный список: "+arr1);
        Collections.sort(arr1, Comparator.reverseOrder());
        System.out.println("Отсортированный список обратный: "+arr1);
    }

}
