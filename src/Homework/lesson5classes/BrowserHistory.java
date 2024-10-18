package Homework.lesson5classes;

import java.util.Deque;
import java.util.LinkedList;

public class BrowserHistory {
    public static Deque<String> browserHistory = new LinkedList<>();

    public static void visitSite(String site){
        browserHistory.addFirst(site);
    }

    public static Deque<String> getHistory(){
        return browserHistory;
    }

    public static String back(int steps){
        return browserHistory.stream().skip(steps).findFirst().toString();
    }
}
