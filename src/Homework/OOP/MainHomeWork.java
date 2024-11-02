package Homework.OOP;

import java.io.File;
import java.io.IOException;

public class MainHomeWork {
    public static void main(String[] args) throws IOException {

        /* Создаем отдельных персон */
        Person vadim = new Person("Вадим","мужской", 32);
        Person oleg = new Person("Олег", "мужской", 25);
        Person anna = new Person("Анна","женский", 29);
        Person natalia = new Person("Наталия","женский", 23);
        Person sergey = new Person("Сергей","мужской", 5);
        Person larisa = new Person("Лариса","женский", 10);
        Person ulya = new Person("Юля", "женский",3);
        Person petya = new Person("Петя","мужской", 7);
        Person pavel = new Person("Павел","мужской", 57);
        Person maria = new Person("Мария","женский", 54);

        //Создаем семейные связи между людьми
        vadim.setFather(pavel); //записал в отцы
        vadim.setMother(maria); //записал в мать
        vadim.addChild(sergey); //добавил ребенка
        vadim.addChild(larisa); //добавил ребенка
        anna.addChild(sergey); //добавил ребенка
        anna.addChild(larisa); //добавил ребенка

        //Создает семейное дерево
        FamilyTree familyTree = new FamilyTree();

        familyTree.addPerson(vadim);
        familyTree.addPerson(pavel);
        familyTree.addPerson(maria);
        familyTree.addPerson(sergey);
        familyTree.addPerson(larisa);
        familyTree.addPerson(anna);


        // Создаем объект для работы с файлами
        FileOperationsImpl fileOperations = new FileOperationsImpl();
        // Сохраняем древо в файл
        try {
            fileOperations.saveToFile(familyTree, "./src/Homework/OOP/happy_family.dat");
            System.out.println("Семейное древо сохранено в файл");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Загружаем древо из файла
        FamilyTree loadedFamilyTree = new FamilyTree();
        loadedFamilyTree = null;

        try {
            loadedFamilyTree = fileOperations.loadFromFile("./src/Homework/OOP/happy_family.dat");
            System.out.println("Файл древа успешно загружен");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        if (loadedFamilyTree != null){
            System.out.println("Загруженное из файла: "+loadedFamilyTree.getPeople());
        }

        loadedFamilyTree.sortByName();
        System.out.println(loadedFamilyTree);

        loadedFamilyTree.sortByAge();
        System.out.println(loadedFamilyTree);
    }
}
