package com.javapractice.conditionalStatements;

public class TernaryExample {
    public static void main(String[] args) {
        int age = 34;
        String eligibility = (age >=18) ? "Eligible to Vote" : "Not Eligible to Vote";
        System.out.println(eligibility);
    }
}
