package Homework.OOP.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class FamilyTree<T extends Person> implements Serializable, Iterable<T> {
    private static final long serialVersionUID = 1L;

    private List<T> people;

    public FamilyTree() {
        this.people = new ArrayList<>();
    }

    public void addPerson(T e){
        this.people.add(e);
    }

    public List<T> getChildren(T parent){
        return (List<T>) parent.getChildren();
    }

    public T findPersonByName(String name){
        for (T e : people) {
            if (e.getName().equals(name)){
                return e;
            }
        }
        return null;
    }

    public List<T> getPeople(){
        return people;
    }

    @Override
    public Iterator<T> iterator() {
        return people.iterator();
    }
    
    public void sortByName(){
        Collections.sort(people, (p1, p2) -> p1.getName().compareTo(p2.getName()));
    }
    
    public void sortByAge(){
        Collections.sort(people, (p1, p2) -> Integer.compare(p1.getAge(), p2.getAge()));
    }
    @Override
    public String toString() {
        return "Семья: " + people;
    }

}
