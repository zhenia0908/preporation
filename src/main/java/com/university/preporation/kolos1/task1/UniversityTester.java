package com.university.preporation.kolos1.task1;

import java.util.ArrayList;

public class UniversityTester {
    ArrayList<Teacher>teachers = new ArrayList<>();
    ArrayList<Student>students = new ArrayList<>();
    public  void addTeacher(Teacher teacher){
        teachers.add(teacher);
    }
    public void removeTeacher(Teacher teacher){
        teachers.remove(teacher);
    }
    public  void addStudent(Student student){
        students.add(student);
    }
    public void removeStudent(Student student){
        students.remove(student);
    }
    public void setMarks(){
        for(int i = 0;i<students.size();i++){
            students.get(i).setAvarageMark(students.get(i).middleGrade(students.get(i))) ;
        }
    }
    public void showListOfStudentsGrades(){
        System.out.println(String.format("%-20s%-20s%-20s%n", "Student", "Marks", "Kurses"));
        for(int i = 0;i<students.size();i++) {
            for (int j = 0; j < students.get(i).getStudentKurs().size(); j++) {
                System.out.println(String.format("%-20s%-20s%-20s%n", students.get(i).getName(), students.get(i).getAvarageMark(), students.get(i).getStudentKurs().get(j).getNameOfTheKurs()));
            }
        }
    }
    public  double avarageMark(){
        double middleMark = 0;
        double howManyMarks = 0;
        for(int i = 0;i<students.size();i++) {
            for (int j = 0; j < students.get(i).getStudentKurs().size(); j++) {
                middleMark += students.get(i).getAvarageMark();
                howManyMarks ++;
            }
        }
        return  middleMark/howManyMarks;
    }

    public static void main(String[] args) {
        UniversityTester tester = new UniversityTester();
        Teacher teacher = new Teacher("Ivan", "Ivanov");
        Student student = new Student("Petya", "Nowak");
        Teacher teacher1 = new Teacher("Nikita", "Kowalski");
        Student student1 = new Student("Pasha", "Belyj");
        Kurs kurs = new Kurs("math");
        Kurs kurs1 = new Kurs("fiziks");
        kurs.addGrades(5);
        kurs.addGrades(3);
        kurs1.addGrades(4);
        teacher.addKurs(kurs1);
        student.addKurs(kurs1);
        teacher1.addKurs(kurs);
        student1.addKurs(kurs);
        tester.addTeacher(teacher);
        tester.addStudent(student);
        tester.addTeacher(teacher1);
        tester.addStudent(student1);
        tester.setMarks();
        tester.showListOfStudentsGrades();
        System.out.println( tester.avarageMark());

    }
}
