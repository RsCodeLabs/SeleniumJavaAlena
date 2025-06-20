package com.javapractice.arrays;

public class WalMartExample {
    public static void main(String[] args) {
        //Fruits - "Apple", "Banana", "Orange", "Mango", "Grapes"
        String[] fruits = {"Apple","Banana", "Cherry"};

      //  System.out.println(fruits[5]);

        System.out.println("Length of fruits array: " + fruits.length);

        //Books - "Java Programming", "Python Basics", "Data Structures", "Algorithms", "Web Development"

        String[] books = {"Java Programming", "Python Basics", "Data Structures", "Algorithms", "Web Development"};

        //Flowers - "Rose", "Tulip", "Lily", "Daisy", "Sunflower"

        String[] flowers = {"Rose", "Tulip", "Lily", "Daisy", "Sunflower"};

        for(int i =0; i< fruits.length; i++){
            System.out.println(fruits[i]);
        }

        System.out.println(fruits[2]);
        fruits[2]= "Grapes";
        books[1]="Java Basics";

        for(int i=0; i< books.length; i++){
            System.out.println(books[i]);
        }


        for(int i =0; i< fruits.length; i++){
            System.out.println(fruits[i]);
        }
    }
}
