package com.university.preporation.kolos1.task1;

import java.util.ArrayList;

public class Teacher extends Person {
    private ArrayList<Kurs> teacherKurs = new ArrayList<>();
    public Teacher(String name, String surname) {
        super(name, surname);
        this.teacherKurs = teacherKurs;
    }
    public void addKurs(Kurs kurs){
        teacherKurs.add(kurs);
    }
    public  void removeKurs(Kurs kurs){
       teacherKurs.remove(kurs);
    }
}
