package com.javapractice.variables;


class Student{
    //Class? Mehod, variable
    String name;
    int rollNo;
    static String collegeName = "ABC College";
    static String location = "City Center";

    void display() {
        System.out.println("Name: " + name + ", Roll No: " + rollNo+ ", College: " + collegeName);
    }
}

public class instanceVariableStudent {

    public static void main(String[] args) {
        // System defined main method

        Student student1 = new Student();   // Creating an object of Student class
        student1.name="Alena";  // Assigning value to instance variable
        student1.rollNo=101;
        student1.display();


        Student student2 = new Student();
        student2.name="Benny";
        student2.rollNo=102;
        student2.display();

        // Changing static variable using class name
        Student.collegeName= "XYZ University"; //Assigning value to static variable
        Student.location= "Downtown";

        student1.display(); // calling the method using object
        student2.display();



    }
}
