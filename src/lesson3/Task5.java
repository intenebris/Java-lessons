package lesson3;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        /*
        Каталог товаров книжного магазина сохранен в виде двумерного списка List<ArrayList<String>> так,
        что на 0-й позиции каждого внутреннего списка содержится название жанра,
        а на остальных позициях - названия книг.
        Напишите метод для заполнения данной структуры.
         */
        ArrayList<String> prose = new ArrayList<>();
        ArrayList<String> poetry = new ArrayList<>();
        ArrayList<String> doc = new ArrayList<>();
        prose.add("Проза");
        prose.add("Война и мир");
        prose.add("12 стульев");
        poetry.add("Поэзия");
        poetry.add("Бородино");
        doc.add("Док");
        doc.add("Java. Clear code");

        complateList(prose);
        complateList(poetry);
        complateList(doc);

        System.out.println(library);


    }
    public static List<ArrayList<String>> library = new ArrayList<>();
    public static void complateList (ArrayList<String> books){
        library.add(books);
    }
}
