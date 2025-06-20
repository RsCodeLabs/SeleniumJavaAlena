package com.javapractice.arrays;

public class TwoDArrayExample {
    public static void main(String[] args) {

        //Creation
        String[][] walMartItems ={

                {"Apples","Banana","Orange"},
                {"Lillys","Roses","Tulips"},
                {"JP","Pythion basics","Data Structures"}
        };


        //Assignment
        System.out.println("Roses: "+ walMartItems[1][1] );
        System.out.println("Data Structures: "+ walMartItems[2][1] );
        System.out.println("Before Update: " + walMartItems[2][0]);
        walMartItems[2][0] = "Java Programming";
        System.out.println("Updated Item: " + walMartItems[2][0]);


        //Traverse
        for(int i=0; i<walMartItems.length;i++){
           for(int j=0; j< walMartItems[i].length; j++ ){
               System.out.println(walMartItems[i][j]);
           }
        }


    }
}
