package com.javapractice.arrays;

public class ArrayCreationExample {
    public static void main(String[] args) {

        //Primitive example - Requires Declaration & assignment
        int age; //Declaring a variable
        age = 25; //Assigment


        System.out.println("Age: " + age); //Output: Age: 25

        int maths = 60; //In a Single line Declarion & assignment
        int science = 70;
        int english = 65;
        int history = 55;
        int geography = 75;

        System.out.println("English marks: " + english);
        System.out.println("Maths marks: " + maths);
        System.out.println("Science marks: " + science);
        System.out.println("History marks: " + history);
        System.out.println("Geography marks: " + geography);


        int maths2 = 60;
        int science2 = 70;
        int english2 = 65;
        int history2 = 55;
        int geography2 = 75;

        System.out.println("English marks: " + english2);
        System.out.println("Maths marks: " + maths2);
        System.out.println("Science marks: " + science2);
        System.out.println("History marks: " + history2);
        System.out.println("Geography marks: " + geography2);



        //Assigning a value to the variable


        //Array - Non Primitive Datatype - Requires Declration, Initialization(new), Assignment


        // 1. Array Declaration and Initialization
        int[]  marks;

        //2. Array Initialization
        marks = new int[5];


        //Assignment
        marks[0] = 60;
        marks[1] = 70;
        marks[2] = 65;
        marks[3] =55;
        marks[4] = 75;


        //Declaration, Initialization and Assignment in a single line

        int [] student1Marks = {60,75,65,55,75};
        int[] student2Marks = {60, 85, 75, 35};
        int[] student3Marks = {34,55,66};


        //Accessing elements of the array using index
        System.out.println("2nd Students 4th element"+ student2Marks[3]); // Output: 35
        System.out.println("3rd Students 2nd element"+ student3Marks[1]); // Output: 55
        System.out.println("1st Student 2nd Element");
        System.out.println("1st Student 2nd Element: " + student1Marks[1]); // Output: 75
        System.out.println("1st Student 4th Element: " + student1Marks[3]); // Output: 65


        //Print the entire array
        System.out.println("Student 1 Marks: "+ student1Marks);
        System.out.println("Student 2 Marks: "+ student2Marks);
        System.out.println("Student 3 Marks: "+ student3Marks);

        //Print the length of the array
        System.out.println("Length of Student 1 Marks: " + student1Marks.length); // Output: 5
        System.out.println("Length of Student 2 Marks: " + student2Marks.length); // Output: 5
        System.out.println("Length of Student 3 Marks: " + student3Marks.length); // Output: 5


        //Iterating through the array using a for loopq
        for(int i=0; i<student1Marks.length; i++){
            System.out.println("Student Marks are "+ student1Marks[i]);
        }


        //Iterating through the array using a for-loop
        for(int i=0; i<student2Marks.length; i++){
            System.out.println("Student 2 Marks are "+ student2Marks[i]);
        }

        for(int i=0; i<student3Marks.length; i++){
            System.out.println("Student 3 Marks are "+ student3Marks[i]);
        }


        ////Iterating through the array using a for-each loop

        for(int mark: student1Marks){
            System.out.println("Student 1 Marks using for-each loop: " + mark);
        }





    }
}
