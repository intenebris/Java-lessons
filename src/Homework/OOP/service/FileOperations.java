package Homework.OOP.service;

import Homework.OOP.model.FamilyTree;

import java.io.IOException;

public interface FileOperations {

    void saveToFile(FamilyTree familyTree, String fileName) throws IOException;

    FamilyTree loadFromFile(String fileName) throws IOException, ClassNotFoundException;
}
