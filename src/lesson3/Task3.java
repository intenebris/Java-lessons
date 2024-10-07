package lesson3;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        /*
        Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
        Вывести название каждой планеты и количество его повторений в списке.
        Пройти по списку из предыдущего задания и удалить повторяющиеся элементы.
         */
        String[] planets = {"Neptune", "Mercury", "Venus", "Earth", "Mercury", "Mars", "Jupiter", "Earth", "Saturn", "Earth", "Uranus", "Neptune"};
        ArrayList<String> solar_sys = new ArrayList<>();
        solar_sys.addAll(Arrays.asList(planets));
        ArrayList<String> duplicates = new ArrayList<>();
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < solar_sys.size(); i++) {
            String planet = solar_sys.get(i);
            if (!duplicates.contains(planet)){
                duplicates.add(planet);
                int counter = 0;
                for (int j = 0; j < solar_sys.size(); j++) {
                    if(solar_sys.get(j).equals(planet)){
                        counter ++;
                    }
                }
                sb1.append(planet).append(" : ").append(counter).append("\n");
                if (counter == 1){
                    sb2.append(planet).append("\n");
                }
            }
        }
        System.out.println("List of planets:\n" + sb1);
        System.out.println("List of planets without duplicates:\n" + sb2);
        System.out.println("2nd method:\n" + delete(sb1));
        System.out.println("-------OTHER METHOD-------");
        System.out.println("Solution with use Map and Set:  "+PlanetsWithCount(solar_sys));
        System.out.println("Unique planets: " + getUniquePlanets(PlanetsWithCount(solar_sys)));

    }
    public static StringBuilder delete (StringBuilder sb){
        String temp = sb.toString();
        StringBuilder result = new StringBuilder();
        String[] strings = temp.split("\n");
        for (String string : strings) {
            if (string.contains("1")){
                result.append(string).append("\n");
            }

        }
        return result;
    }
    public static Map<String, Integer> PlanetsWithCount (ArrayList<String> planets){
        Map<String, Integer> result = new HashMap<>();
        Set<String> keys = result.keySet();
        for (String planet : planets) {
            int count = 0;
            if (!keys.contains(planet)){
                result.put(planet, ++count);
            } else {
                Integer value = result.get(planet);
                ++value;
                result.put(planet, value);
            }
        }
        return result;
    }

    public static Map<String, Integer> getUniquePlanets (Map<String, Integer> planets){
        Map<String, Integer> result = new HashMap<>();
        for (Map.Entry<String, Integer> entry : planets.entrySet()){
            if (entry.getValue() == 1){
                result.put(entry.getKey(), entry.getValue());
            }
        }
        return result;
    }
}
