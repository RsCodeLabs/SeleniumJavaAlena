package com.javapractice.dataTypes;

public class IdentifiersExample {


    public static void main(String[] args) {
        // Valid identifiers
        String StudentName = "John"; // Valid: Starts with a letter and follows identifier rules
        int _count = 10; // Valid: Starts with an underscore, which is allowed
        double $value = 20.5; // Valid: Starts with a dollar sign, which is allowed
        int order_Quantity = 50; // Valid: Contains an underscore, which is allowed
        String empID2025 = "E12345"; // Valid: Contains letters, numbers, and no invalid characters

        // Invalid identifiers
        // int 1stRank = 1; // Invalid: Cannot start with a digit
        // double total#Amount = 100.0; // Invalid: Contains a special character (#), which is not allowed
        // float public = 5.5f; // Invalid: Uses a reserved keyword
        // int @price = 30; // Invalid: Contains a special character (@), which is not allowed
        // double float = 10.5; // Invalid: Uses a reserved keyword

        // Output valid identifiers
        System.out.println("Valid Identifier: " + StudentName);
        System.out.println("Valid Identifier: " + _count);
        System.out.println("Valid Identifier: " + $value);
        System.out.println("Valid Identifier: " + order_Quantity);
        System.out.println("Valid Identifier: " + empID2025);

      
    }
}