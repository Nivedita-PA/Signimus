package com.Nivedita.Task23;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        char c1 = o1.getFirstName().charAt(1);
        char c2 = o2.getFirstName().charAt(1);
        return Character.compare(c1,c2);
    }
}
