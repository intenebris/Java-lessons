package Homework;

import Homework.lesson5classes.BrowserHistory;
import Homework.lesson5classes.ShoppingBasket;
import Homework.lesson5classes.Students;

import java.util.*;

public class homework_lesson5 {
    public static void main(String[] args) {
        /**
         * Задание 1. Студенческий справочник.
         * Реализуйте программу для работы с простым справочником студентов.
         * Программа должна иметь следующие функции:
         * addStudent(String name, Integer grade)
         * findStudent(String name)
         * getAllStudents()
         * removeStudent(String name)
         */

        Map<Students, Integer> gradeList = new HashMap<>();
        addStudent(gradeList, 100, "Смирнов Олег Павлович", 5);
        addStudent(gradeList, 101, "Климова Анна Сергеевна", 4);
        addStudent(gradeList, 102, "Пушкин Александр Сергеевич", 5);
        addStudent(gradeList, 103, "Смирнов Олег Иванович", 3);
        System.out.println(gradeList);
        System.out.println(findStudentById(gradeList, 100));
        removeStudent(gradeList, 102);
        System.out.println(getAllStudents(gradeList));


        /**
         * Задача2. История посещения веб-сайтов.
         * Реализуйте программу для хранения и анализа историй посещений веб-сайтов.
         * Используйте Deque для хранения истории.
         * ● visitSite(String site):Добавляет сайт в историю посещений.
         * ● back(int steps):Возвращает название сайта, который был посещен steps назад, или null, если таких шагов нет.
         * ● getHistory():Возвращает список сайтов в истории посещений, от последнего посещенного к первому.
         */

        BrowserHistory.visitSite("google.com");
        BrowserHistory.visitSite("stackoverflow.com");
        BrowserHistory.visitSite("github.com");
        BrowserHistory.visitSite("gb.ru");
        System.out.println(BrowserHistory.getHistory());
        System.out.println(BrowserHistory.back(2));

        /**
         * Задача3. Подсчет продуктов в корзине
         * Создайте программу для учета продуктов в корзине.
         * Программа должна позволять добавлять, удалять, обновлять количество продуктов, а также
         * проверять наличие продуктов в корзине. Используйте HashMap для хранения продуктов и их количества.
         */

        ShoppingBasket.addProduct("apple", 3);
        ShoppingBasket.addProduct("banana", 2);
        ShoppingBasket.addProduct("apple", 2);
        ShoppingBasket.addProduct("grape", 4);
        ShoppingBasket.showBasket();
        ShoppingBasket.removeProduct("grape");
        ShoppingBasket.removeProduct("orange");
        ShoppingBasket.updateQuantity("banana", 8);
        ShoppingBasket.showBasket();
        System.out.println(ShoppingBasket.checkProduct("apple"));
        System.out.println(ShoppingBasket.checkProduct("orange"));

        /**
         * Задача4. Сортировка слиянием.
         * Напишите программу, которая реализует сортировку слиянием.
         * Программа должна содержать два основных метода:
         * merge для объединения двух отсортированных массивов в один отсортированный, и
         * mergeSort для сортировки массива с использованием сортировки слиянием.
         */
    }

    /** Ниже описаны методы решения всех задач. Выполнение выше в классе main **/
    // Task 1.
    public static void addStudent(Map<Students, Integer> directory, int id, String name, Integer grade){
        directory.put(new Students(id, name), grade);
    }
    public static void removeStudent(Map<Students, Integer> directory, int id){
        for (Map.Entry<Students, Integer> entry : directory.entrySet()){
            if (entry.getKey().toString().contains(""+id)){
                directory.remove(entry.getKey());
            }
        }
    }
    public static ArrayList<Integer> findStudentById(Map<Students, Integer> directory, int id){
        ArrayList<Integer> result = new ArrayList<>();
        for (Map.Entry<Students, Integer> entry : directory.entrySet()){
            if (entry.getKey().toString().contains(""+id)){
                result.add(directory.get(entry.getKey()));
            }
        }
        return result;
    }
    public static HashMap<Students, Integer> getAllStudents(Map<Students, Integer> directory){
        HashMap<Students, Integer> result = new HashMap<>();
        result.putAll(directory);
        return result;
    }


}
