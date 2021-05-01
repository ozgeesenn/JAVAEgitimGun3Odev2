package com.company;

public class Main {

    public static void main(String[] args) {


        Student student=new Student();
        student.id=123;
        student.firstName="xx";
        student.lastName="yy";

        System.out.println("Öğrenci id: "+student.id+ " Öğrenci adi: "+ student.firstName+ " Öğrenci Soyadı: "+student.lastName);

        Instructor instructor=new Instructor();
        instructor.id=123;
        instructor.firstName="Engin";
        instructor.lastName="Demirog";

        System.out.println("Eğitmen id: "+instructor.id+ " Eğitmen adi: "+ instructor.firstName+ " Eğitmen Soyadı: "+instructor.lastName);

        StudentManager studentManager=new StudentManager(new UserManager());
        studentManager.Add("Öğrenci");





    }
}
