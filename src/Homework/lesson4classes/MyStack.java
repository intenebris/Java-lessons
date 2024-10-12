package Homework.lesson4classes;

import java.util.Iterator;
import java.util.LinkedList;

public class MyStack {
    LinkedList<String> ll = new LinkedList<>();


    private boolean isEmpty(){
        return ll.size() == 0;
    }

    public void push(String element){
        ll.addFirst(element);
    }

    public String pop(){
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return ll.removeFirst();
    }

    public String peek(){
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return ll.peekFirst();
    }

    public String getElements(){
        if (isEmpty()) return " ";
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < ll.size(); i++) {
            builder.append(ll.get(i)).append(", ");
        }
        builder.delete(builder.length()-2, builder.length());
        return builder.toString();
    }
    @Override
    public String toString(){
        if (isEmpty()) return "[]";
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < ll.size(); i++) {
            builder.append(ll.get(i)).append(", ");
        }
        builder.delete(builder.length()-2, builder.length());
        return String.format("[%s]", builder);
    }
}
