package com.university.preporation.kolos1.task1;

import java.util.ArrayList;

public class Kurs {
    private  ArrayList<Integer> grades = new ArrayList<>();
private String nameOfTheKurs;
    public Kurs(String nameOfTheKurs) {
       this.nameOfTheKurs = nameOfTheKurs;
       this.grades = grades;
    }

    public String getNameOfTheKurs() {
        return nameOfTheKurs;
    }

    public void setNameOfTheKurs(String nameOfTheKurs) {
        this.nameOfTheKurs = nameOfTheKurs;
    }

    public Kurs(){}
    public void addGrades(int grade){
        grades.add(grade);
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }
}
