package com.javapractice.operators;

public class LogicaclOperatosEx {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 10;
        System.out.println("And Operator Returns "+ ((a>=b)&&(a>=c)));
        System.out.println("And Operator Returns "+ ((a<=b)&&(a>=c)));
        System.out.println("Or Operator Returns "+ ((a>=b)||(a>=c))); // F || T = T
        System.out.println("Or Operator Returns "+ ((a<=b)||(a>=c))); // T || T = T
        System.out.println("Or Operator Returns "+ ((a>b)||(a<c))); // F || F = F
        System.out.println("Not Returns "+ (!(a<b))); // !T = F

    }
}
