package com.strings;

public class Questions {

    public static void main(String[] args) {

        // ===============================
        // Q1: String Literals Comparison
        // ===============================
        String s1 = "java";
        String s2 = "java";

        System.out.println("Q1 (==)      : " + (s1 == s2));        // true
        System.out.println("Q1 (.equals): " + s1.equals(s2));      // true


        // ===============================
        // Q2: Using new Keyword
        // ===============================
        String s3 = new String("java");
        String s4 = new String("java");

        System.out.println("Q2 (==)      : " + (s3 == s4));        // false
        System.out.println("Q2 (.equals): " + s3.equals(s4));      // true


        // ===============================
        // Q3: Literal vs new Object
        // ===============================
        String s5 = "java";
        String s6 = new String("java");

        System.out.println("Q3 (==)      : " + (s5 == s6));        // false
        System.out.println("Q3 (.equals): " + s5.equals(s6));      // true
    }
}
