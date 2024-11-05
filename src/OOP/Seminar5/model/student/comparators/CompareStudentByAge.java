package Seminar5.model.student.comparators;

import Seminar5.model.students_group.StudyElement;

import java.util.Comparator;

public class CompareStudentByAge<E extends StudyElement> implements Comparator<E> {
    @Override
    public int compare(E o1, E o2) {
//        return o2.getAge() - o1.getAge();
        return Integer.compare(o2.getAge(), o1.getAge());
    }
}
