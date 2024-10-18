package lesson5;

import javax.swing.*;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.
 * 123456 Иванов
 * 321456 Васильев
 * 234561 Петрова
 * 234432 Иванов
 * 654321 Петрова
 * 345678 Иванов
 * Вывести данные по сотрудникам с фамилией Иванов.
 */

public class Passports {
    public static Map<Integer, String> immutableListOfPassports() {
        Map<Integer, String> listOfPassports = Map.of(
                123456, "Иванов",
                321456, "Васильев",
                234561, "Петрова",
                234432, "Иванов",
                654321, "Петрова",
                345678, "Иванов");
        return listOfPassports;
    }
    public static Map<Integer, String> addedListOfPassports(){
        Map<Integer, String> listOfPassports = new HashMap<>();
        listOfPassports.put(123456, "Иванов");
        listOfPassports.put(321456, "Васильев");
        listOfPassports.put(234561, "Петрова");
        listOfPassports.put(234432, "Иванов");
        listOfPassports.put(654321, "Петрова");
        listOfPassports.put(345678, "Иванов");
        return listOfPassports;
    }
    public static Map<Integer, String> linkedListofPassports(){
        Map<Integer, String> listOfPassports = new LinkedHashMap<>();
        listOfPassports.put(123456, "Иванов");
        listOfPassports.put(321456, "Васильев");
        listOfPassports.put(234561, "Петрова");
        listOfPassports.put(234432, "Иванов");
        listOfPassports.put(654321, "Петрова");
        listOfPassports.put(345678, "Иванов");
        return listOfPassports;
    }
    public static Map<Integer, String> sortedListofPassports(){
        Map<Integer, String> listOfPassports = new TreeMap<>();
        listOfPassports.put(123456, "Иванов");
        listOfPassports.put(321456, "Васильев");
        listOfPassports.put(234561, "Петрова");
        listOfPassports.put(234432, "Иванов");
        listOfPassports.put(654321, "Петрова");
        listOfPassports.put(345678, "Иванов");
        return listOfPassports;
    }

}
