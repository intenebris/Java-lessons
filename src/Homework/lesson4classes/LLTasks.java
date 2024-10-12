package Homework.lesson4classes;

import java.util.LinkedList;

public class LLTasks {
    public void removeOddLengthStrings(LinkedList<String> ll){
        for (int i = 0; i < ll.size(); i++) {
            if (ll.get(i).length() % 2 != 0){
                ll.remove(i);
            }
        }
    }
}
