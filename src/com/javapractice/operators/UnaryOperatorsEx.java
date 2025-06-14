package com.javapractice.operators;

public class UnaryOperatorsEx {
    public static void main(String[] args) {
        int a = 11;
        int x = ++a; //Pre-increment

        System.out.println("Value of a after pre-increment: " + a); //12
        System.out.println("Value of x after pre-increment: " + x); //12

        int b = 21;
        int  y = --b; //Pre-decrement

        System.out.println("Value of b after pre-decrement: " + b); //20
        System.out.println("Value of y after pre-decrement: " + y); //20


        if(false) {
            y = --b;
            System.out.println("Value of b after pre-decrement: " + b); //19

            y = --b; //pre-decrement
            System.out.println("Value of b after post-decrement: " + b); //18


            //POST-INCREMENT & //POST-DECREMENT

            int c = 31;
            int z = c++; //Post-increment
            System.out.println("Value of c after post-increment: " + z); //31
            System.out.println("Value of c after post-increment: " + c); //32


            int d = 75;
            int w = d--;
            //Post-decrement
            System.out.println("Value of d after post-decrement: " + w); //75
            System.out.println("Value of d after post-decrement: " + d); //74


        }
        System.out.println("End");
    }
}
