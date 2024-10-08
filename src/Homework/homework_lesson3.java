package Homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class homework_lesson3 {
    public static void main(String[] args) {
        /*
        Задание1. Удаление отрицательных значений из массива
        Реализуйте метод, который принимает на вход целочисленный массив и
        удаляет все отрицательные числа.
        Метод должен вернуть массив, содержащий только неотрицательные числа.
        Пример: [-1,2,-3,4,-5,6] Результат: [2,4,6]
         */
        int[] arrTask1 = {-1,2,-3,4,-5,6};
        System.out.println("Задание1. Массив, содержащий только неотрицательные числа:\n"+getPositiveInt(arrTask1)+"\n");

        /*
        Задача2. Уникальные числа
        Напишите метод, который принимает целочисленный массив и возвращает новый массив,
        содержащий только уникальные элементы из исходного массива.
        Пример: [1,2,2,3,4,4,5] Результат: [1,2,3,4,5]
         */
        int[] arrTask2 = {1,2,2,3,4,4,5};
        System.out.println("Задача2. Уникальные элементы из исходного массива:\n" + getUniqueElements(arrTask2)+"\n");

        /*
        Задача3. Длина слов
        Реализуйте метод, который принимает на вход массив строк и возвращает новый массив,
        содержащий только строки, длина которых больше 3 символов.
        Пример: ["cat","elephant","dog","giraffe"] Результат: ["elephant","giraffe"]
         */
        String[] animals = {"cat","elephant","dog","giraffe"};
        System.out.println("Задача3: Массив строк, длина которых больше 3 символов:\n" + getAnimalsWithShortName(animals, 3)+"\n");

        /*
        Задача4*. Среднее значение массива
        Напишите метод, который принимает массив целых чисел и возвращает
        среднее значение элементов массива, округленное до ближайшего целого числа.
        Пример: [4,2,7,5,1] Результат: 4
         */
        int[] arrTask4 = {4,2,7,5,1};
        System.out.println("Задача4. Среднее значение элементов массива: " + getArithmeticMean(arrTask4));
    }

    public static ArrayList<Integer> getPositiveInt (int[] arr){
        ArrayList<Integer> result = new ArrayList<>(0);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0){
                result.add(arr[i]);
            }
        }
        return result;
    }

    public static List<Integer> getUniqueElements (int[] arr){
        List<Integer> result = Arrays.stream(arr).distinct().boxed().toList();
        return result;

    }

    public static ArrayList<String> getAnimalsWithShortName (String[] arr, int num){
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > num){
                result.add(arr[i]);
            }
        }
        return result;
    }

    public static int getArithmeticMean (int[] arr){
        int result = 0;
        float sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        result = Math.round(sum/arr.length);
        return result;
    }
}
