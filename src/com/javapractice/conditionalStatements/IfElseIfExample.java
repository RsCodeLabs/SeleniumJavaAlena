package com.javapractice.conditionalStatements;

public class IfElseIfExample {
    public static void main(String[] args) {
        int marks = 45;

        if(marks>=90) {
            System.out.println("Grade: A");
        }else if(marks>=75) {
            System.out.println("Grade B");
        } else if(marks>=50){
            System.out.println("Grade c");
        }
        else{
            System.out.println("Grade D");
        }
    }
}
