package lesson1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("Сегодня dd MMMM yyyy года, время HH:mm:ss");
        System.out.println(formatter.format(LocalDateTime.now()));
    }
}
