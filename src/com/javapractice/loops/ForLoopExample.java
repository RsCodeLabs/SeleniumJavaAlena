package com.javapractice.loops;

public class ForLoopExample {
    public static void main(String[] args) {
        //Print number from 1  to 10 using traditional wAY
       /* System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);
        System.out.println(6);
        System.out.println(7);
        System.out.println(8);
        System.out.println(9);
        System.out.println(10);*/

        //Print number from 1 to 10 using for loop

        for(int i=1; i<=100;i++){

            if(i==55){
                continue;
            }
            System.out.println(i);
        }

    }
}
