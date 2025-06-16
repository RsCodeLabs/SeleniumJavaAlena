package com.javapractice.variables;

public class LocalVariableExample {


    public static void main(String[] args) { // System defined Method
        int age =10; ;
        System.out.println("Value of age: " + age); // Output: Value of x: 10
      //  System.out.println("value of rollNum: " + rollNumber );
        LocalVariableExample localVariableExample = new LocalVariableExample();
        localVariableExample.display();
        localVariableExample.printSalary();
      //  display();
      //  printSalary();

    }


    public void display(){  //User defined method
        int rollNumber = 25;
        //System.out.println("Value of age: " + age); // This will cause a compile-time error because x is not accessible here
        System.out.println("value of rollNum: " + rollNumber );
    }


    public void printSalary(){
        int salary = 50000;
        System.out.println("Value of salary: " + salary); // This will cause a compile-time error because x is not accessible here
     //   System.out.println("value of rollNum: " + rollNumber );
      //  System.out.println("Age is"+age);
    }


}
