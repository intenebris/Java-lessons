package Homework;

import Homework.lesson4classes.DequeTasks;
import Homework.lesson4classes.LLTasks;
import Homework.lesson4classes.ListUtils;
import Homework.lesson4classes.MyStack;

import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class homework_lesson4 {
    public static void main(String[] args) {

        /**
         * Задание1. Удаление нечетных строк.
         * Дан LinkedList с несколькими элементами. В методе removeOddLengthStrings класса LLTasks
         * реализуйте удаление строк, длина которых нечетная. Используйте LinkedList и стандартные методы.
         */
        System.out.println("Задание 1");
        LinkedList<String> task1 = new LinkedList<>(); //Создаем  LinkedList
        task1.add("ночь"); // Добавляем элементы
        task1.add("улица");
        task1.add("фонарь");
        System.out.println(task1); //Проверяем заполнение списка
        LLTasks lt = new LLTasks();
        lt.removeOddLengthStrings(task1); // Удаляем нечетные строки
        System.out.println(task1); // Выводим результат
        System.out.println("\n");

        /**
         * Задача2. Реализация стека.
         * Реализуйте MyStack с использованием LinkedList с методами:
         * ● push(String element) - добавляет элемент на вершину стека
         * ● pop() - возвращает элемент с вершины и удаляет его
         * ● peek() -возвращает элемент с вершины, не удаляя
         * ● getElements() - возвращает все элементы стека
         */
        System.out.println("Задание 2");

        MyStack task2 = new MyStack();
        task2.push("Первый"); // добавляем элемент на вершину стека
        task2.push("Второй");
        task2.push("Третий");
        System.out.println(task2); // Выводим результат
        System.out.println(task2.pop()); //возвращаем элемент с вершины и удаляем его
        System.out.println(task2.getElements()); //возвращает все элементы стека
        System.out.println(task2.pop());
        System.out.println(task2.peek()); //возвращаем элемент с вершины, не удаляя
        System.out.println(task2.peek());
        System.out.println("\n");

        /**
         * Задача3. Количество вхождений слова.
         * Реализуйте метод countOccurrences в классе ListUtils, который принимает LinkedList<String>
         * и строку, и возвращает количество вхождений строки в список.
         */
        System.out.println("Задание 3");
        LinkedList<String> example = new LinkedList<>(); //Создаем  LinkedList
        example.add("котики"); // Добавляем элементы
        example.add("собачки");
        example.add("котики");
        example.add("птички");
        example.add("котики");
        example.add("птички");
        String str = "птички";
        System.out.println(example); // Выводим результат
        ListUtils task3 = new ListUtils();
        System.out.println("Количество вхождений строки '"+str+"' в список: " + task3.countOccurrences(example, str));
        System.out.println("\n");

        /**
         * Задача4. Сдвиг очереди.
         * Реализуйте метод rotateDeque в классе DequeTasks, который принимает Deque<Integer> и число n.
         * Метод должен повернуть очередь вправо на n позиций. Если n отрицательное, повернуть влево.
         */
        System.out.println("Задание 4");
        Deque<Integer> task4 = new LinkedList<>();
        task4.addLast(1);
        task4.addLast(2);
        task4.addLast(3);
        task4.addLast(4);
        task4.addLast(5);
        System.out.println("Начальная очередь "+task4);
        DequeTasks deq = new DequeTasks();
        System.out.println(deq.rotateDeque(task4, 1)); //Повернули очередь вправо
        System.out.println(deq.rotateDeque(task4, -2)); //Повернули очередь влево
        System.out.println("\n");


        /**
         * Задача5*. Удаление слова из очереди.
         * Реализуйте метод removeAllOccurrences в классе DequeTasks, который принимает
         * Deque<String> и строку value. Метод должен удалить все вхождения строки value из очереди.
         */
        System.out.println("Задание 5*");
        Deque<String> example2 = example;
        System.out.println(example2); //Начальная очередь для примера
        DequeTasks task5 = new DequeTasks();
        System.out.println(task5.removeAllOccurrences(example2, "котики"));//Выводим результат

    }


}
