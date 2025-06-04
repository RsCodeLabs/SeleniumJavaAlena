package com.javapractice.dataTypes;

public class IdentifiersEx {
    public static void main(String[] args) {
        /* Rule 1 - Alphanumaric with special characters '_' and '$'        */


        String $studentName_123 = "Alena";
        System.out.println("Student Name: " + $studentName_123);

        //Invalid identifiers - having specials characters other than '_' and '$'
 /*       String student-Name = "Alena"; // Invalid identifier, '@' is not allowed
        String studentName@123 = "Alena"; // Invalid identifier, '@' is not allowed
*/


        /* Rule 2 - Cannot start with a digit */

        String studentName1 = "Alena"; // Valid identifier, starts with a letter
     //   String 1Student = "Alena"; // Invalid identifier, starts with a digit


        /* Rule 3 - Cannot use reserved keywords */
    /*    String class = "10th Grade"; // Invalid identifier, 'class' is a reserved keyword
        String studentClass = "10th Grade"; // Valid identifier, does not use reserved keyword
        String public = "Public"; // Invalid identifier, 'public' is a reserved keyword

*/











    }
}
