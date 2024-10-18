package lesson5;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        Map<Integer, String> immutableMap = Passports.immutableListOfPassports();
        Map<Integer, String> addedMap = Passports.addedListOfPassports();
        Map<Integer, String> linkedMap = Passports.linkedListofPassports();
        System.out.println("TreeMap: "+Passports.sortedListofPassports());
        System.out.println(addedMap);
        System.out.println("Entry set: "+addedMap.entrySet());
        for (Map.Entry<Integer, String> entry : addedMap.entrySet()) {
            if (entry.getValue().equals("Иванов")){
                System.out.println(entry);
            }
        }
    }
}
