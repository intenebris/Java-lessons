package lesson1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        while(true){
            task();
        }
    }


    public static void task(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH");
        int now = Integer.parseInt(formatter.format(LocalDateTime.now()));
        Scanner sc = new Scanner(System.in);
        System.out.printf("Введите Ваше имя: ");
        String name = sc.next();
        if (name.startsWith("q")) System.exit(0);
        if(now >= 12 & now < 17){
            System.out.println("Добрый день, " + name + "!");
        } else if (now >= 4 & now < 12) {
            System.out.println("Доброе утро, " + name + "!");
        } else {
            System.out.println("Добрый вечер, " + name + "!");
        }
    }
}
