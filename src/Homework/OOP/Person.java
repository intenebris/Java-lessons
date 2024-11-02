package Homework.OOP;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

//Класс, представляющий человека.
public class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private String gender;
    private int age;
    private Person father;
    private Person mother;
    private List<Person> children = new ArrayList<>();

    public Person(String name, String gender, int age) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Person getPerson() {
        return this;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Person getFather() {
        return father;
    }

    public Person getMother() {
        return mother;
    }

    public List<Person> getChildren() {
        return children;
    }

    public List<Person> getParents() {
        List<Person> parents = new ArrayList<>();
        parents.add(father);
        parents.add(mother);
        return parents;
    }

    public void setFather(Person nameFather) {
        this.father = nameFather;
        if (!nameFather.children.contains(this)){
            nameFather.addChild(this);
        }
    }

    public void setMother(Person nameMother) {
        this.mother = nameMother;
        if (!nameMother.children.contains(this)){
            nameMother.addChild(this);
        }
    }

    public void addChild(Person child){
        this.children.add(child);
        if (child.father == null && this.gender.equals("мужской")){
            child.setFather(this.getPerson());
        }
        if (child.mother == null && this.gender.equals("женский")){
            child.setMother(this.getPerson());
        }
    }

    public String returnNameParents(Person person){
        StringBuilder answer = new StringBuilder();
        if (person == null){
            answer.append("нет");
        } else {
            answer.append(person.name);
        }
        return answer.toString();
    }

    public String returnListChildren(List<Person> personList){
        StringBuilder answer = new StringBuilder();
        if (!personList.isEmpty()) {
            for (Person person : personList) {
                answer.append(person.name);
                answer.append(", ");
            }
            answer.deleteCharAt(answer.length()-1);
            answer.deleteCharAt(answer.length()-1);
        } else {
            answer.append("нет детей");
        }
        return answer.toString();
    }

    @Override
    public String toString() {
        return name + "{" +
                "возраст:" + age +
                ", отец:" + returnNameParents(father) +
                ", мать:" + returnNameParents(mother) +
                ", дети:" + returnListChildren(children) +
                '}';
    }
}
