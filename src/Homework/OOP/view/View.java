package Homework.OOP.view;

import Homework.OOP.model.Person;

import java.util.List;

public interface View {
    void displayMessage(String message);
    void displayPersons(List<Person> persons);
    String getUserInput();
    void setPresenter();
}
