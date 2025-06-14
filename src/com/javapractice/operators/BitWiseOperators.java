package com.javapractice.operators;

public class BitWiseOperators {
    public static void main(String[] args) {
        int a = 5; // 00000101 in binary
        int b= 3 ; // 00000011 in binary
        System.out.println("Bitwise AND: " + (a & b)); // Output: 1 (00000001)
        System.out.println("Bitwise OR: " + (a | b)); // Output: 7 (00000111)
    }
}
