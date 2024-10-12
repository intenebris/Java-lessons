package Homework.lesson4classes;

import java.util.LinkedList;

public class ListUtils {
    public int countOccurrences(LinkedList<String> strings, String str){
        int count = 0;
        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).contains(str)){
                count++;
            }
        }
        return count;
    }
}
