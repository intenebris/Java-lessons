package Homework;

public class homework_lesson1 {
    public static void main(String[] args) {
        //Задание1. Нахождение факториала числа
        factorial(11); // <-- Раскомментируйте для проверки решения.

        //Задача2. Вывод всех четных чисел от 1 до 100
        //printEvenNums(); // <-- Раскомментируйте для проверки решения.

        //Задача3. Подсчет суммы цифр числа
        //sumDigits(2455); // <-- Раскомментируйте для проверки решения.

        //Задача4*. Нахождение максимального из трех чисел.
        //System.out.println(findMaxOfTwo(532,222)); // Функция 1 <-- Раскомментируйте для проверки решения.
        //System.out.println(findMaxOfThree(123, 4, 2000)); // Функция 2 <-- Раскомментируйте для проверки решения.
    }



//    Задание1. Нахождение факториала числа
//    Напишите метод factorial, который принимает число n и возвращает его факториал.
//    Если число n < 0,метод должен вернуть -1.
    public static void factorial(int n){
        int result = 1;
        if (n < 0) System.out.println("Факториал числа " + n + " = -1");
        if (n == 0) System.out.println("Факториал числа " + n + " = 0");
        if (n >= 1){
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            System.out.println("Факториал числа " + n + " = " + result);
        }
    }

//    Задача2. Вывод всех четных чисел от 1 до 100
//    Напишите метод printEvenNums, который выведет на экран
//    все четные числа в промежутке от 1 до 100,
//    каждое на новой строке.
    public static void printEvenNums(){
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }

//    Задача3. Подсчет суммы цифр числа
//    Напишите метод sumDigits, который принимает целое
//    число n и возвращает сумму его цифр.
    public static void sumDigits(int n) {
        int digit = n;
        int sum = 0;
        while (digit > 0){
            sum += digit % 10;
            digit = digit / 10;
        }
        System.out.println("Сумма всех цифр числа " + n + " равна " + sum);
    }


//    Задача4*. Нахождение максимального из трех чисел
//    Реализуйте дв ефункции:
//            1. Функция findMaxOfTwo должна принимать два числа и
//            возвращать максимальное из них, используя только знак сравнения.
//            2. Функция findMaxOfThree должна принимать три числа и
//            находить максимальное из них, используя первую функцию.
    public static int findMaxOfTwo(int a, int b) {
        int max_value = a;
        if (a < b){
            max_value = b;
        }
        return max_value;
    }

    public static int findMaxOfThree(int a, int b, int c){
        int max_value = findMaxOfTwo(a, b);
        if (max_value < c){
            max_value = c;
        }
        return max_value;
    }

}
