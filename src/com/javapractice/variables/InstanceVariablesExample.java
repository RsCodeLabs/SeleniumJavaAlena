package com.javapractice.variables;

public class InstanceVariablesExample {

    int age;
    float salary;
    int rollNumber;

    public static void main(String[] args) {

        InstanceVariablesExample object1=new InstanceVariablesExample();
        System.out.println("Age: " + object1.age); // Output: Age: 0
        System.out.println("Salary: " + object1.salary); // Output: Salary: 0
        System.out.println("Roll Number: " + object1.rollNumber); // Output: Roll Number: 0
        object1.age= 25;
        object1.salary= 50000.0f;
        object1.rollNumber= 101;
        System.out.println("Updated Age: " + object1.age +" Salary: " + object1.salary+ " Roll Number: " + object1.rollNumber); // Output: Updated Age: 25

        InstanceVariablesExample object2 = new InstanceVariablesExample();
        object2.age=30;
        object2.salary=60000.0f;
        object2.rollNumber=102;
        System.out.println("Object2 Age: " + object2.age + " Salary: " + object2.salary + " Roll Number: " + object2.rollNumber); // Output: Object2 Age: 30 Salary: 60000.0 Roll Number: 102

        object1.salary=70000.0f; // Updating salary of object1


        System.out.println("Updated Object1 Salary: " + object1.salary); // Output: Updated Object1 Salary: 70000.0


    }
}
