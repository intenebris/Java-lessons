package Homework.lesson4classes;

import java.util.Deque;
import java.util.LinkedList;

public class DequeTasks {
    public Deque<Integer> rotateDeque(Deque<Integer> list, int n){
        Deque<Integer> temp = new LinkedList<>();
        if (n > 0){
            for (int i = 0; i < n; i++) {
                list.addFirst(list.getLast());
                list.removeLast();
            }
        }
        if (n < 0){
            n = -n;
            for (int i = 0; i < n; i++) {
                list.addLast(list.getFirst());
                list.removeFirst();
            }
        }
        return list;
    }

    public Deque<String> removeAllOccurrences(Deque<String> deque, String value){
        deque.removeIf(element -> element.equals(value));
        return deque;
    }
}
