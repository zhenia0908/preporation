package com.university.preporation.kolos1.task1;

import java.util.ArrayList;

public class Student extends Person {
    private ArrayList<Kurs> studentKurs = new ArrayList<>();
    private double avarageMark;

    public ArrayList<Kurs> getStudentKurs() {
        return studentKurs;
    }

    public void setStudentKurs(ArrayList<Kurs> studentKurs) {
        this.studentKurs = studentKurs;
    }

    public double getAvarageMark() {
        return avarageMark;
    }

    public void setAvarageMark(double avarageMark) {
        this.avarageMark = avarageMark;
    }

    public Student(String name, String surname) {
        super(name, surname);
        this.studentKurs = studentKurs;
    }

    public void addKurs(Kurs kurs) {
        studentKurs.add(kurs);
    }

    public void removeKurs(Kurs kurs) {
        studentKurs.remove(kurs);
    }

    public double middleGrade(Student student) {
        double middleGrade = 0;
        double howManyGrades = 0;
        for (int i = 0; i < studentKurs.size(); i++) {
            for (int j = 0; j < studentKurs.get(i).getGrades().size(); j++) {
                middleGrade += studentKurs.get(i).getGrades().get(j);
                howManyGrades ++;
            }

        }
        return middleGrade / howManyGrades;
    }
}
