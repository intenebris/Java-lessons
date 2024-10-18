package lesson5;

import java.util.HashMap;
import java.util.Map;

/**
 * Написать метод, который переводит число из римского формата записи в арабский.
 * Например, MMXXIV = 2024
 */

public class Task3 {
    public static void main(String[] args) {
        String romanNumber = "IIX";
        System.out.println(convert(romanNumber));
    }

    private static final Map<String, Integer> romanToArabic = new HashMap<>(
            Map.of(
                    "I", 1,
                    "V", 5,
                    "X", 10,
                    "L", 50,
                    "C", 100,
                    "D", 500,
                    "M", 1000
            )
    );

    public static int convert(String romanNum){
        String firstNum = Character.toString(romanNum.charAt(0));
        int result = romanToArabic.get(firstNum);
        String[] arr = romanNum.split("");
        for (int i = 1; i < arr.length; i++) {
            int prevNum = romanToArabic.get(arr[i-1]);
            int currentNum = romanToArabic.get(arr[i]);
            if (currentNum > prevNum){
                result = result - prevNum + currentNum - prevNum;
            } else {
                result += currentNum;
            }
        }
        return result;
    }
}
