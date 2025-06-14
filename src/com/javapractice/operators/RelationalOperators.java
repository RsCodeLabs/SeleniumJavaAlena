package com.javapractice.operators;

public class RelationalOperators {
    public static void main(String[] args) {
        int a = 10;
         int b = 20;
         int c = 10;
        System.out.println("Are Equal?"+ (a==b));  // Output: false
        System.out.println("Are Equal?"+ (a==c));   // Output: true
        System.out.println("Not Equal?"+ (a!=b));   // Output: true
        System.out.println("Greater than?"+ (a>b)); // Output: false
        System.out.println("Less than?"+ (a<b));    // Output: true

    }
}
