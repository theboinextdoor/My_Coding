//package com.company;

import java.util.Scanner;

public class StudentObject
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

//        this is when we don't declare any cunstructor in Student class.
//        Student s1= new Student();
//        System.out.println(s1);
//        s1.name= "Faraaz Ashraf";
//        s1.setId_num(230);

//        Student s2= new Student();
//        s2.name= "Aiman faraaz";
//        s2.setId_num(150);


//        System.out.println(s1.name+"\t"+ s1.getId_num());
//        System.out.println(s2.name+"\t"+s2.getId_num());

//        ----------------------------------------------------------------

//        this is when we create a constructure class in Student

        Student s1= new Student("Faraaz Ashraf", -1523);
        s1.print();

        Student s2= new Student(2315);
        s2.print();

//        System.out.println(Student.count);



    }

}
