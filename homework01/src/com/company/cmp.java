package com.company;

import java.util.Comparator;

class cmp implements Comparator<Student> {
    public int compare(Student a, Student b) {
        return Integer.compare(a.getId(),b.getId());
    }
}