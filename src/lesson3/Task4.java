package lesson3;

import java.util.ArrayList;
import java.util.Objects;

public class Task4 {
    public static void main(String[] args) {
        strangeList();
    }

    /*
    Создать список типа ArrayList<String>.
    Поместить в него как строки, так и целые числа.
    Пройти по списку, найти и удалить целые числа.
     */
    public static void strangeList(){
        ArrayList<Object> arr = new ArrayList<>();
        arr.add("Hola");
        arr.add("Amigo");
        arr.add(777);
        arr.add(2002);
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) instanceof Integer){
                arr.remove(i--);
            }
        }
        System.out.println(arr);
    }
}
